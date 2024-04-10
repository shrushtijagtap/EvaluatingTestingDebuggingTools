/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.asm;

import java.math.BigDecimal;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class TestASM_BigDecimal extends TestCase {static class __CLR4_5_21ltm1ltmlusyju8t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,74970,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_decimal() throws Exception {__CLR4_5_21ltm1ltmlusyju8t.R.globalSliceStart(getClass().getName(),74938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f2trhn1ltm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ltm1ltmlusyju8t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ltm1ltmlusyju8t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM_BigDecimal.test_decimal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74938,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f2trhn1ltm() throws Exception{try{__CLR4_5_21ltm1ltmlusyju8t.R.inc(74938);
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74939);V0 v = new V0();
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74940);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes);
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74941);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21ltm1ltmlusyju8t.R.flushNeeded();}}

    public void test_decimal_1() throws Exception {__CLR4_5_21ltm1ltmlusyju8t.R.globalSliceStart(getClass().getName(),74942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24cbx7h1ltq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ltm1ltmlusyju8t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ltm1ltmlusyju8t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM_BigDecimal.test_decimal_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74942,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24cbx7h1ltq() throws Exception{try{__CLR4_5_21ltm1ltmlusyju8t.R.inc(74942);
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74943);V0 v = new V0();
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74944);v.setDecimal(new BigDecimal("123"));
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74945);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes);
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74946);Assert.assertEquals("{'decimal':123}", text);
    }finally{__CLR4_5_21ltm1ltmlusyju8t.R.flushNeeded();}}
    

    public void test_decimal_2() throws Exception {__CLR4_5_21ltm1ltmlusyju8t.R.globalSliceStart(getClass().getName(),74947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27lbvzy1ltv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ltm1ltmlusyju8t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ltm1ltmlusyju8t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM_BigDecimal.test_decimal_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74947,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27lbvzy1ltv() throws Exception{try{__CLR4_5_21ltm1ltmlusyju8t.R.inc(74947);
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74948);V1 v = new V1();
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74949);v.setId(123);
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74950);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes);

        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74951);Assert.assertEquals("{'id':123}", text);
    }finally{__CLR4_5_21ltm1ltmlusyju8t.R.flushNeeded();}}
    
    public void test_decimal_3() throws Exception {__CLR4_5_21ltm1ltmlusyju8t.R.globalSliceStart(getClass().getName(),74952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aubusf1lu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ltm1ltmlusyju8t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ltm1ltmlusyju8t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM_BigDecimal.test_decimal_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aubusf1lu0() throws Exception{try{__CLR4_5_21ltm1ltmlusyju8t.R.inc(74952);
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74953);V1 v = new V1();
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74954);v.setId(123);
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74955);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes, SerializerFeature.WriteMapNullValue);
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74956);System.out.println(text);
        
        __CLR4_5_21ltm1ltmlusyju8t.R.inc(74957);Assert.assertEquals("{'decimal':null,'id':123}", text);
    }finally{__CLR4_5_21ltm1ltmlusyju8t.R.flushNeeded();}}

    public static class V0 {

        private BigDecimal decimal;

        public BigDecimal getDecimal() {try{__CLR4_5_21ltm1ltmlusyju8t.R.inc(74958);
            __CLR4_5_21ltm1ltmlusyju8t.R.inc(74959);return decimal;
        }finally{__CLR4_5_21ltm1ltmlusyju8t.R.flushNeeded();}}

        public void setDecimal(BigDecimal decimal) {try{__CLR4_5_21ltm1ltmlusyju8t.R.inc(74960);
            __CLR4_5_21ltm1ltmlusyju8t.R.inc(74961);this.decimal = decimal;
        }finally{__CLR4_5_21ltm1ltmlusyju8t.R.flushNeeded();}}

    }

    public static class V1 {

        private int        id;
        private BigDecimal decimal;

        public int getId() {try{__CLR4_5_21ltm1ltmlusyju8t.R.inc(74962);
            __CLR4_5_21ltm1ltmlusyju8t.R.inc(74963);return id;
        }finally{__CLR4_5_21ltm1ltmlusyju8t.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21ltm1ltmlusyju8t.R.inc(74964);
            __CLR4_5_21ltm1ltmlusyju8t.R.inc(74965);this.id = id;
        }finally{__CLR4_5_21ltm1ltmlusyju8t.R.flushNeeded();}}

        public BigDecimal getDecimal() {try{__CLR4_5_21ltm1ltmlusyju8t.R.inc(74966);
            __CLR4_5_21ltm1ltmlusyju8t.R.inc(74967);return decimal;
        }finally{__CLR4_5_21ltm1ltmlusyju8t.R.flushNeeded();}}

        public void setDecimal(BigDecimal decimal) {try{__CLR4_5_21ltm1ltmlusyju8t.R.inc(74968);
            __CLR4_5_21ltm1ltmlusyju8t.R.inc(74969);this.decimal = decimal;
        }finally{__CLR4_5_21ltm1ltmlusyju8t.R.flushNeeded();}}

    }
}
