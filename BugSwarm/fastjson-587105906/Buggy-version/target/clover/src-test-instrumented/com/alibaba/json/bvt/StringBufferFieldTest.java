/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class StringBufferFieldTest extends TestCase {static class __CLR4_1_10zhpzhplusqjz8k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,46036,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_codec_null() throws Exception {__CLR4_1_10zhpzhplusqjz8k.R.globalSliceStart(getClass().getName(),45997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105ncl18zhp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10zhpzhplusqjz8k.R.rethrow($CLV_t2$);}finally{__CLR4_1_10zhpzhplusqjz8k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringBufferFieldTest.test_codec_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45997,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105ncl18zhp() throws Exception{try{__CLR4_1_10zhpzhplusqjz8k.R.inc(45997);
        __CLR4_1_10zhpzhplusqjz8k.R.inc(45998);V0 v = new V0();

        __CLR4_1_10zhpzhplusqjz8k.R.inc(45999);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46000);mapping.setAsmEnable(false);

        __CLR4_1_10zhpzhplusqjz8k.R.inc(46001);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46002);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_1_10zhpzhplusqjz8k.R.inc(46003);ParserConfig config = new ParserConfig();
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46004);config.setAsmEnable(false);

        __CLR4_1_10zhpzhplusqjz8k.R.inc(46005);V0 v1 = JSON.parseObject(text, V0.class, config, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_1_10zhpzhplusqjz8k.R.inc(46006);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_1_10zhpzhplusqjz8k.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_1_10zhpzhplusqjz8k.R.globalSliceStart(getClass().getName(),46007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10prl16yzhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10zhpzhplusqjz8k.R.rethrow($CLV_t2$);}finally{__CLR4_1_10zhpzhplusqjz8k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringBufferFieldTest.test_codec_null_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46007,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10prl16yzhz() throws Exception{try{__CLR4_1_10zhpzhplusqjz8k.R.inc(46007);
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46008);V0 v = new V0();

        __CLR4_1_10zhpzhplusqjz8k.R.inc(46009);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46010);mapping.setAsmEnable(false);

        __CLR4_1_10zhpzhplusqjz8k.R.inc(46011);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue,
                                        SerializerFeature.WriteNullStringAsEmpty);
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46012);Assert.assertEquals("{\"value\":\"\"}", text);
    }finally{__CLR4_1_10zhpzhplusqjz8k.R.flushNeeded();}}

    public void test_deserialize_1() throws Exception {__CLR4_1_10zhpzhplusqjz8k.R.globalSliceStart(getClass().getName(),46013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mpe34bzi5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10zhpzhplusqjz8k.R.rethrow($CLV_t2$);}finally{__CLR4_1_10zhpzhplusqjz8k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringBufferFieldTest.test_deserialize_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46013,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mpe34bzi5() throws Exception{try{__CLR4_1_10zhpzhplusqjz8k.R.inc(46013);
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46014);String json = "{\"value\":\"\"}";

        __CLR4_1_10zhpzhplusqjz8k.R.inc(46015);V0 vo = JSON.parseObject(json, V0.class);
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46016);Assert.assertNotNull(vo.getValue());
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46017);Assert.assertEquals("", vo.getValue().toString());
    }finally{__CLR4_1_10zhpzhplusqjz8k.R.flushNeeded();}}
    
    public void test_deserialize_2() throws Exception {__CLR4_1_10zhpzhplusqjz8k.R.globalSliceStart(getClass().getName(),46018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pye1wszia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10zhpzhplusqjz8k.R.rethrow($CLV_t2$);}finally{__CLR4_1_10zhpzhplusqjz8k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringBufferFieldTest.test_deserialize_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46018,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pye1wszia() throws Exception{try{__CLR4_1_10zhpzhplusqjz8k.R.inc(46018);
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46019);String json = "{\"value\":null}";

        __CLR4_1_10zhpzhplusqjz8k.R.inc(46020);V0 vo = JSON.parseObject(json, V0.class);
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46021);Assert.assertNull(vo.getValue());
    }finally{__CLR4_1_10zhpzhplusqjz8k.R.flushNeeded();}}
    
    public void test_deserialize_3() throws Exception {__CLR4_1_10zhpzhplusqjz8k.R.globalSliceStart(getClass().getName(),46022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t7e0p9zie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10zhpzhplusqjz8k.R.rethrow($CLV_t2$);}finally{__CLR4_1_10zhpzhplusqjz8k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringBufferFieldTest.test_deserialize_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46022,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t7e0p9zie() throws Exception{try{__CLR4_1_10zhpzhplusqjz8k.R.inc(46022);
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46023);String json = "{\"value\":\"true\"}";

        __CLR4_1_10zhpzhplusqjz8k.R.inc(46024);V0 vo = JSON.parseObject(json, V0.class);
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46025);Assert.assertNotNull(vo.getValue());
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46026);Assert.assertEquals("true", vo.getValue().toString());
    }finally{__CLR4_1_10zhpzhplusqjz8k.R.flushNeeded();}}
    
    public void test_deserialize_4() throws Exception {__CLR4_1_10zhpzhplusqjz8k.R.globalSliceStart(getClass().getName(),46027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wgdzhqzij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10zhpzhplusqjz8k.R.rethrow($CLV_t2$);}finally{__CLR4_1_10zhpzhplusqjz8k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringBufferFieldTest.test_deserialize_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46027,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wgdzhqzij() throws Exception{try{__CLR4_1_10zhpzhplusqjz8k.R.inc(46027);
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46028);String json = "{\"value\":\"123\"}";

        __CLR4_1_10zhpzhplusqjz8k.R.inc(46029);V0 vo = JSON.parseObject(json, V0.class);
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46030);Assert.assertNotNull(vo.getValue());
        __CLR4_1_10zhpzhplusqjz8k.R.inc(46031);Assert.assertEquals("123", vo.getValue().toString());
    }finally{__CLR4_1_10zhpzhplusqjz8k.R.flushNeeded();}}

    public static class V0 {

        private StringBuffer value;

        public StringBuffer getValue() {try{__CLR4_1_10zhpzhplusqjz8k.R.inc(46032);
            __CLR4_1_10zhpzhplusqjz8k.R.inc(46033);return value;
        }finally{__CLR4_1_10zhpzhplusqjz8k.R.flushNeeded();}}

        public void setValue(StringBuffer value) {try{__CLR4_1_10zhpzhplusqjz8k.R.inc(46034);
            __CLR4_1_10zhpzhplusqjz8k.R.inc(46035);this.value = value;
        }finally{__CLR4_1_10zhpzhplusqjz8k.R.flushNeeded();}}

    }
}
