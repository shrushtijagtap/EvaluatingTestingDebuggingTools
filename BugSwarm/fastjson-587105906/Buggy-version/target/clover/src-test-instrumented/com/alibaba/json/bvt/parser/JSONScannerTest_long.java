/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.JSONScanner;

/**
 * parseLong
 * 
 * @author wenshao[szujobs@hotmail.com]
 */
public class JSONScannerTest_long extends TestCase {static class __CLR4_1_101iha1ihaluszwclb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,70659,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void ftest_parse_long() throws Exception {try{__CLR4_1_101iha1ihaluszwclb.R.inc(70606);
        __CLR4_1_101iha1ihaluszwclb.R.inc(70607);System.out.println(System.currentTimeMillis());
        __CLR4_1_101iha1ihaluszwclb.R.inc(70608);JSONScanner lexer = new JSONScanner("1293770846476");
        __CLR4_1_101iha1ihaluszwclb.R.inc(70609);lexer.scanNumber();
        __CLR4_1_101iha1ihaluszwclb.R.inc(70610);Assert.assertEquals(new Long(1293770846476L), (Long) lexer.integerValue());
        __CLR4_1_101iha1ihaluszwclb.R.inc(70611);Assert.assertEquals(1293770846476L, lexer.longValue());
    }finally{__CLR4_1_101iha1ihaluszwclb.R.flushNeeded();}}

    public void ftest_parse_long_1() throws Exception {try{__CLR4_1_101iha1ihaluszwclb.R.inc(70612);
        __CLR4_1_101iha1ihaluszwclb.R.inc(70613);System.out.println(System.currentTimeMillis());
        __CLR4_1_101iha1ihaluszwclb.R.inc(70614);JSONScanner lexer = new JSONScanner(Long.toString(Long.MAX_VALUE));
        __CLR4_1_101iha1ihaluszwclb.R.inc(70615);lexer.scanNumber();
        __CLR4_1_101iha1ihaluszwclb.R.inc(70616);Assert.assertEquals(new Long(Long.MAX_VALUE), (Long) lexer.integerValue());
        __CLR4_1_101iha1ihaluszwclb.R.inc(70617);Assert.assertEquals(Long.MAX_VALUE, lexer.longValue());
    }finally{__CLR4_1_101iha1ihaluszwclb.R.flushNeeded();}}

