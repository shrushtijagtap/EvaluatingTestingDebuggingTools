/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class JSONLexerTest_13 extends TestCase {static class __CLR4_1_101ge91ge9lusqkd8l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,67932,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_e() throws Exception {__CLR4_1_101ge91ge9lusqkd8l.R.globalSliceStart(getClass().getName(),67905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1071mm9r1ge9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ge91ge9lusqkd8l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ge91ge9lusqkd8l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_13.test_e",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67905,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1071mm9r1ge9() throws Exception{try{__CLR4_1_101ge91ge9lusqkd8l.R.inc(67905);
        __CLR4_1_101ge91ge9lusqkd8l.R.inc(67906);Assert.assertTrue(123e3D == JSON.parseObject("{\"vo\":{\"type\":123e3}}", A.class).getVo().getType());
    }finally{__CLR4_1_101ge91ge9lusqkd8l.R.flushNeeded();}}

    public void test_E() throws Exception {__CLR4_1_101ge91ge9lusqkd8l.R.globalSliceStart(getClass().getName(),67907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10px89291geb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ge91ge9lusqkd8l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ge91ge9lusqkd8l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_13.test_E",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67907,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10px89291geb() throws Exception{try{__CLR4_1_101ge91ge9lusqkd8l.R.inc(67907);
        __CLR4_1_101ge91ge9lusqkd8l.R.inc(67908);Assert.assertTrue(123e3D == JSON.parseObject("{\"vo\":{\"type\":123E3}}", A.class).getVo().getType());
    }finally{__CLR4_1_101ge91ge9lusqkd8l.R.flushNeeded();}}
    
    public void test_e_plus() throws Exception {__CLR4_1_101ge91ge9lusqkd8l.R.globalSliceStart(getClass().getName(),67909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108owhnc1ged();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ge91ge9lusqkd8l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ge91ge9lusqkd8l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_13.test_e_plus",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67909,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108owhnc1ged() throws Exception{try{__CLR4_1_101ge91ge9lusqkd8l.R.inc(67909);
        __CLR4_1_101ge91ge9lusqkd8l.R.inc(67910);Assert.assertTrue(123e3D == JSON.parseObject("{\"vo\":{\"type\":123e+3}}", A.class).getVo().getType());
    }finally{__CLR4_1_101ge91ge9lusqkd8l.R.flushNeeded();}}
    
    public void test_E_plus() throws Exception {__CLR4_1_101ge91ge9lusqkd8l.R.globalSliceStart(getClass().getName(),67911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107sp22w1gef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ge91ge9lusqkd8l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ge91ge9lusqkd8l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_13.test_E_plus",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67911,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107sp22w1gef() throws Exception{try{__CLR4_1_101ge91ge9lusqkd8l.R.inc(67911);
        __CLR4_1_101ge91ge9lusqkd8l.R.inc(67912);Assert.assertTrue(123e3D == JSON.parseObject("{\"vo\":{\"type\":123E+3}}", A.class).getVo().getType());
    }finally{__CLR4_1_101ge91ge9lusqkd8l.R.flushNeeded();}}
    
    public void test_e_minus() throws Exception {__CLR4_1_101ge91ge9lusqkd8l.R.globalSliceStart(getClass().getName(),67913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jc1xu81geh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ge91ge9lusqkd8l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ge91ge9lusqkd8l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_13.test_e_minus",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67913,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jc1xu81geh() throws Exception{try{__CLR4_1_101ge91ge9lusqkd8l.R.inc(67913);
        __CLR4_1_101ge91ge9lusqkd8l.R.inc(67914);Assert.assertTrue(123e-3D == JSON.parseObject("{\"vo\":{\"type\":123e-3}}", A.class).getVo().getType());
    }finally{__CLR4_1_101ge91ge9lusqkd8l.R.flushNeeded();}}
    
    public void test_E_minus() throws Exception {__CLR4_1_101ge91ge9lusqkd8l.R.globalSliceStart(getClass().getName(),67915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9tjlc1gej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ge91ge9lusqkd8l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ge91ge9lusqkd8l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_13.test_E_minus",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67915,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9tjlc1gej() throws Exception{try{__CLR4_1_101ge91ge9lusqkd8l.R.inc(67915);
        __CLR4_1_101ge91ge9lusqkd8l.R.inc(67916);Assert.assertTrue(123e-3D == JSON.parseObject("{\"vo\":{\"type\":123E-3}}", A.class).getVo().getType());
    }finally{__CLR4_1_101ge91ge9lusqkd8l.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101ge91ge9lusqkd8l.R.globalSliceStart(getClass().getName(),67917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1gel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ge91ge9lusqkd8l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ge91ge9lusqkd8l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_13.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67917,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1gel() throws Exception{try{__CLR4_1_101ge91ge9lusqkd8l.R.inc(67917);
        __CLR4_1_101ge91ge9lusqkd8l.R.inc(67918);Exception error = null;
        __CLR4_1_101ge91ge9lusqkd8l.R.inc(67919);try {
            __CLR4_1_101ge91ge9lusqkd8l.R.inc(67920);JSON.parseObject("{\"vo\":{\"type\":123]", A.class);
        } catch (Exception ex) {
            __CLR4_1_101ge91ge9lusqkd8l.R.inc(67921);error = ex;
        }
        __CLR4_1_101ge91ge9lusqkd8l.R.inc(67922);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ge91ge9lusqkd8l.R.flushNeeded();}}

    public static class A {

        private VO vo;

        public VO getVo() {try{__CLR4_1_101ge91ge9lusqkd8l.R.inc(67923);
            __CLR4_1_101ge91ge9lusqkd8l.R.inc(67924);return vo;
        }finally{__CLR4_1_101ge91ge9lusqkd8l.R.flushNeeded();}}

        public void setVo(VO vo) {try{__CLR4_1_101ge91ge9lusqkd8l.R.inc(67925);
            __CLR4_1_101ge91ge9lusqkd8l.R.inc(67926);this.vo = vo;
        }finally{__CLR4_1_101ge91ge9lusqkd8l.R.flushNeeded();}}

    }

    public static class VO {

        public VO(){try{__CLR4_1_101ge91ge9lusqkd8l.R.inc(67927);

        }finally{__CLR4_1_101ge91ge9lusqkd8l.R.flushNeeded();}}

        private double type;

        public double getType() {try{__CLR4_1_101ge91ge9lusqkd8l.R.inc(67928);
            __CLR4_1_101ge91ge9lusqkd8l.R.inc(67929);return type;
        }finally{__CLR4_1_101ge91ge9lusqkd8l.R.flushNeeded();}}

        public void setType(double type) {try{__CLR4_1_101ge91ge9lusqkd8l.R.inc(67930);
            __CLR4_1_101ge91ge9lusqkd8l.R.inc(67931);this.type = type;
        }finally{__CLR4_1_101ge91ge9lusqkd8l.R.flushNeeded();}}

    }
}
