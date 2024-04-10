/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.JSONScanner;

/**
 * parseInt
 * 
 * @author wenshao[szujobs@hotmail.com]
 */
public class JSONScannerTest_int extends TestCase {static class __CLR4_5_21hgt1hgtlusyjtpi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,69346,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void ftest_parse_long() throws Exception {try{__CLR4_5_21hgt1hgtlusyjtpi.R.inc(69293);
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69294);System.out.println(System.currentTimeMillis());
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69295);JSONScanner lexer = new JSONScanner("1293770846");
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69296);lexer.scanNumber();
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69297);Assert.assertEquals(new Integer(1293770846), (Integer) lexer.integerValue());
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69298);Assert.assertEquals(1293770846, lexer.intValue());
    }finally{__CLR4_5_21hgt1hgtlusyjtpi.R.flushNeeded();}}

    public void ftest_parse_long_1() throws Exception {try{__CLR4_5_21hgt1hgtlusyjtpi.R.inc(69299);
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69300);System.out.println(System.currentTimeMillis());
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69301);JSONScanner lexer = new JSONScanner(Integer.toString(Integer.MAX_VALUE));
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69302);lexer.scanNumber();
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69303);Assert.assertEquals(new Integer(Integer.MAX_VALUE), (Integer) lexer.integerValue());
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69304);Assert.assertEquals(Integer.MAX_VALUE, lexer.intValue());
    }finally{__CLR4_5_21hgt1hgtlusyjtpi.R.flushNeeded();}}

    public void test_parse_long_2() throws Exception {__CLR4_5_21hgt1hgtlusyjtpi.R.globalSliceStart(getClass().getName(),69305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzmmfj1hh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hgt1hgtlusyjtpi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hgt1hgtlusyjtpi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_parse_long_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69305,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzmmfj1hh5() throws Exception{try{__CLR4_5_21hgt1hgtlusyjtpi.R.inc(69305);
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69306);System.out.println(System.currentTimeMillis());
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69307);JSONScanner lexer = new JSONScanner(Long.toString(Integer.MIN_VALUE));
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69308);lexer.scanNumber();
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69309);Assert.assertEquals(new Integer(Integer.MIN_VALUE), (Integer) lexer.integerValue());
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69310);Assert.assertEquals(Integer.MIN_VALUE, lexer.intValue());
    }finally{__CLR4_5_21hgt1hgtlusyjtpi.R.flushNeeded();}}

    public void test_error_0() {__CLR4_5_21hgt1hgtlusyjtpi.R.globalSliceStart(getClass().getName(),69311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1hhb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hgt1hgtlusyjtpi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hgt1hgtlusyjtpi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69311,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1hhb(){try{__CLR4_5_21hgt1hgtlusyjtpi.R.inc(69311);
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69312);Exception error = null;
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69313);try {
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69314);JSONScanner lexer = new JSONScanner("--");
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69315);lexer.scanNumber();
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69316);lexer.intValue();
        } catch (Exception ex) {
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69317);error = ex;
        }
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69318);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hgt1hgtlusyjtpi.R.flushNeeded();}}

    public void test_error_1() {__CLR4_5_21hgt1hgtlusyjtpi.R.globalSliceStart(getClass().getName(),69319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1hhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hgt1hgtlusyjtpi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hgt1hgtlusyjtpi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69319,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1hhj(){try{__CLR4_5_21hgt1hgtlusyjtpi.R.inc(69319);
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69320);Exception error = null;
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69321);try {
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69322);String text = Integer.MAX_VALUE + "1234";
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69323);JSONScanner lexer = new JSONScanner(text);
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69324);lexer.scanNumber();
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69325);lexer.intValue();
        } catch (Exception ex) {
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69326);error = ex;
        }
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69327);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hgt1hgtlusyjtpi.R.flushNeeded();}}

    public void test_error_2() {__CLR4_5_21hgt1hgtlusyjtpi.R.globalSliceStart(getClass().getName(),69328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1hhs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hgt1hgtlusyjtpi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hgt1hgtlusyjtpi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1hhs(){try{__CLR4_5_21hgt1hgtlusyjtpi.R.inc(69328);
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69329);Exception error = null;
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69330);try {
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69331);String text = Integer.MIN_VALUE + "1234";
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69332);JSONScanner lexer = new JSONScanner(text);
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69333);lexer.scanNumber();
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69334);lexer.intValue();
        } catch (Exception ex) {
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69335);error = ex;
        }
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69336);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hgt1hgtlusyjtpi.R.flushNeeded();}}

    public void test_error_3() {__CLR4_5_21hgt1hgtlusyjtpi.R.globalSliceStart(getClass().getName(),69337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1hi1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hgt1hgtlusyjtpi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hgt1hgtlusyjtpi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69337,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1hi1(){try{__CLR4_5_21hgt1hgtlusyjtpi.R.inc(69337);
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69338);Exception error = null;
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69339);try {
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69340);String text = "2147483648";
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69341);JSONScanner lexer = new JSONScanner(text);
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69342);lexer.scanNumber();
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69343);lexer.intValue();
        } catch (Exception ex) {
            __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69344);error = ex;
        }
        __CLR4_5_21hgt1hgtlusyjtpi.R.inc(69345);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hgt1hgtlusyjtpi.R.flushNeeded();}}
}
