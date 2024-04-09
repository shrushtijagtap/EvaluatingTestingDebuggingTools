/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class StringBuilderFieldTest extends TestCase {static class __CLR4_1_10ziszislusqjz8x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,46075,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_codec_null() throws Exception {__CLR4_1_10ziszislusqjz8x.R.globalSliceStart(getClass().getName(),46036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105ncl18zis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ziszislusqjz8x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ziszislusqjz8x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringBuilderFieldTest.test_codec_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46036,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105ncl18zis() throws Exception{try{__CLR4_1_10ziszislusqjz8x.R.inc(46036);
        __CLR4_1_10ziszislusqjz8x.R.inc(46037);V0 v = new V0();

        __CLR4_1_10ziszislusqjz8x.R.inc(46038);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10ziszislusqjz8x.R.inc(46039);mapping.setAsmEnable(false);

        __CLR4_1_10ziszislusqjz8x.R.inc(46040);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_10ziszislusqjz8x.R.inc(46041);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_1_10ziszislusqjz8x.R.inc(46042);ParserConfig config = new ParserConfig();
        __CLR4_1_10ziszislusqjz8x.R.inc(46043);config.setAsmEnable(false);

        __CLR4_1_10ziszislusqjz8x.R.inc(46044);V0 v1 = JSON.parseObject(text, V0.class, config, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_1_10ziszislusqjz8x.R.inc(46045);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_1_10ziszislusqjz8x.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_1_10ziszislusqjz8x.R.globalSliceStart(getClass().getName(),46046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10prl16yzj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ziszislusqjz8x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ziszislusqjz8x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringBuilderFieldTest.test_codec_null_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46046,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10prl16yzj2() throws Exception{try{__CLR4_1_10ziszislusqjz8x.R.inc(46046);
        __CLR4_1_10ziszislusqjz8x.R.inc(46047);V0 v = new V0();

        __CLR4_1_10ziszislusqjz8x.R.inc(46048);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10ziszislusqjz8x.R.inc(46049);mapping.setAsmEnable(false);

        __CLR4_1_10ziszislusqjz8x.R.inc(46050);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue,
                                        SerializerFeature.WriteNullStringAsEmpty);
        __CLR4_1_10ziszislusqjz8x.R.inc(46051);Assert.assertEquals("{\"value\":\"\"}", text);
    }finally{__CLR4_1_10ziszislusqjz8x.R.flushNeeded();}}

    public void test_deserialize_1() throws Exception {__CLR4_1_10ziszislusqjz8x.R.globalSliceStart(getClass().getName(),46052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mpe34bzj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ziszislusqjz8x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ziszislusqjz8x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringBuilderFieldTest.test_deserialize_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46052,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mpe34bzj8() throws Exception{try{__CLR4_1_10ziszislusqjz8x.R.inc(46052);
        __CLR4_1_10ziszislusqjz8x.R.inc(46053);String json = "{\"value\":\"\"}";

        __CLR4_1_10ziszislusqjz8x.R.inc(46054);V0 vo = JSON.parseObject(json, V0.class);
        __CLR4_1_10ziszislusqjz8x.R.inc(46055);Assert.assertNotNull(vo.getValue());
        __CLR4_1_10ziszislusqjz8x.R.inc(46056);Assert.assertEquals("", vo.getValue().toString());
    }finally{__CLR4_1_10ziszislusqjz8x.R.flushNeeded();}}
    
    public void test_deserialize_2() throws Exception {__CLR4_1_10ziszislusqjz8x.R.globalSliceStart(getClass().getName(),46057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pye1wszjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ziszislusqjz8x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ziszislusqjz8x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringBuilderFieldTest.test_deserialize_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46057,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pye1wszjd() throws Exception{try{__CLR4_1_10ziszislusqjz8x.R.inc(46057);
        __CLR4_1_10ziszislusqjz8x.R.inc(46058);String json = "{\"value\":null}";

        __CLR4_1_10ziszislusqjz8x.R.inc(46059);V0 vo = JSON.parseObject(json, V0.class);
        __CLR4_1_10ziszislusqjz8x.R.inc(46060);Assert.assertNull(vo.getValue());
    }finally{__CLR4_1_10ziszislusqjz8x.R.flushNeeded();}}
    
    public void test_deserialize_3() throws Exception {__CLR4_1_10ziszislusqjz8x.R.globalSliceStart(getClass().getName(),46061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t7e0p9zjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ziszislusqjz8x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ziszislusqjz8x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringBuilderFieldTest.test_deserialize_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46061,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t7e0p9zjh() throws Exception{try{__CLR4_1_10ziszislusqjz8x.R.inc(46061);
        __CLR4_1_10ziszislusqjz8x.R.inc(46062);String json = "{\"value\":\"true\"}";

        __CLR4_1_10ziszislusqjz8x.R.inc(46063);V0 vo = JSON.parseObject(json, V0.class);
        __CLR4_1_10ziszislusqjz8x.R.inc(46064);Assert.assertNotNull(vo.getValue());
        __CLR4_1_10ziszislusqjz8x.R.inc(46065);Assert.assertEquals("true", vo.getValue().toString());
    }finally{__CLR4_1_10ziszislusqjz8x.R.flushNeeded();}}
    
    public void test_deserialize_4() throws Exception {__CLR4_1_10ziszislusqjz8x.R.globalSliceStart(getClass().getName(),46066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wgdzhqzjm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ziszislusqjz8x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ziszislusqjz8x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringBuilderFieldTest.test_deserialize_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),46066,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wgdzhqzjm() throws Exception{try{__CLR4_1_10ziszislusqjz8x.R.inc(46066);
        __CLR4_1_10ziszislusqjz8x.R.inc(46067);String json = "{\"value\":\"123\"}";

        __CLR4_1_10ziszislusqjz8x.R.inc(46068);V0 vo = JSON.parseObject(json, V0.class);
        __CLR4_1_10ziszislusqjz8x.R.inc(46069);Assert.assertNotNull(vo.getValue());
        __CLR4_1_10ziszislusqjz8x.R.inc(46070);Assert.assertEquals("123", vo.getValue().toString());
    }finally{__CLR4_1_10ziszislusqjz8x.R.flushNeeded();}}

    public static class V0 {

        private StringBuilder value;

        public StringBuilder getValue() {try{__CLR4_1_10ziszislusqjz8x.R.inc(46071);
            __CLR4_1_10ziszislusqjz8x.R.inc(46072);return value;
        }finally{__CLR4_1_10ziszislusqjz8x.R.flushNeeded();}}

        public void setValue(StringBuilder value) {try{__CLR4_1_10ziszislusqjz8x.R.inc(46073);
            __CLR4_1_10ziszislusqjz8x.R.inc(46074);this.value = value;
        }finally{__CLR4_1_10ziszislusqjz8x.R.flushNeeded();}}

    }
}
