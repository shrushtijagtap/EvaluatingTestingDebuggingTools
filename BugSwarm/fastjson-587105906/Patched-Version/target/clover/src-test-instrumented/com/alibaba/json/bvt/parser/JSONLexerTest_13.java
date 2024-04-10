/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class JSONLexerTest_13 extends TestCase {static class __CLR4_5_21gdy1gdylusyjtmi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,67921,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_e() throws Exception {__CLR4_5_21gdy1gdylusyjtmi.R.globalSliceStart(getClass().getName(),67894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_271mm9r1gdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gdy1gdylusyjtmi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gdy1gdylusyjtmi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_13.test_e",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67894,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_271mm9r1gdy() throws Exception{try{__CLR4_5_21gdy1gdylusyjtmi.R.inc(67894);
        __CLR4_5_21gdy1gdylusyjtmi.R.inc(67895);Assert.assertTrue(123e3D == JSON.parseObject("{\"vo\":{\"type\":123e3}}", A.class).getVo().getType());
    }finally{__CLR4_5_21gdy1gdylusyjtmi.R.flushNeeded();}}

    public void test_E() throws Exception {__CLR4_5_21gdy1gdylusyjtmi.R.globalSliceStart(getClass().getName(),67896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2px89291ge0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gdy1gdylusyjtmi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gdy1gdylusyjtmi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_13.test_E",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67896,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2px89291ge0() throws Exception{try{__CLR4_5_21gdy1gdylusyjtmi.R.inc(67896);
        __CLR4_5_21gdy1gdylusyjtmi.R.inc(67897);Assert.assertTrue(123e3D == JSON.parseObject("{\"vo\":{\"type\":123E3}}", A.class).getVo().getType());
    }finally{__CLR4_5_21gdy1gdylusyjtmi.R.flushNeeded();}}
    
    public void test_e_plus() throws Exception {__CLR4_5_21gdy1gdylusyjtmi.R.globalSliceStart(getClass().getName(),67898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28owhnc1ge2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gdy1gdylusyjtmi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gdy1gdylusyjtmi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_13.test_e_plus",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67898,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28owhnc1ge2() throws Exception{try{__CLR4_5_21gdy1gdylusyjtmi.R.inc(67898);
        __CLR4_5_21gdy1gdylusyjtmi.R.inc(67899);Assert.assertTrue(123e3D == JSON.parseObject("{\"vo\":{\"type\":123e+3}}", A.class).getVo().getType());
    }finally{__CLR4_5_21gdy1gdylusyjtmi.R.flushNeeded();}}
    
    public void test_E_plus() throws Exception {__CLR4_5_21gdy1gdylusyjtmi.R.globalSliceStart(getClass().getName(),67900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27sp22w1ge4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gdy1gdylusyjtmi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gdy1gdylusyjtmi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_13.test_E_plus",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27sp22w1ge4() throws Exception{try{__CLR4_5_21gdy1gdylusyjtmi.R.inc(67900);
        __CLR4_5_21gdy1gdylusyjtmi.R.inc(67901);Assert.assertTrue(123e3D == JSON.parseObject("{\"vo\":{\"type\":123E+3}}", A.class).getVo().getType());
    }finally{__CLR4_5_21gdy1gdylusyjtmi.R.flushNeeded();}}
    
    public void test_e_minus() throws Exception {__CLR4_5_21gdy1gdylusyjtmi.R.globalSliceStart(getClass().getName(),67902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jc1xu81ge6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gdy1gdylusyjtmi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gdy1gdylusyjtmi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_13.test_e_minus",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67902,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jc1xu81ge6() throws Exception{try{__CLR4_5_21gdy1gdylusyjtmi.R.inc(67902);
        __CLR4_5_21gdy1gdylusyjtmi.R.inc(67903);Assert.assertTrue(123e-3D == JSON.parseObject("{\"vo\":{\"type\":123e-3}}", A.class).getVo().getType());
    }finally{__CLR4_5_21gdy1gdylusyjtmi.R.flushNeeded();}}
    
    public void test_E_minus() throws Exception {__CLR4_5_21gdy1gdylusyjtmi.R.globalSliceStart(getClass().getName(),67904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9tjlc1ge8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gdy1gdylusyjtmi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gdy1gdylusyjtmi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_13.test_E_minus",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67904,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9tjlc1ge8() throws Exception{try{__CLR4_5_21gdy1gdylusyjtmi.R.inc(67904);
        __CLR4_5_21gdy1gdylusyjtmi.R.inc(67905);Assert.assertTrue(123e-3D == JSON.parseObject("{\"vo\":{\"type\":123E-3}}", A.class).getVo().getType());
    }finally{__CLR4_5_21gdy1gdylusyjtmi.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21gdy1gdylusyjtmi.R.globalSliceStart(getClass().getName(),67906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1gea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gdy1gdylusyjtmi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gdy1gdylusyjtmi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_13.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67906,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1gea() throws Exception{try{__CLR4_5_21gdy1gdylusyjtmi.R.inc(67906);
        __CLR4_5_21gdy1gdylusyjtmi.R.inc(67907);Exception error = null;
        __CLR4_5_21gdy1gdylusyjtmi.R.inc(67908);try {
            __CLR4_5_21gdy1gdylusyjtmi.R.inc(67909);JSON.parseObject("{\"vo\":{\"type\":123]", A.class);
        } catch (Exception ex) {
            __CLR4_5_21gdy1gdylusyjtmi.R.inc(67910);error = ex;
        }
        __CLR4_5_21gdy1gdylusyjtmi.R.inc(67911);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gdy1gdylusyjtmi.R.flushNeeded();}}

    public static class A {

        private VO vo;

        public VO getVo() {try{__CLR4_5_21gdy1gdylusyjtmi.R.inc(67912);
            __CLR4_5_21gdy1gdylusyjtmi.R.inc(67913);return vo;
        }finally{__CLR4_5_21gdy1gdylusyjtmi.R.flushNeeded();}}

        public void setVo(VO vo) {try{__CLR4_5_21gdy1gdylusyjtmi.R.inc(67914);
            __CLR4_5_21gdy1gdylusyjtmi.R.inc(67915);this.vo = vo;
        }finally{__CLR4_5_21gdy1gdylusyjtmi.R.flushNeeded();}}

    }

    public static class VO {

        public VO(){try{__CLR4_5_21gdy1gdylusyjtmi.R.inc(67916);

        }finally{__CLR4_5_21gdy1gdylusyjtmi.R.flushNeeded();}}

        private double type;

        public double getType() {try{__CLR4_5_21gdy1gdylusyjtmi.R.inc(67917);
            __CLR4_5_21gdy1gdylusyjtmi.R.inc(67918);return type;
        }finally{__CLR4_5_21gdy1gdylusyjtmi.R.flushNeeded();}}

        public void setType(double type) {try{__CLR4_5_21gdy1gdylusyjtmi.R.inc(67919);
            __CLR4_5_21gdy1gdylusyjtmi.R.inc(67920);this.type = type;
        }finally{__CLR4_5_21gdy1gdylusyjtmi.R.flushNeeded();}}

    }
}
