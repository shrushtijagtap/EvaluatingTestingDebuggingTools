/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.date;

import java.util.Date;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class DateFieldTest extends TestCase {static class __CLR4_1_1018j518j5lusqk7vj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,57748,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_codec() throws Exception {__CLR4_1_1018j518j5lusqk7vj.R.globalSliceStart(getClass().getName(),57713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nht31s18j5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018j518j5lusqk7vj.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018j518j5lusqk7vj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest.test_codec",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57713,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nht31s18j5() throws Exception{try{__CLR4_1_1018j518j5lusqk7vj.R.inc(57713);
        __CLR4_1_1018j518j5lusqk7vj.R.inc(57714);V0 v = new V0();
        __CLR4_1_1018j518j5lusqk7vj.R.inc(57715);v.setValue(new Date());

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57716);String text = JSON.toJSONString(v);
        __CLR4_1_1018j518j5lusqk7vj.R.inc(57717);Assert.assertEquals("{\"value\":" + v.getValue().getTime() + "}", text);

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57718);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57719);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_1_1018j518j5lusqk7vj.R.flushNeeded();}}

    public void test_codec_null() throws Exception {__CLR4_1_1018j518j5lusqk7vj.R.globalSliceStart(getClass().getName(),57720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105ncl1818jc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018j518j5lusqk7vj.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018j518j5lusqk7vj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest.test_codec_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57720,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105ncl1818jc() throws Exception{try{__CLR4_1_1018j518j5lusqk7vj.R.inc(57720);
        __CLR4_1_1018j518j5lusqk7vj.R.inc(57721);V0 v = new V0();

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57722);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_1018j518j5lusqk7vj.R.inc(57723);mapping.setAsmEnable(false);

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57724);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_1018j518j5lusqk7vj.R.inc(57725);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57726);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57727);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_1_1018j518j5lusqk7vj.R.flushNeeded();}}

    public void test_codec_null_asm() throws Exception {__CLR4_1_1018j518j5lusqk7vj.R.globalSliceStart(getClass().getName(),57728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1097oyf418jk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018j518j5lusqk7vj.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018j518j5lusqk7vj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest.test_codec_null_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57728,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1097oyf418jk() throws Exception{try{__CLR4_1_1018j518j5lusqk7vj.R.inc(57728);
        __CLR4_1_1018j518j5lusqk7vj.R.inc(57729);V0 v = new V0();

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57730);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_1018j518j5lusqk7vj.R.inc(57731);mapping.setAsmEnable(true);

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57732);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_1018j518j5lusqk7vj.R.inc(57733);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57734);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57735);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_1_1018j518j5lusqk7vj.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_1_1018j518j5lusqk7vj.R.globalSliceStart(getClass().getName(),57736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10prl16y18js();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018j518j5lusqk7vj.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018j518j5lusqk7vj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest.test_codec_null_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57736,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10prl16y18js() throws Exception{try{__CLR4_1_1018j518j5lusqk7vj.R.inc(57736);
        __CLR4_1_1018j518j5lusqk7vj.R.inc(57737);V0 v = new V0();

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57738);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_1018j518j5lusqk7vj.R.inc(57739);mapping.setAsmEnable(false);

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57740);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero);
        __CLR4_1_1018j518j5lusqk7vj.R.inc(57741);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57742);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_1018j518j5lusqk7vj.R.inc(57743);Assert.assertEquals(null, v1.getValue());
    }finally{__CLR4_1_1018j518j5lusqk7vj.R.flushNeeded();}}

    public static class V0 {

        private Date value;

        public Date getValue() {try{__CLR4_1_1018j518j5lusqk7vj.R.inc(57744);
            __CLR4_1_1018j518j5lusqk7vj.R.inc(57745);return value;
        }finally{__CLR4_1_1018j518j5lusqk7vj.R.flushNeeded();}}

        public void setValue(Date value) {try{__CLR4_1_1018j518j5lusqk7vj.R.inc(57746);
            __CLR4_1_1018j518j5lusqk7vj.R.inc(57747);this.value = value;
        }finally{__CLR4_1_1018j518j5lusqk7vj.R.flushNeeded();}}

    }
}
