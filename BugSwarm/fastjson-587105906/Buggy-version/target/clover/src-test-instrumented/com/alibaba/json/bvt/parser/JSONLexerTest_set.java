/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class JSONLexerTest_set extends TestCase {static class __CLR4_1_101gku1gkulusqkdc0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,68168,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_treeSet() throws Exception {__CLR4_1_101gku1gkulusqkdc0.R.globalSliceStart(getClass().getName(),68142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nqro9q1gku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gku1gkulusqkdc0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gku1gkulusqkdc0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_set.test_treeSet",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68142,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nqro9q1gku() throws Exception{try{__CLR4_1_101gku1gkulusqkdc0.R.inc(68142);
        __CLR4_1_101gku1gkulusqkdc0.R.inc(68143);JSON.parse("Set[]");
    }finally{__CLR4_1_101gku1gkulusqkdc0.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101gku1gkulusqkdc0.R.globalSliceStart(getClass().getName(),68144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1gkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gku1gkulusqkdc0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gku1gkulusqkdc0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_set.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68144,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1gkw() throws Exception{try{__CLR4_1_101gku1gkulusqkdc0.R.inc(68144);
        __CLR4_1_101gku1gkulusqkdc0.R.inc(68145);Exception error = null;
        __CLR4_1_101gku1gkulusqkdc0.R.inc(68146);try {
            __CLR4_1_101gku1gkulusqkdc0.R.inc(68147);JSON.parse("S_t[]");
        } catch (Exception ex) {
            __CLR4_1_101gku1gkulusqkdc0.R.inc(68148);error = ex;
        }
        __CLR4_1_101gku1gkulusqkdc0.R.inc(68149);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gku1gkulusqkdc0.R.flushNeeded();}}
   
    public void test_error_1() throws Exception {__CLR4_1_101gku1gkulusqkdc0.R.globalSliceStart(getClass().getName(),68150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1gl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gku1gkulusqkdc0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gku1gkulusqkdc0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_set.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68150,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1gl2() throws Exception{try{__CLR4_1_101gku1gkulusqkdc0.R.inc(68150);
        __CLR4_1_101gku1gkulusqkdc0.R.inc(68151);Exception error = null;
        __CLR4_1_101gku1gkulusqkdc0.R.inc(68152);try {
            __CLR4_1_101gku1gkulusqkdc0.R.inc(68153);JSON.parse("Se_[]");
        } catch (Exception ex) {
            __CLR4_1_101gku1gkulusqkdc0.R.inc(68154);error = ex;
        }
        __CLR4_1_101gku1gkulusqkdc0.R.inc(68155);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gku1gkulusqkdc0.R.flushNeeded();}}
    
    
    public void test_error_2() throws Exception {__CLR4_1_101gku1gkulusqkdc0.R.globalSliceStart(getClass().getName(),68156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1gl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gku1gkulusqkdc0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gku1gkulusqkdc0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_set.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68156,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1gl8() throws Exception{try{__CLR4_1_101gku1gkulusqkdc0.R.inc(68156);
        __CLR4_1_101gku1gkulusqkdc0.R.inc(68157);Exception error = null;
        __CLR4_1_101gku1gkulusqkdc0.R.inc(68158);try {
            __CLR4_1_101gku1gkulusqkdc0.R.inc(68159);JSON.parse("Set_[]");
        } catch (Exception ex) {
            __CLR4_1_101gku1gkulusqkdc0.R.inc(68160);error = ex;
        }
        __CLR4_1_101gku1gkulusqkdc0.R.inc(68161);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gku1gkulusqkdc0.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101gku1gkulusqkdc0.R.globalSliceStart(getClass().getName(),68162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1gle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gku1gkulusqkdc0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gku1gkulusqkdc0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_set.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68162,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1gle() throws Exception{try{__CLR4_1_101gku1gkulusqkdc0.R.inc(68162);
        __CLR4_1_101gku1gkulusqkdc0.R.inc(68163);Exception error = null;
        __CLR4_1_101gku1gkulusqkdc0.R.inc(68164);try {
            __CLR4_1_101gku1gkulusqkdc0.R.inc(68165);JSON.parse("Xet[]");
        } catch (Exception ex) {
            __CLR4_1_101gku1gkulusqkdc0.R.inc(68166);error = ex;
        }
        __CLR4_1_101gku1gkulusqkdc0.R.inc(68167);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gku1gkulusqkdc0.R.flushNeeded();}}
}