    public void test_parse_long_2() throws Exception {__CLR4_1_101iha1ihaluszwclb.R.globalSliceStart(getClass().getName(),70618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pzmmfj1ihm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iha1ihaluszwclb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iha1ihaluszwclb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_parse_long_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70618,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pzmmfj1ihm() throws Exception{try{__CLR4_1_101iha1ihaluszwclb.R.inc(70618);
        __CLR4_1_101iha1ihaluszwclb.R.inc(70619);System.out.println(System.currentTimeMillis());
        __CLR4_1_101iha1ihaluszwclb.R.inc(70620);JSONScanner lexer = new JSONScanner(Long.toString(Long.MIN_VALUE));
        __CLR4_1_101iha1ihaluszwclb.R.inc(70621);lexer.scanNumber();
        __CLR4_1_101iha1ihaluszwclb.R.inc(70622);Assert.assertEquals(new Long(Long.MIN_VALUE), (Long) lexer.integerValue());
        __CLR4_1_101iha1ihaluszwclb.R.inc(70623);Assert.assertEquals(Long.MIN_VALUE, lexer.longValue());
    }finally{__CLR4_1_101iha1ihaluszwclb.R.flushNeeded();}}

    public void test_error_0() {__CLR4_1_101iha1ihaluszwclb.R.globalSliceStart(getClass().getName(),70624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1ihs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iha1ihaluszwclb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iha1ihaluszwclb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70624,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1ihs(){try{__CLR4_1_101iha1ihaluszwclb.R.inc(70624);
        __CLR4_1_101iha1ihaluszwclb.R.inc(70625);Exception error = null;
        __CLR4_1_101iha1ihaluszwclb.R.inc(70626);try {
            __CLR4_1_101iha1ihaluszwclb.R.inc(70627);JSONScanner lexer = new JSONScanner("--");
            __CLR4_1_101iha1ihaluszwclb.R.inc(70628);lexer.scanNumber();
            __CLR4_1_101iha1ihaluszwclb.R.inc(70629);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_1_101iha1ihaluszwclb.R.inc(70630);error = ex;
        }
        __CLR4_1_101iha1ihaluszwclb.R.inc(70631);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iha1ihaluszwclb.R.flushNeeded();}}

    public void test_error_1() {__CLR4_1_101iha1ihaluszwclb.R.globalSliceStart(getClass().getName(),70632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1ii0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iha1ihaluszwclb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iha1ihaluszwclb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70632,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1ii0(){try{__CLR4_1_101iha1ihaluszwclb.R.inc(70632);
        __CLR4_1_101iha1ihaluszwclb.R.inc(70633);Exception error = null;
        __CLR4_1_101iha1ihaluszwclb.R.inc(70634);try {
            __CLR4_1_101iha1ihaluszwclb.R.inc(70635);String text = Long.MAX_VALUE + "1234";
            __CLR4_1_101iha1ihaluszwclb.R.inc(70636);JSONScanner lexer = new JSONScanner(text);
            __CLR4_1_101iha1ihaluszwclb.R.inc(70637);lexer.scanNumber();
            __CLR4_1_101iha1ihaluszwclb.R.inc(70638);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_1_101iha1ihaluszwclb.R.inc(70639);error = ex;
        }
        __CLR4_1_101iha1ihaluszwclb.R.inc(70640);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iha1ihaluszwclb.R.flushNeeded();}}

    public void test_error_2() {__CLR4_1_101iha1ihaluszwclb.R.globalSliceStart(getClass().getName(),70641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1ii9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iha1ihaluszwclb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iha1ihaluszwclb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70641,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1ii9(){try{__CLR4_1_101iha1ihaluszwclb.R.inc(70641);
        __CLR4_1_101iha1ihaluszwclb.R.inc(70642);Exception error = null;
        __CLR4_1_101iha1ihaluszwclb.R.inc(70643);try {
            __CLR4_1_101iha1ihaluszwclb.R.inc(70644);String text = Long.MIN_VALUE + "1234";
            __CLR4_1_101iha1ihaluszwclb.R.inc(70645);JSONScanner lexer = new JSONScanner(text);
            __CLR4_1_101iha1ihaluszwclb.R.inc(70646);lexer.scanNumber();
            __CLR4_1_101iha1ihaluszwclb.R.inc(70647);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_1_101iha1ihaluszwclb.R.inc(70648);error = ex;
        }
        __CLR4_1_101iha1ihaluszwclb.R.inc(70649);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iha1ihaluszwclb.R.flushNeeded();}}

    public void test_error_3() {__CLR4_1_101iha1ihaluszwclb.R.globalSliceStart(getClass().getName(),70650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1iii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iha1ihaluszwclb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iha1ihaluszwclb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70650,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1iii(){try{__CLR4_1_101iha1ihaluszwclb.R.inc(70650);
        __CLR4_1_101iha1ihaluszwclb.R.inc(70651);Exception error = null;
        __CLR4_1_101iha1ihaluszwclb.R.inc(70652);try {
            __CLR4_1_101iha1ihaluszwclb.R.inc(70653);String text = "9223372036854775809";
            __CLR4_1_101iha1ihaluszwclb.R.inc(70654);JSONScanner lexer = new JSONScanner(text);
            __CLR4_1_101iha1ihaluszwclb.R.inc(70655);lexer.scanNumber();
            __CLR4_1_101iha1ihaluszwclb.R.inc(70656);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_1_101iha1ihaluszwclb.R.inc(70657);error = ex;
        }
        __CLR4_1_101iha1ihaluszwclb.R.inc(70658);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iha1ihaluszwclb.R.flushNeeded();}}
}
