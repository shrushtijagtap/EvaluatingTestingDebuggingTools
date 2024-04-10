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

public class DateFieldTest3 extends TestCase {static class __CLR4_5_218ns18nslusyjsj8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,57942,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_218ns18nslusyjsj8.R.inc(57880);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57881);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_218ns18nslusyjsj8.R.inc(57882);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_218ns18nslusyjsj8.R.flushNeeded();}}
    
    public void test_codec() throws Exception {__CLR4_5_218ns18nslusyjsj8.R.globalSliceStart(getClass().getName(),57883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nht31s18nv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218ns18nslusyjsj8.R.rethrow($CLV_t2$);}finally{__CLR4_5_218ns18nslusyjsj8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest3.test_codec",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57883,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nht31s18nv() throws Exception{try{__CLR4_5_218ns18nslusyjsj8.R.inc(57883);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57884);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_218ns18nslusyjsj8.R.inc(57885);mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));

        __CLR4_5_218ns18nslusyjsj8.R.inc(57886);V0 v = new V0();
        __CLR4_5_218ns18nslusyjsj8.R.inc(57887);v.setValue(new Date());

        __CLR4_5_218ns18nslusyjsj8.R.inc(57888);String text = JSON.toJSONString(v, mapping);

        __CLR4_5_218ns18nslusyjsj8.R.inc(57889);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57890);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57891);Assert.assertEquals("{\"value\":" + JSON.toJSONString(format.format(v.getValue())) + "}", text);
    }finally{__CLR4_5_218ns18nslusyjsj8.R.flushNeeded();}}

    public void test_codec_no_asm() throws Exception {__CLR4_5_218ns18nslusyjsj8.R.globalSliceStart(getClass().getName(),57892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yk0hx618o4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218ns18nslusyjsj8.R.rethrow($CLV_t2$);}finally{__CLR4_5_218ns18nslusyjsj8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest3.test_codec_no_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57892,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yk0hx618o4() throws Exception{try{__CLR4_5_218ns18nslusyjsj8.R.inc(57892);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57893);V0 v = new V0();
        __CLR4_5_218ns18nslusyjsj8.R.inc(57894);v.setValue(new Date());

        __CLR4_5_218ns18nslusyjsj8.R.inc(57895);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_218ns18nslusyjsj8.R.inc(57896);mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));
        __CLR4_5_218ns18nslusyjsj8.R.inc(57897);mapping.setAsmEnable(false);

        __CLR4_5_218ns18nslusyjsj8.R.inc(57898);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57899);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57900);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57901);Assert.assertEquals("{\"value\":" + JSON.toJSONString(format.format(v.getValue())) + "}", text);
    }finally{__CLR4_5_218ns18nslusyjsj8.R.flushNeeded();}}
    
    public void test_codec_asm() throws Exception {__CLR4_5_218ns18nslusyjsj8.R.globalSliceStart(getClass().getName(),57902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhvxfw18oe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218ns18nslusyjsj8.R.rethrow($CLV_t2$);}finally{__CLR4_5_218ns18nslusyjsj8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest3.test_codec_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57902,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhvxfw18oe() throws Exception{try{__CLR4_5_218ns18nslusyjsj8.R.inc(57902);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57903);V0 v = new V0();
        __CLR4_5_218ns18nslusyjsj8.R.inc(57904);v.setValue(new Date());
        
        __CLR4_5_218ns18nslusyjsj8.R.inc(57905);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_218ns18nslusyjsj8.R.inc(57906);mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));
        __CLR4_5_218ns18nslusyjsj8.R.inc(57907);mapping.setAsmEnable(true);
        
        __CLR4_5_218ns18nslusyjsj8.R.inc(57908);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57909);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57910);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57911);Assert.assertEquals("{\"value\":" + JSON.toJSONString(format.format(v.getValue())) + "}", text);
    }finally{__CLR4_5_218ns18nslusyjsj8.R.flushNeeded();}}

    public void test_codec_null_asm() throws Exception {__CLR4_5_218ns18nslusyjsj8.R.globalSliceStart(getClass().getName(),57912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297oyf418oo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218ns18nslusyjsj8.R.rethrow($CLV_t2$);}finally{__CLR4_5_218ns18nslusyjsj8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest3.test_codec_null_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57912,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297oyf418oo() throws Exception{try{__CLR4_5_218ns18nslusyjsj8.R.inc(57912);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57913);V0 v = new V0();

        __CLR4_5_218ns18nslusyjsj8.R.inc(57914);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_218ns18nslusyjsj8.R.inc(57915);mapping.setAsmEnable(true);

        __CLR4_5_218ns18nslusyjsj8.R.inc(57916);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57917);mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));
        __CLR4_5_218ns18nslusyjsj8.R.inc(57918);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_218ns18nslusyjsj8.R.inc(57919);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_218ns18nslusyjsj8.R.inc(57920);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_218ns18nslusyjsj8.R.flushNeeded();}}
    
    public void test_codec_null_no_asm() throws Exception {__CLR4_5_218ns18nslusyjsj8.R.globalSliceStart(getClass().getName(),57921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24htdy18ox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218ns18nslusyjsj8.R.rethrow($CLV_t2$);}finally{__CLR4_5_218ns18nslusyjsj8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest3.test_codec_null_no_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24htdy18ox() throws Exception{try{__CLR4_5_218ns18nslusyjsj8.R.inc(57921);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57922);V0 v = new V0();

        __CLR4_5_218ns18nslusyjsj8.R.inc(57923);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_218ns18nslusyjsj8.R.inc(57924);mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd"));
        __CLR4_5_218ns18nslusyjsj8.R.inc(57925);mapping.setAsmEnable(false);

        __CLR4_5_218ns18nslusyjsj8.R.inc(57926);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57927);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_218ns18nslusyjsj8.R.inc(57928);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_218ns18nslusyjsj8.R.inc(57929);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_218ns18nslusyjsj8.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_5_218ns18nslusyjsj8.R.globalSliceStart(getClass().getName(),57930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2prl16y18p6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218ns18nslusyjsj8.R.rethrow($CLV_t2$);}finally{__CLR4_5_218ns18nslusyjsj8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest3.test_codec_null_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57930,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2prl16y18p6() throws Exception{try{__CLR4_5_218ns18nslusyjsj8.R.inc(57930);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57931);V0 v = new V0();

        __CLR4_5_218ns18nslusyjsj8.R.inc(57932);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_218ns18nslusyjsj8.R.inc(57933);mapping.setAsmEnable(false);

        __CLR4_5_218ns18nslusyjsj8.R.inc(57934);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero);
        __CLR4_5_218ns18nslusyjsj8.R.inc(57935);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_218ns18nslusyjsj8.R.inc(57936);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_218ns18nslusyjsj8.R.inc(57937);Assert.assertEquals(null, v1.getValue());
    }finally{__CLR4_5_218ns18nslusyjsj8.R.flushNeeded();}}

    public static class V0 {

        private Date value;

        public Date getValue() {try{__CLR4_5_218ns18nslusyjsj8.R.inc(57938);
            __CLR4_5_218ns18nslusyjsj8.R.inc(57939);return value;
        }finally{__CLR4_5_218ns18nslusyjsj8.R.flushNeeded();}}

        public void setValue(Date value) {try{__CLR4_5_218ns18nslusyjsj8.R.inc(57940);
            __CLR4_5_218ns18nslusyjsj8.R.inc(57941);this.value = value;
        }finally{__CLR4_5_218ns18nslusyjsj8.R.flushNeeded();}}

    }
}
