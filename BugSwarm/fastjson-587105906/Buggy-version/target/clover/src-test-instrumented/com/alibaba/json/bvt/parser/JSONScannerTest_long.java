/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.JSONScanner;

/**
 * parseLong
 * 
 * @author wenshao[szujobs@hotmail.com]
 */
public class JSONScannerTest_long extends TestCase {static class __CLR4_1_101hj21hj2lusqkdoa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,69427,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void ftest_parse_long() throws Exception {try{__CLR4_1_101hj21hj2lusqkdoa.R.inc(69374);
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69375);System.out.println(System.currentTimeMillis());
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69376);JSONScanner lexer = new JSONScanner("1293770846476");
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69377);lexer.scanNumber();
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69378);Assert.assertEquals(new Long(1293770846476L), (Long) lexer.integerValue());
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69379);Assert.assertEquals(1293770846476L, lexer.longValue());
    }finally{__CLR4_1_101hj21hj2lusqkdoa.R.flushNeeded();}}

    public void ftest_parse_long_1() throws Exception {try{__CLR4_1_101hj21hj2lusqkdoa.R.inc(69380);
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69381);System.out.println(System.currentTimeMillis());
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69382);JSONScanner lexer = new JSONScanner(Long.toString(Long.MAX_VALUE));
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69383);lexer.scanNumber();
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69384);Assert.assertEquals(new Long(Long.MAX_VALUE), (Long) lexer.integerValue());
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69385);Assert.assertEquals(Long.MAX_VALUE, lexer.longValue());
    }finally{__CLR4_1_101hj21hj2lusqkdoa.R.flushNeeded();}}

    public void test_parse_long_2() throws Exception {__CLR4_1_101hj21hj2lusqkdoa.R.globalSliceStart(getClass().getName(),69386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pzmmfj1hje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hj21hj2lusqkdoa.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hj21hj2lusqkdoa.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_parse_long_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69386,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pzmmfj1hje() throws Exception{try{__CLR4_1_101hj21hj2lusqkdoa.R.inc(69386);
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69387);System.out.println(System.currentTimeMillis());
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69388);JSONScanner lexer = new JSONScanner(Long.toString(Long.MIN_VALUE));
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69389);lexer.scanNumber();
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69390);Assert.assertEquals(new Long(Long.MIN_VALUE), (Long) lexer.integerValue());
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69391);Assert.assertEquals(Long.MIN_VALUE, lexer.longValue());
    }finally{__CLR4_1_101hj21hj2lusqkdoa.R.flushNeeded();}}

    public void test_error_0() {__CLR4_1_101hj21hj2lusqkdoa.R.globalSliceStart(getClass().getName(),69392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1hjk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hj21hj2lusqkdoa.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hj21hj2lusqkdoa.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69392,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1hjk(){try{__CLR4_1_101hj21hj2lusqkdoa.R.inc(69392);
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69393);Exception error = null;
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69394);try {
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69395);JSONScanner lexer = new JSONScanner("--");
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69396);lexer.scanNumber();
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69397);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69398);error = ex;
        }
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69399);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hj21hj2lusqkdoa.R.flushNeeded();}}

    public void test_error_1() {__CLR4_1_101hj21hj2lusqkdoa.R.globalSliceStart(getClass().getName(),69400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1hjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hj21hj2lusqkdoa.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hj21hj2lusqkdoa.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69400,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1hjs(){try{__CLR4_1_101hj21hj2lusqkdoa.R.inc(69400);
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69401);Exception error = null;
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69402);try {
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69403);String text = Long.MAX_VALUE + "1234";
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69404);JSONScanner lexer = new JSONScanner(text);
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69405);lexer.scanNumber();
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69406);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69407);error = ex;
        }
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69408);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hj21hj2lusqkdoa.R.flushNeeded();}}

    public void test_error_2() {__CLR4_1_101hj21hj2lusqkdoa.R.globalSliceStart(getClass().getName(),69409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1hk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hj21hj2lusqkdoa.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hj21hj2lusqkdoa.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69409,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1hk1(){try{__CLR4_1_101hj21hj2lusqkdoa.R.inc(69409);
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69410);Exception error = null;
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69411);try {
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69412);String text = Long.MIN_VALUE + "1234";
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69413);JSONScanner lexer = new JSONScanner(text);
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69414);lexer.scanNumber();
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69415);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69416);error = ex;
        }
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69417);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hj21hj2lusqkdoa.R.flushNeeded();}}

    public void test_error_3() {__CLR4_1_101hj21hj2lusqkdoa.R.globalSliceStart(getClass().getName(),69418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1hka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hj21hj2lusqkdoa.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hj21hj2lusqkdoa.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69418,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1hka(){try{__CLR4_1_101hj21hj2lusqkdoa.R.inc(69418);
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69419);Exception error = null;
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69420);try {
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69421);String text = "9223372036854775809";
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69422);JSONScanner lexer = new JSONScanner(text);
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69423);lexer.scanNumber();
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69424);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_1_101hj21hj2lusqkdoa.R.inc(69425);error = ex;
        }
        __CLR4_1_101hj21hj2lusqkdoa.R.inc(69426);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hj21hj2lusqkdoa.R.flushNeeded();}}
}
