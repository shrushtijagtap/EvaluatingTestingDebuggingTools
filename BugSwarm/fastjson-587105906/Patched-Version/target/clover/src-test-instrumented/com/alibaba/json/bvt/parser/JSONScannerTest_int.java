/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.JSONScanner;

/**
 * parseInt
 * 
 * @author wenshao[szujobs@hotmail.com]
 */
public class JSONScannerTest_int extends TestCase {static class __CLR4_5_21if11if1lusvnd2y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,70578,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void ftest_parse_long() throws Exception {try{__CLR4_5_21if11if1lusvnd2y.R.inc(70525);
        __CLR4_5_21if11if1lusvnd2y.R.inc(70526);System.out.println(System.currentTimeMillis());
        __CLR4_5_21if11if1lusvnd2y.R.inc(70527);JSONScanner lexer = new JSONScanner("1293770846");
        __CLR4_5_21if11if1lusvnd2y.R.inc(70528);lexer.scanNumber();
        __CLR4_5_21if11if1lusvnd2y.R.inc(70529);Assert.assertEquals(new Integer(1293770846), (Integer) lexer.integerValue());
        __CLR4_5_21if11if1lusvnd2y.R.inc(70530);Assert.assertEquals(1293770846, lexer.intValue());
    }finally{__CLR4_5_21if11if1lusvnd2y.R.flushNeeded();}}

    public void ftest_parse_long_1() throws Exception {try{__CLR4_5_21if11if1lusvnd2y.R.inc(70531);
        __CLR4_5_21if11if1lusvnd2y.R.inc(70532);System.out.println(System.currentTimeMillis());
        __CLR4_5_21if11if1lusvnd2y.R.inc(70533);JSONScanner lexer = new JSONScanner(Integer.toString(Integer.MAX_VALUE));
        __CLR4_5_21if11if1lusvnd2y.R.inc(70534);lexer.scanNumber();
        __CLR4_5_21if11if1lusvnd2y.R.inc(70535);Assert.assertEquals(new Integer(Integer.MAX_VALUE), (Integer) lexer.integerValue());
        __CLR4_5_21if11if1lusvnd2y.R.inc(70536);Assert.assertEquals(Integer.MAX_VALUE, lexer.intValue());
    }finally{__CLR4_5_21if11if1lusvnd2y.R.flushNeeded();}}

