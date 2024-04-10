/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import java.math.BigInteger;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class BigIntegerDeserializerTest extends TestCase {static class __CLR4_5_21khh1khhlusyju1w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,73229,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_1() throws Exception {__CLR4_5_21khh1khhlusyju1w.R.globalSliceStart(getClass().getName(),73205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1khh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21khh1khhlusyju1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21khh1khhlusyju1w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.BigIntegerDeserializerTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73205,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1khh() throws Exception{try{__CLR4_5_21khh1khhlusyju1w.R.inc(73205);

        __CLR4_5_21khh1khhlusyju1w.R.inc(73206);BigInteger value = JSON.parseObject("'123'", BigInteger.class);

        __CLR4_5_21khh1khhlusyju1w.R.inc(73207);Assert.assertEquals(new BigInteger("123"), value);
    }finally{__CLR4_5_21khh1khhlusyju1w.R.flushNeeded();}}

    public void test_vo() throws Exception {__CLR4_5_21khh1khhlusyju1w.R.globalSliceStart(getClass().getName(),73208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ts416b1khk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21khh1khhlusyju1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21khh1khhlusyju1w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.BigIntegerDeserializerTest.test_vo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73208,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ts416b1khk() throws Exception{try{__CLR4_5_21khh1khhlusyju1w.R.inc(73208);

        __CLR4_5_21khh1khhlusyju1w.R.inc(73209);VO vo = JSON.parseObject("{\"value\":123}", VO.class);

        __CLR4_5_21khh1khhlusyju1w.R.inc(73210);Assert.assertEquals(new BigInteger("123"), vo.getValue());
    }finally{__CLR4_5_21khh1khhlusyju1w.R.flushNeeded();}}

    public void test_vo_null() throws Exception {__CLR4_5_21khh1khhlusyju1w.R.globalSliceStart(getClass().getName(),73211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25a8esn1khn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21khh1khhlusyju1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21khh1khhlusyju1w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.BigIntegerDeserializerTest.test_vo_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25a8esn1khn() throws Exception{try{__CLR4_5_21khh1khhlusyju1w.R.inc(73211);

        __CLR4_5_21khh1khhlusyju1w.R.inc(73212);VO vo = JSON.parseObject("{\"value\":null}", VO.class);

        __CLR4_5_21khh1khhlusyju1w.R.inc(73213);Assert.assertEquals(null, vo.getValue());
    }finally{__CLR4_5_21khh1khhlusyju1w.R.flushNeeded();}}

    public void test_vo2() throws Exception {__CLR4_5_21khh1khhlusyju1w.R.globalSliceStart(getClass().getName(),73214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s1o43x1khq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21khh1khhlusyju1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21khh1khhlusyju1w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.BigIntegerDeserializerTest.test_vo2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73214,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s1o43x1khq() throws Exception{try{__CLR4_5_21khh1khhlusyju1w.R.inc(73214);

        __CLR4_5_21khh1khhlusyju1w.R.inc(73215);VO2 vo = JSON.parseObject("{\"value\":123}", VO2.class);

        __CLR4_5_21khh1khhlusyju1w.R.inc(73216);Assert.assertEquals(new BigInteger("123"), vo.getValue());
    }finally{__CLR4_5_21khh1khhlusyju1w.R.flushNeeded();}}

    public void test_array() throws Exception {__CLR4_5_21khh1khhlusyju1w.R.globalSliceStart(getClass().getName(),73217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vw0vd91kht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21khh1khhlusyju1w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21khh1khhlusyju1w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.BigIntegerDeserializerTest.test_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73217,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vw0vd91kht() throws Exception{try{__CLR4_5_21khh1khhlusyju1w.R.inc(73217);
        __CLR4_5_21khh1khhlusyju1w.R.inc(73218);List<BigInteger> list = JSON.parseArray("[123,345]", BigInteger.class);
        __CLR4_5_21khh1khhlusyju1w.R.inc(73219);Assert.assertEquals(new BigInteger("123"), list.get(0));
        __CLR4_5_21khh1khhlusyju1w.R.inc(73220);Assert.assertEquals(new BigInteger("345"), list.get(1));
    }finally{__CLR4_5_21khh1khhlusyju1w.R.flushNeeded();}}

    public static class VO {

        private BigInteger value;

        public BigInteger getValue() {try{__CLR4_5_21khh1khhlusyju1w.R.inc(73221);
            __CLR4_5_21khh1khhlusyju1w.R.inc(73222);return value;
        }finally{__CLR4_5_21khh1khhlusyju1w.R.flushNeeded();}}

        public void setValue(BigInteger value) {try{__CLR4_5_21khh1khhlusyju1w.R.inc(73223);
            __CLR4_5_21khh1khhlusyju1w.R.inc(73224);this.value = value;
        }finally{__CLR4_5_21khh1khhlusyju1w.R.flushNeeded();}}
    }

    private static class VO2 {

        private BigInteger value;

        public BigInteger getValue() {try{__CLR4_5_21khh1khhlusyju1w.R.inc(73225);
            __CLR4_5_21khh1khhlusyju1w.R.inc(73226);return value;
        }finally{__CLR4_5_21khh1khhlusyju1w.R.flushNeeded();}}

        public void setValue(BigInteger value) {try{__CLR4_5_21khh1khhlusyju1w.R.inc(73227);
            __CLR4_5_21khh1khhlusyju1w.R.inc(73228);this.value = value;
        }finally{__CLR4_5_21khh1khhlusyju1w.R.flushNeeded();}}
    }
}
