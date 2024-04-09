/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class DateFieldTest2 extends TestCase {static class __CLR4_1_1018mq18mqlusqk7yd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,57891,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_1018mq18mqlusqk7yd.R.inc(57842);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57843);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57844);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_1018mq18mqlusqk7yd.R.flushNeeded();}}
    
    public void test_codec() throws Exception {__CLR4_1_1018mq18mqlusqk7yd.R.globalSliceStart(getClass().getName(),57845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nht31s18mt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018mq18mqlusqk7yd.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018mq18mqlusqk7yd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest2.test_codec",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57845,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nht31s18mt() throws Exception{try{__CLR4_1_1018mq18mqlusqk7yd.R.inc(57845);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57846);SerializeConfig mapping = new SerializeConfig();

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57847);V0 v = new V0();
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57848);v.setValue(new Date());

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57849);String text = JSON.toJSONString(v, mapping);

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57850);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57851);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57852);Assert.assertEquals("{\"value\":" + JSON.toJSONString(format.format(v.getValue())) + "}", text);
    }finally{__CLR4_1_1018mq18mqlusqk7yd.R.flushNeeded();}}

    public void test_codec_no_asm() throws Exception {__CLR4_1_1018mq18mqlusqk7yd.R.globalSliceStart(getClass().getName(),57853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yk0hx618n1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018mq18mqlusqk7yd.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018mq18mqlusqk7yd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest2.test_codec_no_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57853,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yk0hx618n1() throws Exception{try{__CLR4_1_1018mq18mqlusqk7yd.R.inc(57853);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57854);V0 v = new V0();
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57855);v.setValue(new Date());

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57856);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57857);mapping.setAsmEnable(false);

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57858);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57859);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57860);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57861);Assert.assertEquals("{\"value\":" + JSON.toJSONString(format.format(v.getValue())) + "}", text);
    }finally{__CLR4_1_1018mq18mqlusqk7yd.R.flushNeeded();}}

    public void test_codec_asm() throws Exception {__CLR4_1_1018mq18mqlusqk7yd.R.globalSliceStart(getClass().getName(),57862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nhvxfw18na();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018mq18mqlusqk7yd.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018mq18mqlusqk7yd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest2.test_codec_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57862,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nhvxfw18na() throws Exception{try{__CLR4_1_1018mq18mqlusqk7yd.R.inc(57862);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57863);V0 v = new V0();
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57864);v.setValue(new Date());

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57865);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57866);mapping.setAsmEnable(true);

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57867);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57868);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57869);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57870);Assert.assertEquals("{\"value\":" + JSON.toJSONString(format.format(v.getValue())) + "}", text);
    }finally{__CLR4_1_1018mq18mqlusqk7yd.R.flushNeeded();}}

    public void test_codec_null_asm() throws Exception {__CLR4_1_1018mq18mqlusqk7yd.R.globalSliceStart(getClass().getName(),57871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1097oyf418nj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018mq18mqlusqk7yd.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018mq18mqlusqk7yd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest2.test_codec_null_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57871,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1097oyf418nj() throws Exception{try{__CLR4_1_1018mq18mqlusqk7yd.R.inc(57871);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57872);V0 v = new V0();

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57873);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57874);mapping.setAsmEnable(true);

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57875);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57876);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57877);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57878);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_1_1018mq18mqlusqk7yd.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_1_1018mq18mqlusqk7yd.R.globalSliceStart(getClass().getName(),57879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10prl16y18nr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018mq18mqlusqk7yd.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018mq18mqlusqk7yd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest2.test_codec_null_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57879,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10prl16y18nr() throws Exception{try{__CLR4_1_1018mq18mqlusqk7yd.R.inc(57879);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57880);V0 v = new V0();

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57881);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57882);mapping.setAsmEnable(false);

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57883);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero);
        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57884);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57885);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_1018mq18mqlusqk7yd.R.inc(57886);Assert.assertEquals(null, v1.getValue());
    }finally{__CLR4_1_1018mq18mqlusqk7yd.R.flushNeeded();}}

    public static class V0 {

        @JSONField(format = "yyyy-MM-dd")
        private Date value;

        public Date getValue() {try{__CLR4_1_1018mq18mqlusqk7yd.R.inc(57887);
            __CLR4_1_1018mq18mqlusqk7yd.R.inc(57888);return value;
        }finally{__CLR4_1_1018mq18mqlusqk7yd.R.flushNeeded();}}

        public void setValue(Date value) {try{__CLR4_1_1018mq18mqlusqk7yd.R.inc(57889);
            __CLR4_1_1018mq18mqlusqk7yd.R.inc(57890);this.value = value;
        }finally{__CLR4_1_1018mq18mqlusqk7yd.R.flushNeeded();}}

    }
}
