/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.JSONScanner;

/**
 * parseLong
 * 
 * @author wenshao[szujobs@hotmail.com]
 */
public class JSONScannerTest_long extends TestCase {static class __CLR4_5_21hir1hirlusyjtpp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,69416,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void ftest_parse_long() throws Exception {try{__CLR4_5_21hir1hirlusyjtpp.R.inc(69363);
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69364);System.out.println(System.currentTimeMillis());
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69365);JSONScanner lexer = new JSONScanner("1293770846476");
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69366);lexer.scanNumber();
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69367);Assert.assertEquals(new Long(1293770846476L), (Long) lexer.integerValue());
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69368);Assert.assertEquals(1293770846476L, lexer.longValue());
    }finally{__CLR4_5_21hir1hirlusyjtpp.R.flushNeeded();}}

    public void ftest_parse_long_1() throws Exception {try{__CLR4_5_21hir1hirlusyjtpp.R.inc(69369);
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69370);System.out.println(System.currentTimeMillis());
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69371);JSONScanner lexer = new JSONScanner(Long.toString(Long.MAX_VALUE));
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69372);lexer.scanNumber();
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69373);Assert.assertEquals(new Long(Long.MAX_VALUE), (Long) lexer.integerValue());
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69374);Assert.assertEquals(Long.MAX_VALUE, lexer.longValue());
    }finally{__CLR4_5_21hir1hirlusyjtpp.R.flushNeeded();}}

    public void test_parse_long_2() throws Exception {__CLR4_5_21hir1hirlusyjtpp.R.globalSliceStart(getClass().getName(),69375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzmmfj1hj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hir1hirlusyjtpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hir1hirlusyjtpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_parse_long_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69375,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzmmfj1hj3() throws Exception{try{__CLR4_5_21hir1hirlusyjtpp.R.inc(69375);
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69376);System.out.println(System.currentTimeMillis());
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69377);JSONScanner lexer = new JSONScanner(Long.toString(Long.MIN_VALUE));
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69378);lexer.scanNumber();
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69379);Assert.assertEquals(new Long(Long.MIN_VALUE), (Long) lexer.integerValue());
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69380);Assert.assertEquals(Long.MIN_VALUE, lexer.longValue());
    }finally{__CLR4_5_21hir1hirlusyjtpp.R.flushNeeded();}}

    public void test_error_0() {__CLR4_5_21hir1hirlusyjtpp.R.globalSliceStart(getClass().getName(),69381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1hj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hir1hirlusyjtpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hir1hirlusyjtpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69381,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1hj9(){try{__CLR4_5_21hir1hirlusyjtpp.R.inc(69381);
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69382);Exception error = null;
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69383);try {
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69384);JSONScanner lexer = new JSONScanner("--");
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69385);lexer.scanNumber();
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69386);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69387);error = ex;
        }
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69388);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hir1hirlusyjtpp.R.flushNeeded();}}

    public void test_error_1() {__CLR4_5_21hir1hirlusyjtpp.R.globalSliceStart(getClass().getName(),69389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1hjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hir1hirlusyjtpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hir1hirlusyjtpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69389,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1hjh(){try{__CLR4_5_21hir1hirlusyjtpp.R.inc(69389);
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69390);Exception error = null;
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69391);try {
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69392);String text = Long.MAX_VALUE + "1234";
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69393);JSONScanner lexer = new JSONScanner(text);
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69394);lexer.scanNumber();
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69395);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69396);error = ex;
        }
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69397);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hir1hirlusyjtpp.R.flushNeeded();}}

    public void test_error_2() {__CLR4_5_21hir1hirlusyjtpp.R.globalSliceStart(getClass().getName(),69398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1hjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hir1hirlusyjtpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hir1hirlusyjtpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1hjq(){try{__CLR4_5_21hir1hirlusyjtpp.R.inc(69398);
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69399);Exception error = null;
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69400);try {
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69401);String text = Long.MIN_VALUE + "1234";
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69402);JSONScanner lexer = new JSONScanner(text);
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69403);lexer.scanNumber();
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69404);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69405);error = ex;
        }
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69406);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hir1hirlusyjtpp.R.flushNeeded();}}

    public void test_error_3() {__CLR4_5_21hir1hirlusyjtpp.R.globalSliceStart(getClass().getName(),69407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1hjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hir1hirlusyjtpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hir1hirlusyjtpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69407,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1hjz(){try{__CLR4_5_21hir1hirlusyjtpp.R.inc(69407);
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69408);Exception error = null;
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69409);try {
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69410);String text = "9223372036854775809";
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69411);JSONScanner lexer = new JSONScanner(text);
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69412);lexer.scanNumber();
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69413);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_5_21hir1hirlusyjtpp.R.inc(69414);error = ex;
        }
        __CLR4_5_21hir1hirlusyjtpp.R.inc(69415);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hir1hirlusyjtpp.R.flushNeeded();}}
}
