/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.JSONScanner;

/**
 * parseLong
 * 
 * @author wenshao[szujobs@hotmail.com]
 */
public class JSONScannerTest_long extends TestCase {static class __CLR4_5_21igz1igzlusvnd3i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,70648,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void ftest_parse_long() throws Exception {try{__CLR4_5_21igz1igzlusvnd3i.R.inc(70595);
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70596);System.out.println(System.currentTimeMillis());
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70597);JSONScanner lexer = new JSONScanner("1293770846476");
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70598);lexer.scanNumber();
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70599);Assert.assertEquals(new Long(1293770846476L), (Long) lexer.integerValue());
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70600);Assert.assertEquals(1293770846476L, lexer.longValue());
    }finally{__CLR4_5_21igz1igzlusvnd3i.R.flushNeeded();}}

    public void ftest_parse_long_1() throws Exception {try{__CLR4_5_21igz1igzlusvnd3i.R.inc(70601);
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70602);System.out.println(System.currentTimeMillis());
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70603);JSONScanner lexer = new JSONScanner(Long.toString(Long.MAX_VALUE));
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70604);lexer.scanNumber();
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70605);Assert.assertEquals(new Long(Long.MAX_VALUE), (Long) lexer.integerValue());
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70606);Assert.assertEquals(Long.MAX_VALUE, lexer.longValue());
    }finally{__CLR4_5_21igz1igzlusvnd3i.R.flushNeeded();}}

    public void test_parse_long_2() throws Exception {__CLR4_5_21igz1igzlusvnd3i.R.globalSliceStart(getClass().getName(),70607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzmmfj1ihb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21igz1igzlusvnd3i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21igz1igzlusvnd3i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_parse_long_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70607,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzmmfj1ihb() throws Exception{try{__CLR4_5_21igz1igzlusvnd3i.R.inc(70607);
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70608);System.out.println(System.currentTimeMillis());
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70609);JSONScanner lexer = new JSONScanner(Long.toString(Long.MIN_VALUE));
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70610);lexer.scanNumber();
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70611);Assert.assertEquals(new Long(Long.MIN_VALUE), (Long) lexer.integerValue());
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70612);Assert.assertEquals(Long.MIN_VALUE, lexer.longValue());
    }finally{__CLR4_5_21igz1igzlusvnd3i.R.flushNeeded();}}

    public void test_error_0() {__CLR4_5_21igz1igzlusvnd3i.R.globalSliceStart(getClass().getName(),70613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1ihh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21igz1igzlusvnd3i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21igz1igzlusvnd3i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70613,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1ihh(){try{__CLR4_5_21igz1igzlusvnd3i.R.inc(70613);
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70614);Exception error = null;
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70615);try {
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70616);JSONScanner lexer = new JSONScanner("--");
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70617);lexer.scanNumber();
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70618);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70619);error = ex;
        }
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70620);Assert.assertNotNull(error);
    }finally{__CLR4_5_21igz1igzlusvnd3i.R.flushNeeded();}}

    public void test_error_1() {__CLR4_5_21igz1igzlusvnd3i.R.globalSliceStart(getClass().getName(),70621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1ihp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21igz1igzlusvnd3i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21igz1igzlusvnd3i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70621,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1ihp(){try{__CLR4_5_21igz1igzlusvnd3i.R.inc(70621);
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70622);Exception error = null;
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70623);try {
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70624);String text = Long.MAX_VALUE + "1234";
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70625);JSONScanner lexer = new JSONScanner(text);
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70626);lexer.scanNumber();
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70627);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70628);error = ex;
        }
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70629);Assert.assertNotNull(error);
    }finally{__CLR4_5_21igz1igzlusvnd3i.R.flushNeeded();}}

    public void test_error_2() {__CLR4_5_21igz1igzlusvnd3i.R.globalSliceStart(getClass().getName(),70630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1ihy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21igz1igzlusvnd3i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21igz1igzlusvnd3i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1ihy(){try{__CLR4_5_21igz1igzlusvnd3i.R.inc(70630);
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70631);Exception error = null;
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70632);try {
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70633);String text = Long.MIN_VALUE + "1234";
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70634);JSONScanner lexer = new JSONScanner(text);
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70635);lexer.scanNumber();
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70636);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70637);error = ex;
        }
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70638);Assert.assertNotNull(error);
    }finally{__CLR4_5_21igz1igzlusvnd3i.R.flushNeeded();}}

    public void test_error_3() {__CLR4_5_21igz1igzlusvnd3i.R.globalSliceStart(getClass().getName(),70639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1ii7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21igz1igzlusvnd3i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21igz1igzlusvnd3i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_long.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70639,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1ii7(){try{__CLR4_5_21igz1igzlusvnd3i.R.inc(70639);
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70640);Exception error = null;
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70641);try {
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70642);String text = "9223372036854775809";
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70643);JSONScanner lexer = new JSONScanner(text);
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70644);lexer.scanNumber();
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70645);lexer.longValue();
        } catch (Exception ex) {
            __CLR4_5_21igz1igzlusvnd3i.R.inc(70646);error = ex;
        }
        __CLR4_5_21igz1igzlusvnd3i.R.inc(70647);Assert.assertNotNull(error);
    }finally{__CLR4_5_21igz1igzlusvnd3i.R.flushNeeded();}}
}
