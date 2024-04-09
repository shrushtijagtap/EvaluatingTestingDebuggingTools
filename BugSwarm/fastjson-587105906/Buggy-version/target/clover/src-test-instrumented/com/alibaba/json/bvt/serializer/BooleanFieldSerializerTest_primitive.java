/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

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

public class BooleanFieldSerializerTest_primitive extends TestCase {static class __CLR4_1_101qhe1qhelusqkj5q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,81023,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() {__CLR4_1_101qhe1qhelusqkj5q.R.globalSliceStart(getClass().getName(),80978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21qhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qhe1qhelusqkj5q.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qhe1qhelusqkj5q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest_primitive.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80978,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21qhe(){try{__CLR4_1_101qhe1qhelusqkj5q.R.inc(80978);
        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80979);Assert.assertEquals("{\"value\":false}", JSON.toJSONString(new Entity(), SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullBooleanAsFalse));
    }finally{__CLR4_1_101qhe1qhelusqkj5q.R.flushNeeded();}}

    public void test_codec_no_asm() throws Exception {__CLR4_1_101qhe1qhelusqkj5q.R.globalSliceStart(getClass().getName(),80980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yk0hx61qhg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qhe1qhelusqkj5q.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qhe1qhelusqkj5q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest_primitive.test_codec_no_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80980,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yk0hx61qhg() throws Exception{try{__CLR4_1_101qhe1qhelusqkj5q.R.inc(80980);
        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80981);Entity v = new Entity();

        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80982);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80983);mapping.setAsmEnable(false);

        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80984);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80985);Assert.assertEquals("{\"value\":false}", text);

        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80986);Entity v1 = JSON.parseObject(text, Entity.class);

        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80987);Assert.assertEquals(v.getValue(), v1.getValue());
    }finally{__CLR4_1_101qhe1qhelusqkj5q.R.flushNeeded();}}

    public void test_codec() throws Exception {__CLR4_1_101qhe1qhelusqkj5q.R.globalSliceStart(getClass().getName(),80988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nht31s1qho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qhe1qhelusqkj5q.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qhe1qhelusqkj5q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest_primitive.test_codec",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80988,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nht31s1qho() throws Exception{try{__CLR4_1_101qhe1qhelusqkj5q.R.inc(80988);
        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80989);Entity v1 = parseObjectNoAsm("{value:1}", Entity.class, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80990);Assert.assertEquals(true, v1.getValue());
    }finally{__CLR4_1_101qhe1qhelusqkj5q.R.flushNeeded();}}

    public void test_codec_0() throws Exception {__CLR4_1_101qhe1qhelusqkj5q.R.globalSliceStart(getClass().getName(),80991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ae7d7l1qhr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qhe1qhelusqkj5q.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qhe1qhelusqkj5q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest_primitive.test_codec_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80991,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ae7d7l1qhr() throws Exception{try{__CLR4_1_101qhe1qhelusqkj5q.R.inc(80991);
        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80992);Entity v1 = parseObjectNoAsm("{value:0}", Entity.class, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80993);Assert.assertEquals(false, v1.getValue());
    }finally{__CLR4_1_101qhe1qhelusqkj5q.R.flushNeeded();}}

    public void test_codec_1() throws Exception {__CLR4_1_101qhe1qhelusqkj5q.R.globalSliceStart(getClass().getName(),80994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dn7c021qhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qhe1qhelusqkj5q.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qhe1qhelusqkj5q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest_primitive.test_codec_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80994,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dn7c021qhu() throws Exception{try{__CLR4_1_101qhe1qhelusqkj5q.R.inc(80994);
        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80995);Entity v1 = parseObjectNoAsm("{value:'true'}", Entity.class, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80996);Assert.assertEquals(true, v1.getValue());
    }finally{__CLR4_1_101qhe1qhelusqkj5q.R.flushNeeded();}}

    public void test_codec_2() throws Exception {__CLR4_1_101qhe1qhelusqkj5q.R.globalSliceStart(getClass().getName(),80997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gw7asj1qhx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qhe1qhelusqkj5q.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qhe1qhelusqkj5q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest_primitive.test_codec_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80997,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gw7asj1qhx() throws Exception{try{__CLR4_1_101qhe1qhelusqkj5q.R.inc(80997);
        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80998);Entity v1 = parseObjectNoAsm("{value:null}", Entity.class, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_1_101qhe1qhelusqkj5q.R.inc(80999);Assert.assertEquals(false, v1.getValue());
    }finally{__CLR4_1_101qhe1qhelusqkj5q.R.flushNeeded();}}
    
    public void test_codec_3() throws Exception {__CLR4_1_101qhe1qhelusqkj5q.R.globalSliceStart(getClass().getName(),81000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10k579l01qi0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qhe1qhelusqkj5q.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qhe1qhelusqkj5q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldSerializerTest_primitive.test_codec_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81000,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10k579l01qi0() throws Exception{try{__CLR4_1_101qhe1qhelusqkj5q.R.inc(81000);
        __CLR4_1_101qhe1qhelusqkj5q.R.inc(81001);Entity v1 = parseObjectNoAsm("{value:\"\"}", Entity.class, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_1_101qhe1qhelusqkj5q.R.inc(81002);Assert.assertEquals(false, v1.getValue());
    }finally{__CLR4_1_101qhe1qhelusqkj5q.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public static final <T> T parseObjectNoAsm(String input, Type clazz, int featureValues, Feature... features) {try{__CLR4_1_101qhe1qhelusqkj5q.R.inc(81003);
        __CLR4_1_101qhe1qhelusqkj5q.R.inc(81004);if ((((input == null)&&(__CLR4_1_101qhe1qhelusqkj5q.R.iget(81005)!=0|true))||(__CLR4_1_101qhe1qhelusqkj5q.R.iget(81006)==0&false))) {{
            __CLR4_1_101qhe1qhelusqkj5q.R.inc(81007);return null;
        }

        }__CLR4_1_101qhe1qhelusqkj5q.R.inc(81008);for (Feature feature : features) {{
            __CLR4_1_101qhe1qhelusqkj5q.R.inc(81009);featureValues = Feature.config(featureValues, feature, true);
        }

        }__CLR4_1_101qhe1qhelusqkj5q.R.inc(81010);ParserConfig config = new ParserConfig();
        __CLR4_1_101qhe1qhelusqkj5q.R.inc(81011);config.setAsmEnable(false);

        __CLR4_1_101qhe1qhelusqkj5q.R.inc(81012);DefaultJSONParser parser = new DefaultJSONParser(input, config, featureValues);
        __CLR4_1_101qhe1qhelusqkj5q.R.inc(81013);T value = (T) parser.parseObject(clazz);

        __CLR4_1_101qhe1qhelusqkj5q.R.inc(81014);if ((((clazz != JSONArray.class)&&(__CLR4_1_101qhe1qhelusqkj5q.R.iget(81015)!=0|true))||(__CLR4_1_101qhe1qhelusqkj5q.R.iget(81016)==0&false))) {{
            __CLR4_1_101qhe1qhelusqkj5q.R.inc(81017);parser.close();
        }

        }__CLR4_1_101qhe1qhelusqkj5q.R.inc(81018);return (T) value;
    }finally{__CLR4_1_101qhe1qhelusqkj5q.R.flushNeeded();}}

    public static class Entity {

        private boolean value;

        public boolean getValue() {try{__CLR4_1_101qhe1qhelusqkj5q.R.inc(81019);
            __CLR4_1_101qhe1qhelusqkj5q.R.inc(81020);return value;
        }finally{__CLR4_1_101qhe1qhelusqkj5q.R.flushNeeded();}}

        public void setValue(boolean value) {try{__CLR4_1_101qhe1qhelusqkj5q.R.inc(81021);
            __CLR4_1_101qhe1qhelusqkj5q.R.inc(81022);this.value = value;
        }finally{__CLR4_1_101qhe1qhelusqkj5q.R.flushNeeded();}}

    }
}
