/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

public class DateFieldTest3 extends TestCase {static class __CLR4_5_219m019m0lusvn92y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,59174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_219m019m0lusvn92y.R.inc(59112);
        __CLR4_5_219m019m0lusvn92y.R.inc(59113);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_219m019m0lusvn92y.R.inc(59114);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_219m019m0lusvn92y.R.flushNeeded();}}
    
    public void test_codec() throws Exception {__CLR4_5_219m019m0lusvn92y.R.globalSliceStart(getClass().getName(),59115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nht31s19m3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219m019m0lusvn92y.R.rethrow($CLV_t2$);}finally{__CLR4_5_219m019m0lusvn92y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest3.test_codec",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59115,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nht31s19m3() throws Exception{try{__CLR4_5_219m019m0lusvn92y.R.inc(59115);
        __CLR4_5_219m019m0lusvn92y.R.inc(59116);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_219m019m0lusvn92y.R.inc(59117);mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));

        __CLR4_5_219m019m0lusvn92y.R.inc(59118);V0 v = new V0();
        __CLR4_5_219m019m0lusvn92y.R.inc(59119);v.setValue(new Date());

        __CLR4_5_219m019m0lusvn92y.R.inc(59120);String text = JSON.toJSONString(v, mapping);

        __CLR4_5_219m019m0lusvn92y.R.inc(59121);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_5_219m019m0lusvn92y.R.inc(59122);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_219m019m0lusvn92y.R.inc(59123);Assert.assertEquals("{\"value\":" + JSON.toJSONString(format.format(v.getValue())) + "}", text);
    }finally{__CLR4_5_219m019m0lusvn92y.R.flushNeeded();}}

    public void test_codec_no_asm() throws Exception {__CLR4_5_219m019m0lusvn92y.R.globalSliceStart(getClass().getName(),59124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yk0hx619mc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219m019m0lusvn92y.R.rethrow($CLV_t2$);}finally{__CLR4_5_219m019m0lusvn92y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest3.test_codec_no_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59124,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yk0hx619mc() throws Exception{try{__CLR4_5_219m019m0lusvn92y.R.inc(59124);
        __CLR4_5_219m019m0lusvn92y.R.inc(59125);V0 v = new V0();
        __CLR4_5_219m019m0lusvn92y.R.inc(59126);v.setValue(new Date());

        __CLR4_5_219m019m0lusvn92y.R.inc(59127);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_219m019m0lusvn92y.R.inc(59128);mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));
        __CLR4_5_219m019m0lusvn92y.R.inc(59129);mapping.setAsmEnable(false);

        __CLR4_5_219m019m0lusvn92y.R.inc(59130);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_219m019m0lusvn92y.R.inc(59131);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_5_219m019m0lusvn92y.R.inc(59132);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_219m019m0lusvn92y.R.inc(59133);Assert.assertEquals("{\"value\":" + JSON.toJSONString(format.format(v.getValue())) + "}", text);
    }finally{__CLR4_5_219m019m0lusvn92y.R.flushNeeded();}}
    
    public void test_codec_asm() throws Exception {__CLR4_5_219m019m0lusvn92y.R.globalSliceStart(getClass().getName(),59134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhvxfw19mm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219m019m0lusvn92y.R.rethrow($CLV_t2$);}finally{__CLR4_5_219m019m0lusvn92y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest3.test_codec_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59134,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhvxfw19mm() throws Exception{try{__CLR4_5_219m019m0lusvn92y.R.inc(59134);
        __CLR4_5_219m019m0lusvn92y.R.inc(59135);V0 v = new V0();
        __CLR4_5_219m019m0lusvn92y.R.inc(59136);v.setValue(new Date());
        
        __CLR4_5_219m019m0lusvn92y.R.inc(59137);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_219m019m0lusvn92y.R.inc(59138);mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));
        __CLR4_5_219m019m0lusvn92y.R.inc(59139);mapping.setAsmEnable(true);
        
        __CLR4_5_219m019m0lusvn92y.R.inc(59140);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_219m019m0lusvn92y.R.inc(59141);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_5_219m019m0lusvn92y.R.inc(59142);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_219m019m0lusvn92y.R.inc(59143);Assert.assertEquals("{\"value\":" + JSON.toJSONString(format.format(v.getValue())) + "}", text);
    }finally{__CLR4_5_219m019m0lusvn92y.R.flushNeeded();}}

    public void test_codec_null_asm() throws Exception {__CLR4_5_219m019m0lusvn92y.R.globalSliceStart(getClass().getName(),59144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297oyf419mw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219m019m0lusvn92y.R.rethrow($CLV_t2$);}finally{__CLR4_5_219m019m0lusvn92y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest3.test_codec_null_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59144,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297oyf419mw() throws Exception{try{__CLR4_5_219m019m0lusvn92y.R.inc(59144);
        __CLR4_5_219m019m0lusvn92y.R.inc(59145);V0 v = new V0();

        __CLR4_5_219m019m0lusvn92y.R.inc(59146);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_219m019m0lusvn92y.R.inc(59147);mapping.setAsmEnable(true);

        __CLR4_5_219m019m0lusvn92y.R.inc(59148);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_219m019m0lusvn92y.R.inc(59149);mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));
        __CLR4_5_219m019m0lusvn92y.R.inc(59150);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_219m019m0lusvn92y.R.inc(59151);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_219m019m0lusvn92y.R.inc(59152);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_219m019m0lusvn92y.R.flushNeeded();}}
    
    public void test_codec_null_no_asm() throws Exception {__CLR4_5_219m019m0lusvn92y.R.globalSliceStart(getClass().getName(),59153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24htdy19n5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219m019m0lusvn92y.R.rethrow($CLV_t2$);}finally{__CLR4_5_219m019m0lusvn92y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest3.test_codec_null_no_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24htdy19n5() throws Exception{try{__CLR4_5_219m019m0lusvn92y.R.inc(59153);
        __CLR4_5_219m019m0lusvn92y.R.inc(59154);V0 v = new V0();

        __CLR4_5_219m019m0lusvn92y.R.inc(59155);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_219m019m0lusvn92y.R.inc(59156);mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));
        __CLR4_5_219m019m0lusvn92y.R.inc(59157);mapping.setAsmEnable(false);

        __CLR4_5_219m019m0lusvn92y.R.inc(59158);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_219m019m0lusvn92y.R.inc(59159);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_219m019m0lusvn92y.R.inc(59160);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_219m019m0lusvn92y.R.inc(59161);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_219m019m0lusvn92y.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_5_219m019m0lusvn92y.R.globalSliceStart(getClass().getName(),59162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2prl16y19ne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219m019m0lusvn92y.R.rethrow($CLV_t2$);}finally{__CLR4_5_219m019m0lusvn92y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest3.test_codec_null_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59162,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2prl16y19ne() throws Exception{try{__CLR4_5_219m019m0lusvn92y.R.inc(59162);
        __CLR4_5_219m019m0lusvn92y.R.inc(59163);V0 v = new V0();

        __CLR4_5_219m019m0lusvn92y.R.inc(59164);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_219m019m0lusvn92y.R.inc(59165);mapping.setAsmEnable(false);

        __CLR4_5_219m019m0lusvn92y.R.inc(59166);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero);
        __CLR4_5_219m019m0lusvn92y.R.inc(59167);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_219m019m0lusvn92y.R.inc(59168);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_219m019m0lusvn92y.R.inc(59169);Assert.assertEquals(null, v1.getValue());
    }finally{__CLR4_5_219m019m0lusvn92y.R.flushNeeded();}}

    public static class V0 {

        private Date value;

        public Date getValue() {try{__CLR4_5_219m019m0lusvn92y.R.inc(59170);
            __CLR4_5_219m019m0lusvn92y.R.inc(59171);return value;
        }finally{__CLR4_5_219m019m0lusvn92y.R.flushNeeded();}}

        public void setValue(Date value) {try{__CLR4_5_219m019m0lusvn92y.R.inc(59172);
            __CLR4_5_219m019m0lusvn92y.R.inc(59173);this.value = value;
        }finally{__CLR4_5_219m019m0lusvn92y.R.flushNeeded();}}

    }
}
