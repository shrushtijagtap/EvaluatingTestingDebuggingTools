/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class JSONLexerTest_7 extends TestCase {static class __CLR4_5_21hgj1hgjlusvncr1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,69333,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_treeSet() throws Exception {__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceStart(getClass().getName(),69283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nqro9q1hgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hgj1hgjlusvncr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_7.test_treeSet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69283,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nqro9q1hgj() throws Exception{try{__CLR4_5_21hgj1hgjlusvncr1.R.inc(69283);
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69284);JSON.parse("TreeSet[]");
    }finally{__CLR4_5_21hgj1hgjlusvncr1.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceStart(getClass().getName(),69285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1hgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hgj1hgjlusvncr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_7.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1hgl() throws Exception{try{__CLR4_5_21hgj1hgjlusvncr1.R.inc(69285);
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69286);Exception error = null;
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69287);try {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69288);JSON.parse("T_eeSet[]");
        } catch (Exception ex) {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69289);error = ex;
        }
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69290);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hgj1hgjlusvncr1.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceStart(getClass().getName(),69291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1hgr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hgj1hgjlusvncr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_7.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69291,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1hgr() throws Exception{try{__CLR4_5_21hgj1hgjlusvncr1.R.inc(69291);
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69292);Exception error = null;
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69293);try {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69294);JSON.parse("Tr_eSet[]");
        } catch (Exception ex) {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69295);error = ex;
        }
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69296);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hgj1hgjlusvncr1.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceStart(getClass().getName(),69297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1hgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hgj1hgjlusvncr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_7.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69297,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1hgx() throws Exception{try{__CLR4_5_21hgj1hgjlusvncr1.R.inc(69297);
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69298);Exception error = null;
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69299);try {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69300);JSON.parse("Tre_Set[]");
        } catch (Exception ex) {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69301);error = ex;
        }
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69302);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hgj1hgjlusvncr1.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceStart(getClass().getName(),69303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1hh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hgj1hgjlusvncr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_7.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1hh3() throws Exception{try{__CLR4_5_21hgj1hgjlusvncr1.R.inc(69303);
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69304);Exception error = null;
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69305);try {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69306);JSON.parse("Tree_et[]");
        } catch (Exception ex) {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69307);error = ex;
        }
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69308);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hgj1hgjlusvncr1.R.flushNeeded();}}
    
    
    public void test_error_4() throws Exception {__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceStart(getClass().getName(),69309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1hh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hgj1hgjlusvncr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_7.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1hh9() throws Exception{try{__CLR4_5_21hgj1hgjlusvncr1.R.inc(69309);
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69310);Exception error = null;
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69311);try {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69312);JSON.parse("TreeS_t[]");
        } catch (Exception ex) {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69313);error = ex;
        }
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69314);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hgj1hgjlusvncr1.R.flushNeeded();}}
    
    
    public void test_error_5() throws Exception {__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceStart(getClass().getName(),69315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81hhf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hgj1hgjlusvncr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_7.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69315,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81hhf() throws Exception{try{__CLR4_5_21hgj1hgjlusvncr1.R.inc(69315);
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69316);Exception error = null;
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69317);try {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69318);JSON.parse("TreeSe_[]");
        } catch (Exception ex) {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69319);error = ex;
        }
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69320);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hgj1hgjlusvncr1.R.flushNeeded();}}
    
    public void test_error_6() throws Exception {__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceStart(getClass().getName(),69321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1hhl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hgj1hgjlusvncr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_7.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1hhl() throws Exception{try{__CLR4_5_21hgj1hgjlusvncr1.R.inc(69321);
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69322);Exception error = null;
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69323);try {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69324);JSON.parse("TreeSet_[]");
        } catch (Exception ex) {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69325);error = ex;
        }
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69326);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hgj1hgjlusvncr1.R.flushNeeded();}}
    
    public void test_error_7() throws Exception {__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceStart(getClass().getName(),69327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9rshy1hhr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hgj1hgjlusvncr1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hgj1hgjlusvncr1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_7.test_error_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69327,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9rshy1hhr() throws Exception{try{__CLR4_5_21hgj1hgjlusvncr1.R.inc(69327);
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69328);Exception error = null;
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69329);try {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69330);JSON.parse("XreeSet[]");
        } catch (Exception ex) {
            __CLR4_5_21hgj1hgjlusvncr1.R.inc(69331);error = ex;
        }
        __CLR4_5_21hgj1hgjlusvncr1.R.inc(69332);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hgj1hgjlusvncr1.R.flushNeeded();}}
}
