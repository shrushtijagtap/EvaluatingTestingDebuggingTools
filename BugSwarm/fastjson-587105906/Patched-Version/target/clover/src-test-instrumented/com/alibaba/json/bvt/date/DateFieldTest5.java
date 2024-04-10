/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.date;

import java.util.Date;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class DateFieldTest5 extends TestCase {static class __CLR4_5_218qv18qvlusyjsjf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,58043,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_codec() throws Exception {__CLR4_5_218qv18qvlusyjsjf.R.globalSliceStart(getClass().getName(),57991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nht31s18qv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218qv18qvlusyjsjf.R.rethrow($CLV_t2$);}finally{__CLR4_5_218qv18qvlusyjsjf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest5.test_codec",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57991,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nht31s18qv() throws Exception{try{__CLR4_5_218qv18qvlusyjsjf.R.inc(57991);
        __CLR4_5_218qv18qvlusyjsjf.R.inc(57992);SerializeConfig mapping = new SerializeConfig();

        __CLR4_5_218qv18qvlusyjsjf.R.inc(57993);V0 v = new V0();
        __CLR4_5_218qv18qvlusyjsjf.R.inc(57994);v.setValue(new Date());

        __CLR4_5_218qv18qvlusyjsjf.R.inc(57995);String text = JSON.toJSONString(v, mapping);

        __CLR4_5_218qv18qvlusyjsjf.R.inc(57996);Assert.assertEquals("{\"value\":" + v.getValue().getTime() + "}", text);
    }finally{__CLR4_5_218qv18qvlusyjsjf.R.flushNeeded();}}

    public void test_codec_no_asm() throws Exception {__CLR4_5_218qv18qvlusyjsjf.R.globalSliceStart(getClass().getName(),57997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yk0hx618r1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218qv18qvlusyjsjf.R.rethrow($CLV_t2$);}finally{__CLR4_5_218qv18qvlusyjsjf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest5.test_codec_no_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57997,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yk0hx618r1() throws Exception{try{__CLR4_5_218qv18qvlusyjsjf.R.inc(57997);
        __CLR4_5_218qv18qvlusyjsjf.R.inc(57998);V0 v = new V0();
        __CLR4_5_218qv18qvlusyjsjf.R.inc(57999);v.setValue(new Date());

        __CLR4_5_218qv18qvlusyjsjf.R.inc(58000);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_218qv18qvlusyjsjf.R.inc(58001);mapping.setAsmEnable(false);

        __CLR4_5_218qv18qvlusyjsjf.R.inc(58002);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_218qv18qvlusyjsjf.R.inc(58003);Assert.assertEquals("{\"value\":" + v.getValue().getTime() + "}", text);
    }finally{__CLR4_5_218qv18qvlusyjsjf.R.flushNeeded();}}

    public void test_codec_asm() throws Exception {__CLR4_5_218qv18qvlusyjsjf.R.globalSliceStart(getClass().getName(),58004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhvxfw18r8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218qv18qvlusyjsjf.R.rethrow($CLV_t2$);}finally{__CLR4_5_218qv18qvlusyjsjf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest5.test_codec_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58004,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhvxfw18r8() throws Exception{try{__CLR4_5_218qv18qvlusyjsjf.R.inc(58004);
        __CLR4_5_218qv18qvlusyjsjf.R.inc(58005);V0 v = new V0();
        __CLR4_5_218qv18qvlusyjsjf.R.inc(58006);v.setValue(new Date());

        __CLR4_5_218qv18qvlusyjsjf.R.inc(58007);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_218qv18qvlusyjsjf.R.inc(58008);mapping.setAsmEnable(true);

        __CLR4_5_218qv18qvlusyjsjf.R.inc(58009);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_218qv18qvlusyjsjf.R.inc(58010);Assert.assertEquals("{\"value\":" + v.getValue().getTime() + "}", text);
    }finally{__CLR4_5_218qv18qvlusyjsjf.R.flushNeeded();}}

    public void test_codec_null_asm() throws Exception {__CLR4_5_218qv18qvlusyjsjf.R.globalSliceStart(getClass().getName(),58011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297oyf418rf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218qv18qvlusyjsjf.R.rethrow($CLV_t2$);}finally{__CLR4_5_218qv18qvlusyjsjf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest5.test_codec_null_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58011,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297oyf418rf() throws Exception{try{__CLR4_5_218qv18qvlusyjsjf.R.inc(58011);
        __CLR4_5_218qv18qvlusyjsjf.R.inc(58012);V0 v = new V0();

        __CLR4_5_218qv18qvlusyjsjf.R.inc(58013);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_218qv18qvlusyjsjf.R.inc(58014);mapping.setAsmEnable(true);

        __CLR4_5_218qv18qvlusyjsjf.R.inc(58015);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_218qv18qvlusyjsjf.R.inc(58016);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_218qv18qvlusyjsjf.R.inc(58017);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_218qv18qvlusyjsjf.R.inc(58018);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_218qv18qvlusyjsjf.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_5_218qv18qvlusyjsjf.R.globalSliceStart(getClass().getName(),58019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2prl16y18rn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218qv18qvlusyjsjf.R.rethrow($CLV_t2$);}finally{__CLR4_5_218qv18qvlusyjsjf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest5.test_codec_null_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58019,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2prl16y18rn() throws Exception{try{__CLR4_5_218qv18qvlusyjsjf.R.inc(58019);
        __CLR4_5_218qv18qvlusyjsjf.R.inc(58020);V0 v = new V0();

        __CLR4_5_218qv18qvlusyjsjf.R.inc(58021);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_218qv18qvlusyjsjf.R.inc(58022);mapping.setAsmEnable(false);

        __CLR4_5_218qv18qvlusyjsjf.R.inc(58023);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero);
        __CLR4_5_218qv18qvlusyjsjf.R.inc(58024);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_218qv18qvlusyjsjf.R.inc(58025);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_218qv18qvlusyjsjf.R.inc(58026);Assert.assertEquals(null, v1.getValue());
    }finally{__CLR4_5_218qv18qvlusyjsjf.R.flushNeeded();}}

    public static class V0 {

        private Date value;

        @JSONField(format = " ")
        public Date getValue() {try{__CLR4_5_218qv18qvlusyjsjf.R.inc(58027);
            __CLR4_5_218qv18qvlusyjsjf.R.inc(58028);return value;
        }finally{__CLR4_5_218qv18qvlusyjsjf.R.flushNeeded();}}

        public void setValue(Date value) {try{__CLR4_5_218qv18qvlusyjsjf.R.inc(58029);
            __CLR4_5_218qv18qvlusyjsjf.R.inc(58030);this.value = value;
        }finally{__CLR4_5_218qv18qvlusyjsjf.R.flushNeeded();}}

        public boolean is() {try{__CLR4_5_218qv18qvlusyjsjf.R.inc(58031);
            __CLR4_5_218qv18qvlusyjsjf.R.inc(58032);return true;
        }finally{__CLR4_5_218qv18qvlusyjsjf.R.flushNeeded();}}

        public boolean isa() {try{__CLR4_5_218qv18qvlusyjsjf.R.inc(58033);
            __CLR4_5_218qv18qvlusyjsjf.R.inc(58034);return true;
        }finally{__CLR4_5_218qv18qvlusyjsjf.R.flushNeeded();}}

        public Object get() {try{__CLR4_5_218qv18qvlusyjsjf.R.inc(58035);
            __CLR4_5_218qv18qvlusyjsjf.R.inc(58036);return true;
        }finally{__CLR4_5_218qv18qvlusyjsjf.R.flushNeeded();}}

        public Object geta() {try{__CLR4_5_218qv18qvlusyjsjf.R.inc(58037);
            __CLR4_5_218qv18qvlusyjsjf.R.inc(58038);return true;
        }finally{__CLR4_5_218qv18qvlusyjsjf.R.flushNeeded();}}

        @JSONField(serialize = false)
        public Object getA() {try{__CLR4_5_218qv18qvlusyjsjf.R.inc(58039);
            __CLR4_5_218qv18qvlusyjsjf.R.inc(58040);return true;
        }finally{__CLR4_5_218qv18qvlusyjsjf.R.flushNeeded();}}
        
        public static Object getB() {try{__CLR4_5_218qv18qvlusyjsjf.R.inc(58041);
            __CLR4_5_218qv18qvlusyjsjf.R.inc(58042);return true;
        }finally{__CLR4_5_218qv18qvlusyjsjf.R.flushNeeded();}}

    }
}
