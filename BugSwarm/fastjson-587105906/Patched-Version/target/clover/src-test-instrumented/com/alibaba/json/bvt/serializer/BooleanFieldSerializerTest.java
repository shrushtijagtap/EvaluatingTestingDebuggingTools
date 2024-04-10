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

public class BooleanFieldSerializerTest extends TestCase {static class __CLR4_5_21qfz1qfzlusyjusc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,80967,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() {__CLR4_5_21qfz1qfzlusyjusc.R.globalSliceStart(getClass().getName(),80927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21qfz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qfz1qfzlusyjusc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qfz1qfzlusyjusc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80927,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21qfz(){try{__CLR4_5_21qfz1qfzlusyjusc.R.inc(80927);
        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80928);Assert.assertEquals("{\"value\":null}", JSON.toJSONString(new Entity(), SerializerFeature.WriteMapNullValue));
        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80929);Assert.assertEquals("{\"value\":false}", JSON.toJSONString(new Entity(), SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullBooleanAsFalse));
    }finally{__CLR4_5_21qfz1qfzlusyjusc.R.flushNeeded();}}

    public void test_codec_no_asm() throws Exception {__CLR4_5_21qfz1qfzlusyjusc.R.globalSliceStart(getClass().getName(),80930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yk0hx61qg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qfz1qfzlusyjusc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qfz1qfzlusyjusc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest.test_codec_no_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80930,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yk0hx61qg2() throws Exception{try{__CLR4_5_21qfz1qfzlusyjusc.R.inc(80930);
        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80931);Entity v = new Entity();

        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80932);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80933);mapping.setAsmEnable(false);

        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80934);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80935);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80936);Entity v1 = parseObjectNoAsm(text, Entity.class, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80937);Assert.assertEquals(v.getValue(), v1.getValue());
    }finally{__CLR4_5_21qfz1qfzlusyjusc.R.flushNeeded();}}

    public void test_codec() throws Exception {__CLR4_5_21qfz1qfzlusyjusc.R.globalSliceStart(getClass().getName(),80938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nht31s1qga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qfz1qfzlusyjusc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qfz1qfzlusyjusc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest.test_codec",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80938,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nht31s1qga() throws Exception{try{__CLR4_5_21qfz1qfzlusyjusc.R.inc(80938);
        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80939);Entity v1 = parseObjectNoAsm("{value:1}", Entity.class, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80940);Assert.assertEquals(true, v1.getValue());
    }finally{__CLR4_5_21qfz1qfzlusyjusc.R.flushNeeded();}}
    
    public void test_codec_0() throws Exception {__CLR4_5_21qfz1qfzlusyjusc.R.globalSliceStart(getClass().getName(),80941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ae7d7l1qgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qfz1qfzlusyjusc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qfz1qfzlusyjusc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest.test_codec_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80941,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ae7d7l1qgd() throws Exception{try{__CLR4_5_21qfz1qfzlusyjusc.R.inc(80941);
        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80942);Entity v1 = parseObjectNoAsm("{value:0}", Entity.class, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80943);Assert.assertEquals(false, v1.getValue());
    }finally{__CLR4_5_21qfz1qfzlusyjusc.R.flushNeeded();}}

    public void test_codec_1() throws Exception {__CLR4_5_21qfz1qfzlusyjusc.R.globalSliceStart(getClass().getName(),80944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dn7c021qgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qfz1qfzlusyjusc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qfz1qfzlusyjusc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest.test_codec_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dn7c021qgg() throws Exception{try{__CLR4_5_21qfz1qfzlusyjusc.R.inc(80944);
        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80945);Entity v1 = parseObjectNoAsm("{value:'true'}", Entity.class, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80946);Assert.assertEquals(true, v1.getValue());
    }finally{__CLR4_5_21qfz1qfzlusyjusc.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public static final <T> T parseObjectNoAsm(String input, Type clazz, int featureValues, Feature... features) {try{__CLR4_5_21qfz1qfzlusyjusc.R.inc(80947);
        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80948);if ((((input == null)&&(__CLR4_5_21qfz1qfzlusyjusc.R.iget(80949)!=0|true))||(__CLR4_5_21qfz1qfzlusyjusc.R.iget(80950)==0&false))) {{
            __CLR4_5_21qfz1qfzlusyjusc.R.inc(80951);return null;
        }

        }__CLR4_5_21qfz1qfzlusyjusc.R.inc(80952);for (Feature feature : features) {{
            __CLR4_5_21qfz1qfzlusyjusc.R.inc(80953);featureValues = Feature.config(featureValues, feature, true);
        }

        }__CLR4_5_21qfz1qfzlusyjusc.R.inc(80954);ParserConfig config = new ParserConfig();
        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80955);config.setAsmEnable(false);

        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80956);DefaultJSONParser parser = new DefaultJSONParser(input, config, featureValues);
        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80957);T value = (T) parser.parseObject(clazz);

        __CLR4_5_21qfz1qfzlusyjusc.R.inc(80958);if ((((clazz != JSONArray.class)&&(__CLR4_5_21qfz1qfzlusyjusc.R.iget(80959)!=0|true))||(__CLR4_5_21qfz1qfzlusyjusc.R.iget(80960)==0&false))) {{
            __CLR4_5_21qfz1qfzlusyjusc.R.inc(80961);parser.close();
        }

        }__CLR4_5_21qfz1qfzlusyjusc.R.inc(80962);return (T) value;
    }finally{__CLR4_5_21qfz1qfzlusyjusc.R.flushNeeded();}}

    public static class Entity {

        private Boolean value;

        public Boolean getValue() {try{__CLR4_5_21qfz1qfzlusyjusc.R.inc(80963);
            __CLR4_5_21qfz1qfzlusyjusc.R.inc(80964);return value;
        }finally{__CLR4_5_21qfz1qfzlusyjusc.R.flushNeeded();}}

        public void setValue(Boolean value) {try{__CLR4_5_21qfz1qfzlusyjusc.R.inc(80965);
            __CLR4_5_21qfz1qfzlusyjusc.R.inc(80966);this.value = value;
        }finally{__CLR4_5_21qfz1qfzlusyjusc.R.flushNeeded();}}

    }
}
