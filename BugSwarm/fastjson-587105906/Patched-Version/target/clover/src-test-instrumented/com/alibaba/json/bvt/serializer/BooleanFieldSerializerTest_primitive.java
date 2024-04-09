/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.lang.reflect.Type;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest.Entity;

public class BooleanFieldSerializerTest_primitive extends TestCase {static class __CLR4_5_21rfb1rfblusvnfzo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,82244,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() {__CLR4_5_21rfb1rfblusvnfzo.R.globalSliceStart(getClass().getName(),82199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21rfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rfb1rfblusvnfzo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rfb1rfblusvnfzo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest_primitive.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21rfb(){try{__CLR4_5_21rfb1rfblusvnfzo.R.inc(82199);
        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82200);Assert.assertEquals("{\"value\":false}", JSON.toJSONString(new Entity(), SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullBooleanAsFalse));
    }finally{__CLR4_5_21rfb1rfblusvnfzo.R.flushNeeded();}}

    public void test_codec_no_asm() throws Exception {__CLR4_5_21rfb1rfblusvnfzo.R.globalSliceStart(getClass().getName(),82201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yk0hx61rfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rfb1rfblusvnfzo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rfb1rfblusvnfzo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest_primitive.test_codec_no_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82201,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yk0hx61rfd() throws Exception{try{__CLR4_5_21rfb1rfblusvnfzo.R.inc(82201);
        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82202);Entity v = new Entity();

        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82203);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82204);mapping.setAsmEnable(false);

        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82205);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82206);Assert.assertEquals("{\"value\":false}", text);

        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82207);Entity v1 = JSON.parseObject(text, Entity.class);

        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82208);Assert.assertEquals(v.getValue(), v1.getValue());
    }finally{__CLR4_5_21rfb1rfblusvnfzo.R.flushNeeded();}}

    public void test_codec() throws Exception {__CLR4_5_21rfb1rfblusvnfzo.R.globalSliceStart(getClass().getName(),82209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nht31s1rfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rfb1rfblusvnfzo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rfb1rfblusvnfzo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest_primitive.test_codec",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82209,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nht31s1rfl() throws Exception{try{__CLR4_5_21rfb1rfblusvnfzo.R.inc(82209);
        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82210);Entity v1 = parseObjectNoAsm("{value:1}", Entity.class, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82211);Assert.assertEquals(true, v1.getValue());
    }finally{__CLR4_5_21rfb1rfblusvnfzo.R.flushNeeded();}}

    public void test_codec_0() throws Exception {__CLR4_5_21rfb1rfblusvnfzo.R.globalSliceStart(getClass().getName(),82212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ae7d7l1rfo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rfb1rfblusvnfzo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rfb1rfblusvnfzo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest_primitive.test_codec_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82212,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ae7d7l1rfo() throws Exception{try{__CLR4_5_21rfb1rfblusvnfzo.R.inc(82212);
        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82213);Entity v1 = parseObjectNoAsm("{value:0}", Entity.class, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82214);Assert.assertEquals(false, v1.getValue());
    }finally{__CLR4_5_21rfb1rfblusvnfzo.R.flushNeeded();}}

    public void test_codec_1() throws Exception {__CLR4_5_21rfb1rfblusvnfzo.R.globalSliceStart(getClass().getName(),82215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dn7c021rfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rfb1rfblusvnfzo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rfb1rfblusvnfzo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest_primitive.test_codec_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82215,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dn7c021rfr() throws Exception{try{__CLR4_5_21rfb1rfblusvnfzo.R.inc(82215);
        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82216);Entity v1 = parseObjectNoAsm("{value:'true'}", Entity.class, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82217);Assert.assertEquals(true, v1.getValue());
    }finally{__CLR4_5_21rfb1rfblusvnfzo.R.flushNeeded();}}

    public void test_codec_2() throws Exception {__CLR4_5_21rfb1rfblusvnfzo.R.globalSliceStart(getClass().getName(),82218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gw7asj1rfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rfb1rfblusvnfzo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rfb1rfblusvnfzo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest_primitive.test_codec_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82218,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gw7asj1rfu() throws Exception{try{__CLR4_5_21rfb1rfblusvnfzo.R.inc(82218);
        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82219);Entity v1 = parseObjectNoAsm("{value:null}", Entity.class, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82220);Assert.assertEquals(false, v1.getValue());
    }finally{__CLR4_5_21rfb1rfblusvnfzo.R.flushNeeded();}}
    
    public void test_codec_3() throws Exception {__CLR4_5_21rfb1rfblusvnfzo.R.globalSliceStart(getClass().getName(),82221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k579l01rfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rfb1rfblusvnfzo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rfb1rfblusvnfzo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest_primitive.test_codec_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82221,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k579l01rfx() throws Exception{try{__CLR4_5_21rfb1rfblusvnfzo.R.inc(82221);
        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82222);Entity v1 = parseObjectNoAsm("{value:\"\"}", Entity.class, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82223);Assert.assertEquals(false, v1.getValue());
    }finally{__CLR4_5_21rfb1rfblusvnfzo.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public static final <T> T parseObjectNoAsm(String input, Type clazz, int featureValues, Feature... features) {try{__CLR4_5_21rfb1rfblusvnfzo.R.inc(82224);
        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82225);if ((((input == null)&&(__CLR4_5_21rfb1rfblusvnfzo.R.iget(82226)!=0|true))||(__CLR4_5_21rfb1rfblusvnfzo.R.iget(82227)==0&false))) {{
            __CLR4_5_21rfb1rfblusvnfzo.R.inc(82228);return null;
        }

        }__CLR4_5_21rfb1rfblusvnfzo.R.inc(82229);for (Feature feature : features) {{
            __CLR4_5_21rfb1rfblusvnfzo.R.inc(82230);featureValues = Feature.config(featureValues, feature, true);
        }

        }__CLR4_5_21rfb1rfblusvnfzo.R.inc(82231);ParserConfig config = new ParserConfig();
        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82232);config.setAsmEnable(false);

        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82233);DefaultJSONParser parser = new DefaultJSONParser(input, config, featureValues);
        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82234);T value = (T) parser.parseObject(clazz);

        __CLR4_5_21rfb1rfblusvnfzo.R.inc(82235);if ((((clazz != JSONArray.class)&&(__CLR4_5_21rfb1rfblusvnfzo.R.iget(82236)!=0|true))||(__CLR4_5_21rfb1rfblusvnfzo.R.iget(82237)==0&false))) {{
            __CLR4_5_21rfb1rfblusvnfzo.R.inc(82238);parser.close();
        }

        }__CLR4_5_21rfb1rfblusvnfzo.R.inc(82239);return (T) value;
    }finally{__CLR4_5_21rfb1rfblusvnfzo.R.flushNeeded();}}

    public static class Entity {

        private boolean value;

        public boolean getValue() {try{__CLR4_5_21rfb1rfblusvnfzo.R.inc(82240);
            __CLR4_5_21rfb1rfblusvnfzo.R.inc(82241);return value;
        }finally{__CLR4_5_21rfb1rfblusvnfzo.R.flushNeeded();}}

        public void setValue(boolean value) {try{__CLR4_5_21rfb1rfblusvnfzo.R.inc(82242);
            __CLR4_5_21rfb1rfblusvnfzo.R.inc(82243);this.value = value;
        }finally{__CLR4_5_21rfb1rfblusvnfzo.R.flushNeeded();}}

    }
}
