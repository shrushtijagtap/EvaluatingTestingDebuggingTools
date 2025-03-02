/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import java.math.BigInteger;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class BigIntegerFieldTest extends TestCase {static class __CLR4_1_10wk7wk7luszw4je{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,42217,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_codec_null() throws Exception {__CLR4_1_10wk7wk7luszw4je.R.globalSliceStart(getClass().getName(),42199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105ncl18wk7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10wk7wk7luszw4je.R.rethrow($CLV_t2$);}finally{__CLR4_1_10wk7wk7luszw4je.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.BigIntegerFieldTest.test_codec_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42199,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105ncl18wk7() throws Exception{try{__CLR4_1_10wk7wk7luszw4je.R.inc(42199);
        __CLR4_1_10wk7wk7luszw4je.R.inc(42200);V0 v = new V0();

        __CLR4_1_10wk7wk7luszw4je.R.inc(42201);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10wk7wk7luszw4je.R.inc(42202);mapping.setAsmEnable(false);

        __CLR4_1_10wk7wk7luszw4je.R.inc(42203);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_10wk7wk7luszw4je.R.inc(42204);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_1_10wk7wk7luszw4je.R.inc(42205);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_10wk7wk7luszw4je.R.inc(42206);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_1_10wk7wk7luszw4je.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_1_10wk7wk7luszw4je.R.globalSliceStart(getClass().getName(),42207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10prl16ywkf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10wk7wk7luszw4je.R.rethrow($CLV_t2$);}finally{__CLR4_1_10wk7wk7luszw4je.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.BigIntegerFieldTest.test_codec_null_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42207,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10prl16ywkf() throws Exception{try{__CLR4_1_10wk7wk7luszw4je.R.inc(42207);
        __CLR4_1_10wk7wk7luszw4je.R.inc(42208);V0 v = new V0();

        __CLR4_1_10wk7wk7luszw4je.R.inc(42209);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10wk7wk7luszw4je.R.inc(42210);mapping.setAsmEnable(false);

        __CLR4_1_10wk7wk7luszw4je.R.inc(42211);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero);
        __CLR4_1_10wk7wk7luszw4je.R.inc(42212);Assert.assertEquals("{\"value\":0}", text);
    }finally{__CLR4_1_10wk7wk7luszw4je.R.flushNeeded();}}

    public static class V0 {

        private BigInteger value;

        public BigInteger getValue() {try{__CLR4_1_10wk7wk7luszw4je.R.inc(42213);
            __CLR4_1_10wk7wk7luszw4je.R.inc(42214);return value;
        }finally{__CLR4_1_10wk7wk7luszw4je.R.flushNeeded();}}

        public void setValue(BigInteger value) {try{__CLR4_1_10wk7wk7luszw4je.R.inc(42215);
            __CLR4_1_10wk7wk7luszw4je.R.inc(42216);this.value = value;
        }finally{__CLR4_1_10wk7wk7luszw4je.R.flushNeeded();}}

    }
}
