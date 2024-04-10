/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class JSONLexerTest_12 extends TestCase {static class __CLR4_1_101hbo1hboluszwcfh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,69137,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_error() throws Exception {__CLR4_1_101hbo1hboluszwcfh.R.globalSliceStart(getClass().getName(),69108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1hbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hbo1hboluszwcfh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hbo1hboluszwcfh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_12.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69108,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1hbo() throws Exception{try{__CLR4_1_101hbo1hboluszwcfh.R.inc(69108);
        __CLR4_1_101hbo1hboluszwcfh.R.inc(69109);Exception error = null;
        __CLR4_1_101hbo1hboluszwcfh.R.inc(69110);try {
            __CLR4_1_101hbo1hboluszwcfh.R.inc(69111);JSON.parseObject("{\"type\":92233720368547758071}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hbo1hboluszwcfh.R.inc(69112);error = ex;
        }
        __CLR4_1_101hbo1hboluszwcfh.R.inc(69113);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hbo1hboluszwcfh.R.flushNeeded();}}

    public void test_a() throws Exception {__CLR4_1_101hbo1hboluszwcfh.R.globalSliceStart(getClass().getName(),69114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105yd8w51hbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hbo1hboluszwcfh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hbo1hboluszwcfh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_12.test_a",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69114,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105yd8w51hbu() throws Exception{try{__CLR4_1_101hbo1hboluszwcfh.R.inc(69114);
        __CLR4_1_101hbo1hboluszwcfh.R.inc(69115);Assert.assertEquals(123L, JSON.parseObject("{\"vo\":{\"type\":123}}", A.class).getVo().getType());
    }finally{__CLR4_1_101hbo1hboluszwcfh.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_1_101hbo1hboluszwcfh.R.globalSliceStart(getClass().getName(),69116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1hbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hbo1hboluszwcfh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hbo1hboluszwcfh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_12.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69116,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1hbw() throws Exception{try{__CLR4_1_101hbo1hboluszwcfh.R.inc(69116);
        __CLR4_1_101hbo1hboluszwcfh.R.inc(69117);Exception error = null;
        __CLR4_1_101hbo1hboluszwcfh.R.inc(69118);try {
            __CLR4_1_101hbo1hboluszwcfh.R.inc(69119);JSON.parseObject("{\"vo\":{\"type\":123}[", A.class);
        } catch (Exception ex) {
            __CLR4_1_101hbo1hboluszwcfh.R.inc(69120);error = ex;
        }
        __CLR4_1_101hbo1hboluszwcfh.R.inc(69121);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hbo1hboluszwcfh.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101hbo1hboluszwcfh.R.globalSliceStart(getClass().getName(),69122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1hc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hbo1hboluszwcfh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hbo1hboluszwcfh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_12.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69122,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1hc2() throws Exception{try{__CLR4_1_101hbo1hboluszwcfh.R.inc(69122);
        __CLR4_1_101hbo1hboluszwcfh.R.inc(69123);Exception error = null;
        __CLR4_1_101hbo1hboluszwcfh.R.inc(69124);try {
            __CLR4_1_101hbo1hboluszwcfh.R.inc(69125);JSON.parseObject("{\"vo\":{\"type\":123]", A.class);
        } catch (Exception ex) {
            __CLR4_1_101hbo1hboluszwcfh.R.inc(69126);error = ex;
        }
        __CLR4_1_101hbo1hboluszwcfh.R.inc(69127);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hbo1hboluszwcfh.R.flushNeeded();}}

    public static class A {

        private VO vo;

        public VO getVo() {try{__CLR4_1_101hbo1hboluszwcfh.R.inc(69128);
            __CLR4_1_101hbo1hboluszwcfh.R.inc(69129);return vo;
        }finally{__CLR4_1_101hbo1hboluszwcfh.R.flushNeeded();}}

        public void setVo(VO vo) {try{__CLR4_1_101hbo1hboluszwcfh.R.inc(69130);
            __CLR4_1_101hbo1hboluszwcfh.R.inc(69131);this.vo = vo;
        }finally{__CLR4_1_101hbo1hboluszwcfh.R.flushNeeded();}}

    }

    public static class VO {

        public VO(){try{__CLR4_1_101hbo1hboluszwcfh.R.inc(69132);

        }finally{__CLR4_1_101hbo1hboluszwcfh.R.flushNeeded();}}

        private long type;

        public long getType() {try{__CLR4_1_101hbo1hboluszwcfh.R.inc(69133);
            __CLR4_1_101hbo1hboluszwcfh.R.inc(69134);return type;
        }finally{__CLR4_1_101hbo1hboluszwcfh.R.flushNeeded();}}

        public void setType(long type) {try{__CLR4_1_101hbo1hboluszwcfh.R.inc(69135);
            __CLR4_1_101hbo1hboluszwcfh.R.inc(69136);this.type = type;
        }finally{__CLR4_1_101hbo1hboluszwcfh.R.flushNeeded();}}

    }
}
