/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.SymbolTable;

/**
 * test symbol
 * 
 * @author wenshao[szujobs@hotmail.com]
 */
public class JSONScannerTest_symbol extends TestCase {static class __CLR4_1_101j4l1j4lluszwcq1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,71541,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21j4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71445,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21j4l() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71445);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71446);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71447);JSONScanner lexer = new JSONScanner("\"name\"");
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71448);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71449);Assert.assertTrue("name".equals(symbol));
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71450);lexer.close();
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1j4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71451,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1j4r() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71451);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71452);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71453);JSONScanner lexer = new JSONScanner("\"nick name\"");
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71454);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71455);Assert.assertTrue("nick name".equals(symbol));
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71456);lexer.close();
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441j4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71457,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441j4x() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71457);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71458);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71459);JSONScanner lexer = new JSONScanner("\"nick \\\"name\"");
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71460);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71461);Assert.assertTrue("nick \"name" == symbol);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71462);lexer.close();
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1j53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71463,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1j53() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71463);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71464);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71465);JSONScanner lexer = new JSONScanner("\"nick \\\\name\"");
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71466);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71467);Assert.assertTrue("nick \\name" == symbol);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71468);lexer.close();
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61j59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71469,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61j59() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71469);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71470);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71471);JSONScanner lexer = new JSONScanner("\"nick \\/name\"");
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71472);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71473);Assert.assertTrue("nick /name" == symbol);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71474);lexer.close();
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1j5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71475,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1j5f() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71475);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71476);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71477);JSONScanner lexer = new JSONScanner("\"nick \\bname\"");
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71478);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71479);Assert.assertTrue("nick \bname" == symbol);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71480);lexer.close();
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81j5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71481,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81j5l() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71481);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71482);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71483);JSONScanner lexer = new JSONScanner("\"nick \\f name\"");
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71484);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71485);Assert.assertTrue("nick \f name" == symbol);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71486);lexer.close();
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1j5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71487,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1j5r() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71487);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71488);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71489);JSONScanner lexer = new JSONScanner("\"nick \\F name\"");
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71490);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71491);Assert.assertTrue("nick \f name" == symbol);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71492);lexer.close();
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1j5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71493,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1j5x() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71493);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71494);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71495);JSONScanner lexer = new JSONScanner("\"nick \\n name\"");
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71496);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71497);Assert.assertTrue("nick \n name" == symbol);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71498);lexer.close();
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71j63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71499,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71j63() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71499);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71500);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71501);JSONScanner lexer = new JSONScanner("\"nick \\r name\"");
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71502);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71503);Assert.assertTrue("nick \r name" == symbol);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71504);lexer.close();
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x1j69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71505,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x1j69() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71505);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71506);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71507);JSONScanner lexer = new JSONScanner("\"nick \\t name\"");
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71508);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71509);Assert.assertTrue("nick \t name" == symbol);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71510);lexer.close();
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg1j6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71511,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg1j6f() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71511);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71512);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71513);JSONScanner lexer = new JSONScanner("\"nick \\u4e2d name\"");
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71514);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71515);Assert.assertTrue("nick \u4e2d name" == symbol);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71516);lexer.close();
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105lolmz1j6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71517,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105lolmz1j6l() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71517);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71518);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71519);JSONScanner lexer = new JSONScanner(
                                            "\"\\tabcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890\"");
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71520);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71521);Assert.assertTrue("\tabcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890" == symbol);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71522);lexer.close();
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1j6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71523,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1j6r() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71523);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71524);JSONException error = null;
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71525);try {
            __CLR4_1_101j4l1j4lluszwcq1.R.inc(71526);SymbolTable symbolTable = new SymbolTable(512);

            __CLR4_1_101j4l1j4lluszwcq1.R.inc(71527);JSONScanner lexer = new JSONScanner("\"nick \\a name\"");
            __CLR4_1_101j4l1j4lluszwcq1.R.inc(71528);lexer.scanSymbol(symbolTable, '"');
            __CLR4_1_101j4l1j4lluszwcq1.R.inc(71529);lexer.close();
        } catch (JSONException e) {
            __CLR4_1_101j4l1j4lluszwcq1.R.inc(71530);error = e;
        }
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71531);Assert.assertNotNull(error);
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceStart(getClass().getName(),71532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1j70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j4l1j4lluszwcq1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j4l1j4lluszwcq1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71532,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1j70() throws Exception{try{__CLR4_1_101j4l1j4lluszwcq1.R.inc(71532);
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71533);JSONException error = null;
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71534);try {
            __CLR4_1_101j4l1j4lluszwcq1.R.inc(71535);SymbolTable symbolTable = new SymbolTable(512);

            __CLR4_1_101j4l1j4lluszwcq1.R.inc(71536);JSONScanner lexer = new JSONScanner("\"name");
            __CLR4_1_101j4l1j4lluszwcq1.R.inc(71537);lexer.scanSymbol(symbolTable, '"');
            __CLR4_1_101j4l1j4lluszwcq1.R.inc(71538);lexer.close();
        } catch (JSONException e) {
            __CLR4_1_101j4l1j4lluszwcq1.R.inc(71539);error = e;
        }
        __CLR4_1_101j4l1j4lluszwcq1.R.inc(71540);Assert.assertNotNull(error);
    }finally{__CLR4_1_101j4l1j4lluszwcq1.R.flushNeeded();}}
}