    public void test_parse_long_2() throws Exception {__CLR4_5_21if11if1lusvnd2y.R.globalSliceStart(getClass().getName(),70537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzmmfj1ifd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21if11if1lusvnd2y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21if11if1lusvnd2y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_parse_long_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70537,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzmmfj1ifd() throws Exception{try{__CLR4_5_21if11if1lusvnd2y.R.inc(70537);
        __CLR4_5_21if11if1lusvnd2y.R.inc(70538);System.out.println(System.currentTimeMillis());
        __CLR4_5_21if11if1lusvnd2y.R.inc(70539);JSONScanner lexer = new JSONScanner(Long.toString(Integer.MIN_VALUE));
        __CLR4_5_21if11if1lusvnd2y.R.inc(70540);lexer.scanNumber();
        __CLR4_5_21if11if1lusvnd2y.R.inc(70541);Assert.assertEquals(new Integer(Integer.MIN_VALUE), (Integer) lexer.integerValue());
        __CLR4_5_21if11if1lusvnd2y.R.inc(70542);Assert.assertEquals(Integer.MIN_VALUE, lexer.intValue());
    }finally{__CLR4_5_21if11if1lusvnd2y.R.flushNeeded();}}

    public void test_error_0() {__CLR4_5_21if11if1lusvnd2y.R.globalSliceStart(getClass().getName(),70543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1ifj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21if11if1lusvnd2y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21if11if1lusvnd2y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70543,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1ifj(){try{__CLR4_5_21if11if1lusvnd2y.R.inc(70543);
        __CLR4_5_21if11if1lusvnd2y.R.inc(70544);Exception error = null;
        __CLR4_5_21if11if1lusvnd2y.R.inc(70545);try {
            __CLR4_5_21if11if1lusvnd2y.R.inc(70546);JSONScanner lexer = new JSONScanner("--");
            __CLR4_5_21if11if1lusvnd2y.R.inc(70547);lexer.scanNumber();
            __CLR4_5_21if11if1lusvnd2y.R.inc(70548);lexer.intValue();
        } catch (Exception ex) {
            __CLR4_5_21if11if1lusvnd2y.R.inc(70549);error = ex;
        }
        __CLR4_5_21if11if1lusvnd2y.R.inc(70550);Assert.assertNotNull(error);
    }finally{__CLR4_5_21if11if1lusvnd2y.R.flushNeeded();}}

    public void test_error_1() {__CLR4_5_21if11if1lusvnd2y.R.globalSliceStart(getClass().getName(),70551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1ifr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21if11if1lusvnd2y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21if11if1lusvnd2y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70551,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1ifr(){try{__CLR4_5_21if11if1lusvnd2y.R.inc(70551);
        __CLR4_5_21if11if1lusvnd2y.R.inc(70552);Exception error = null;
        __CLR4_5_21if11if1lusvnd2y.R.inc(70553);try {
            __CLR4_5_21if11if1lusvnd2y.R.inc(70554);String text = Integer.MAX_VALUE + "1234";
            __CLR4_5_21if11if1lusvnd2y.R.inc(70555);JSONScanner lexer = new JSONScanner(text);
            __CLR4_5_21if11if1lusvnd2y.R.inc(70556);lexer.scanNumber();
            __CLR4_5_21if11if1lusvnd2y.R.inc(70557);lexer.intValue();
        } catch (Exception ex) {
            __CLR4_5_21if11if1lusvnd2y.R.inc(70558);error = ex;
        }
        __CLR4_5_21if11if1lusvnd2y.R.inc(70559);Assert.assertNotNull(error);
    }finally{__CLR4_5_21if11if1lusvnd2y.R.flushNeeded();}}

    public void test_error_2() {__CLR4_5_21if11if1lusvnd2y.R.globalSliceStart(getClass().getName(),70560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1ig0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21if11if1lusvnd2y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21if11if1lusvnd2y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1ig0(){try{__CLR4_5_21if11if1lusvnd2y.R.inc(70560);
        __CLR4_5_21if11if1lusvnd2y.R.inc(70561);Exception error = null;
        __CLR4_5_21if11if1lusvnd2y.R.inc(70562);try {
            __CLR4_5_21if11if1lusvnd2y.R.inc(70563);String text = Integer.MIN_VALUE + "1234";
            __CLR4_5_21if11if1lusvnd2y.R.inc(70564);JSONScanner lexer = new JSONScanner(text);
            __CLR4_5_21if11if1lusvnd2y.R.inc(70565);lexer.scanNumber();
            __CLR4_5_21if11if1lusvnd2y.R.inc(70566);lexer.intValue();
        } catch (Exception ex) {
            __CLR4_5_21if11if1lusvnd2y.R.inc(70567);error = ex;
        }
        __CLR4_5_21if11if1lusvnd2y.R.inc(70568);Assert.assertNotNull(error);
    }finally{__CLR4_5_21if11if1lusvnd2y.R.flushNeeded();}}

    public void test_error_3() {__CLR4_5_21if11if1lusvnd2y.R.globalSliceStart(getClass().getName(),70569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1ig9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21if11if1lusvnd2y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21if11if1lusvnd2y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_int.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70569,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1ig9(){try{__CLR4_5_21if11if1lusvnd2y.R.inc(70569);
        __CLR4_5_21if11if1lusvnd2y.R.inc(70570);Exception error = null;
        __CLR4_5_21if11if1lusvnd2y.R.inc(70571);try {
            __CLR4_5_21if11if1lusvnd2y.R.inc(70572);String text = "2147483648";
            __CLR4_5_21if11if1lusvnd2y.R.inc(70573);JSONScanner lexer = new JSONScanner(text);
            __CLR4_5_21if11if1lusvnd2y.R.inc(70574);lexer.scanNumber();
            __CLR4_5_21if11if1lusvnd2y.R.inc(70575);lexer.intValue();
        } catch (Exception ex) {
            __CLR4_5_21if11if1lusvnd2y.R.inc(70576);error = ex;
        }
        __CLR4_5_21if11if1lusvnd2y.R.inc(70577);Assert.assertNotNull(error);
    }finally{__CLR4_5_21if11if1lusvnd2y.R.flushNeeded();}}
}
