/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.date;

import java.util.Date;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class DateFieldTest5 extends TestCase {static class __CLR4_5_219p319p3lusvn93i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,59275,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_codec() throws Exception {__CLR4_5_219p319p3lusvn93i.R.globalSliceStart(getClass().getName(),59223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nht31s19p3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219p319p3lusvn93i.R.rethrow($CLV_t2$);}finally{__CLR4_5_219p319p3lusvn93i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest5.test_codec",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59223,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nht31s19p3() throws Exception{try{__CLR4_5_219p319p3lusvn93i.R.inc(59223);
        __CLR4_5_219p319p3lusvn93i.R.inc(59224);SerializeConfig mapping = new SerializeConfig();

        __CLR4_5_219p319p3lusvn93i.R.inc(59225);V0 v = new V0();
        __CLR4_5_219p319p3lusvn93i.R.inc(59226);v.setValue(new Date());

        __CLR4_5_219p319p3lusvn93i.R.inc(59227);String text = JSON.toJSONString(v, mapping);

        __CLR4_5_219p319p3lusvn93i.R.inc(59228);Assert.assertEquals("{\"value\":" + v.getValue().getTime() + "}", text);
    }finally{__CLR4_5_219p319p3lusvn93i.R.flushNeeded();}}

    public void test_codec_no_asm() throws Exception {__CLR4_5_219p319p3lusvn93i.R.globalSliceStart(getClass().getName(),59229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yk0hx619p9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219p319p3lusvn93i.R.rethrow($CLV_t2$);}finally{__CLR4_5_219p319p3lusvn93i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest5.test_codec_no_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59229,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yk0hx619p9() throws Exception{try{__CLR4_5_219p319p3lusvn93i.R.inc(59229);
        __CLR4_5_219p319p3lusvn93i.R.inc(59230);V0 v = new V0();
        __CLR4_5_219p319p3lusvn93i.R.inc(59231);v.setValue(new Date());

        __CLR4_5_219p319p3lusvn93i.R.inc(59232);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_219p319p3lusvn93i.R.inc(59233);mapping.setAsmEnable(false);

        __CLR4_5_219p319p3lusvn93i.R.inc(59234);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_219p319p3lusvn93i.R.inc(59235);Assert.assertEquals("{\"value\":" + v.getValue().getTime() + "}", text);
    }finally{__CLR4_5_219p319p3lusvn93i.R.flushNeeded();}}

    public void test_codec_asm() throws Exception {__CLR4_5_219p319p3lusvn93i.R.globalSliceStart(getClass().getName(),59236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhvxfw19pg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219p319p3lusvn93i.R.rethrow($CLV_t2$);}finally{__CLR4_5_219p319p3lusvn93i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest5.test_codec_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59236,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhvxfw19pg() throws Exception{try{__CLR4_5_219p319p3lusvn93i.R.inc(59236);
        __CLR4_5_219p319p3lusvn93i.R.inc(59237);V0 v = new V0();
        __CLR4_5_219p319p3lusvn93i.R.inc(59238);v.setValue(new Date());

        __CLR4_5_219p319p3lusvn93i.R.inc(59239);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_219p319p3lusvn93i.R.inc(59240);mapping.setAsmEnable(true);

        __CLR4_5_219p319p3lusvn93i.R.inc(59241);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_219p319p3lusvn93i.R.inc(59242);Assert.assertEquals("{\"value\":" + v.getValue().getTime() + "}", text);
    }finally{__CLR4_5_219p319p3lusvn93i.R.flushNeeded();}}

    public void test_codec_null_asm() throws Exception {__CLR4_5_219p319p3lusvn93i.R.globalSliceStart(getClass().getName(),59243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297oyf419pn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219p319p3lusvn93i.R.rethrow($CLV_t2$);}finally{__CLR4_5_219p319p3lusvn93i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest5.test_codec_null_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59243,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297oyf419pn() throws Exception{try{__CLR4_5_219p319p3lusvn93i.R.inc(59243);
        __CLR4_5_219p319p3lusvn93i.R.inc(59244);V0 v = new V0();

        __CLR4_5_219p319p3lusvn93i.R.inc(59245);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_219p319p3lusvn93i.R.inc(59246);mapping.setAsmEnable(true);

        __CLR4_5_219p319p3lusvn93i.R.inc(59247);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_219p319p3lusvn93i.R.inc(59248);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_219p319p3lusvn93i.R.inc(59249);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_219p319p3lusvn93i.R.inc(59250);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_219p319p3lusvn93i.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_5_219p319p3lusvn93i.R.globalSliceStart(getClass().getName(),59251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2prl16y19pv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219p319p3lusvn93i.R.rethrow($CLV_t2$);}finally{__CLR4_5_219p319p3lusvn93i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest5.test_codec_null_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59251,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2prl16y19pv() throws Exception{try{__CLR4_5_219p319p3lusvn93i.R.inc(59251);
        __CLR4_5_219p319p3lusvn93i.R.inc(59252);V0 v = new V0();

        __CLR4_5_219p319p3lusvn93i.R.inc(59253);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_219p319p3lusvn93i.R.inc(59254);mapping.setAsmEnable(false);

        __CLR4_5_219p319p3lusvn93i.R.inc(59255);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero);
        __CLR4_5_219p319p3lusvn93i.R.inc(59256);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_219p319p3lusvn93i.R.inc(59257);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_219p319p3lusvn93i.R.inc(59258);Assert.assertEquals(null, v1.getValue());
    }finally{__CLR4_5_219p319p3lusvn93i.R.flushNeeded();}}

    public static class V0 {

        private Date value;

        @JSONField(format = " ")
        public Date getValue() {try{__CLR4_5_219p319p3lusvn93i.R.inc(59259);
            __CLR4_5_219p319p3lusvn93i.R.inc(59260);return value;
        }finally{__CLR4_5_219p319p3lusvn93i.R.flushNeeded();}}

        public void setValue(Date value) {try{__CLR4_5_219p319p3lusvn93i.R.inc(59261);
            __CLR4_5_219p319p3lusvn93i.R.inc(59262);this.value = value;
        }finally{__CLR4_5_219p319p3lusvn93i.R.flushNeeded();}}

        public boolean is() {try{__CLR4_5_219p319p3lusvn93i.R.inc(59263);
            __CLR4_5_219p319p3lusvn93i.R.inc(59264);return true;
        }finally{__CLR4_5_219p319p3lusvn93i.R.flushNeeded();}}

        public boolean isa() {try{__CLR4_5_219p319p3lusvn93i.R.inc(59265);
            __CLR4_5_219p319p3lusvn93i.R.inc(59266);return true;
        }finally{__CLR4_5_219p319p3lusvn93i.R.flushNeeded();}}

        public Object get() {try{__CLR4_5_219p319p3lusvn93i.R.inc(59267);
            __CLR4_5_219p319p3lusvn93i.R.inc(59268);return true;
        }finally{__CLR4_5_219p319p3lusvn93i.R.flushNeeded();}}

        public Object geta() {try{__CLR4_5_219p319p3lusvn93i.R.inc(59269);
            __CLR4_5_219p319p3lusvn93i.R.inc(59270);return true;
        }finally{__CLR4_5_219p319p3lusvn93i.R.flushNeeded();}}

        @JSONField(serialize = false)
        public Object getA() {try{__CLR4_5_219p319p3lusvn93i.R.inc(59271);
            __CLR4_5_219p319p3lusvn93i.R.inc(59272);return true;
        }finally{__CLR4_5_219p319p3lusvn93i.R.flushNeeded();}}
        
        public static Object getB() {try{__CLR4_5_219p319p3lusvn93i.R.inc(59273);
            __CLR4_5_219p319p3lusvn93i.R.inc(59274);return true;
        }finally{__CLR4_5_219p319p3lusvn93i.R.flushNeeded();}}

    }
}
