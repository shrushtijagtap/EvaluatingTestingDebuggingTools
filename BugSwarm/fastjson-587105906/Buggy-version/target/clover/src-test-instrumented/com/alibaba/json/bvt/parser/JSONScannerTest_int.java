/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.JSONScanner;

/**
 * parseInt
 * 
 * @author wenshao[szujobs@hotmail.com]
 */
public class JSONScannerTest_int extends TestCase {static class __CLR4_1_101hh41hh4lusqkdnv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,69357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void ftest_parse_long() throws Exception {try{__CLR4_1_101hh41hh4lusqkdnv.R.inc(69304);
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69305);System.out.println(System.currentTimeMillis());
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69306);JSONScanner lexer = new JSONScanner("1293770846");
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69307);lexer.scanNumber();
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69308);Assert.assertEquals(new Integer(1293770846), (Integer) lexer.integerValue());
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69309);Assert.assertEquals(1293770846, lexer.intValue());
    }finally{__CLR4_1_101hh41hh4lusqkdnv.R.flushNeeded();}}

    public void ftest_parse_long_1() throws Exception {try{__CLR4_1_101hh41hh4lusqkdnv.R.inc(69310);
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69311);System.out.println(System.currentTimeMillis());
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69312);JSONScanner lexer = new JSONScanner(Integer.toString(Integer.MAX_VALUE));
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69313);lexer.scanNumber();
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69314);Assert.assertEquals(new Integer(Integer.MAX_VALUE), (Integer) lexer.integerValue());
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69315);Assert.assertEquals(Integer.MAX_VALUE, lexer.intValue());
    }finally{__CLR4_1_101hh41hh4lusqkdnv.R.flushNeeded();}}

    public void test_parse_long_2() throws Exception {__CLR4_1_101hh41hh4lusqkdnv.R.globalSliceStart(getClass().getName(),69316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pzmmfj1hhg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hh41hh4lusqkdnv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hh41hh4lusqkdnv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_parse_long_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69316,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pzmmfj1hhg() throws Exception{try{__CLR4_1_101hh41hh4lusqkdnv.R.inc(69316);
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69317);System.out.println(System.currentTimeMillis());
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69318);JSONScanner lexer = new JSONScanner(Long.toString(Integer.MIN_VALUE));
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69319);lexer.scanNumber();
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69320);Assert.assertEquals(new Integer(Integer.MIN_VALUE), (Integer) lexer.integerValue());
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69321);Assert.assertEquals(Integer.MIN_VALUE, lexer.intValue());
    }finally{__CLR4_1_101hh41hh4lusqkdnv.R.flushNeeded();}}

    public void test_error_0() {__CLR4_1_101hh41hh4lusqkdnv.R.globalSliceStart(getClass().getName(),69322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1hhm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hh41hh4lusqkdnv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hh41hh4lusqkdnv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69322,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1hhm(){try{__CLR4_1_101hh41hh4lusqkdnv.R.inc(69322);
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69323);Exception error = null;
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69324);try {
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69325);JSONScanner lexer = new JSONScanner("--");
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69326);lexer.scanNumber();
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69327);lexer.intValue();
        } catch (Exception ex) {
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69328);error = ex;
        }
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69329);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hh41hh4lusqkdnv.R.flushNeeded();}}

    public void test_error_1() {__CLR4_1_101hh41hh4lusqkdnv.R.globalSliceStart(getClass().getName(),69330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1hhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hh41hh4lusqkdnv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hh41hh4lusqkdnv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69330,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1hhu(){try{__CLR4_1_101hh41hh4lusqkdnv.R.inc(69330);
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69331);Exception error = null;
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69332);try {
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69333);String text = Integer.MAX_VALUE + "1234";
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69334);JSONScanner lexer = new JSONScanner(text);
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69335);lexer.scanNumber();
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69336);lexer.intValue();
        } catch (Exception ex) {
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69337);error = ex;
        }
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69338);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hh41hh4lusqkdnv.R.flushNeeded();}}

    public void test_error_2() {__CLR4_1_101hh41hh4lusqkdnv.R.globalSliceStart(getClass().getName(),69339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1hi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hh41hh4lusqkdnv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hh41hh4lusqkdnv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69339,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1hi3(){try{__CLR4_1_101hh41hh4lusqkdnv.R.inc(69339);
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69340);Exception error = null;
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69341);try {
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69342);String text = Integer.MIN_VALUE + "1234";
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69343);JSONScanner lexer = new JSONScanner(text);
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69344);lexer.scanNumber();
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69345);lexer.intValue();
        } catch (Exception ex) {
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69346);error = ex;
        }
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69347);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hh41hh4lusqkdnv.R.flushNeeded();}}

    public void test_error_3() {__CLR4_1_101hh41hh4lusqkdnv.R.globalSliceStart(getClass().getName(),69348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1hic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hh41hh4lusqkdnv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hh41hh4lusqkdnv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69348,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1hic(){try{__CLR4_1_101hh41hh4lusqkdnv.R.inc(69348);
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69349);Exception error = null;
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69350);try {
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69351);String text = "2147483648";
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69352);JSONScanner lexer = new JSONScanner(text);
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69353);lexer.scanNumber();
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69354);lexer.intValue();
        } catch (Exception ex) {
            __CLR4_1_101hh41hh4lusqkdnv.R.inc(69355);error = ex;
        }
        __CLR4_1_101hh41hh4lusqkdnv.R.inc(69356);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hh41hh4lusqkdnv.R.flushNeeded();}}
}
