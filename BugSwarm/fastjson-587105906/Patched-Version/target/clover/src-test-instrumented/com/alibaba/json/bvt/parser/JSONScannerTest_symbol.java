/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

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
public class JSONScannerTest_symbol extends TestCase {static class __CLR4_5_21j4a1j4alusvndic{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,71530,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21j4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21j4a() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71434);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71435);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21j4a1j4alusvndic.R.inc(71436);JSONScanner lexer = new JSONScanner("\"name\"");
        __CLR4_5_21j4a1j4alusvndic.R.inc(71437);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21j4a1j4alusvndic.R.inc(71438);Assert.assertTrue("name".equals(symbol));
        __CLR4_5_21j4a1j4alusvndic.R.inc(71439);lexer.close();
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1j4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71440,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1j4g() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71440);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71441);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21j4a1j4alusvndic.R.inc(71442);JSONScanner lexer = new JSONScanner("\"nick name\"");
        __CLR4_5_21j4a1j4alusvndic.R.inc(71443);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21j4a1j4alusvndic.R.inc(71444);Assert.assertTrue("nick name".equals(symbol));
        __CLR4_5_21j4a1j4alusvndic.R.inc(71445);lexer.close();
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441j4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71446,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441j4m() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71446);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71447);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21j4a1j4alusvndic.R.inc(71448);JSONScanner lexer = new JSONScanner("\"nick \\\"name\"");
        __CLR4_5_21j4a1j4alusvndic.R.inc(71449);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21j4a1j4alusvndic.R.inc(71450);Assert.assertTrue("nick \"name" == symbol);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71451);lexer.close();
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1j4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71452,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1j4s() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71452);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71453);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21j4a1j4alusvndic.R.inc(71454);JSONScanner lexer = new JSONScanner("\"nick \\\\name\"");
        __CLR4_5_21j4a1j4alusvndic.R.inc(71455);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21j4a1j4alusvndic.R.inc(71456);Assert.assertTrue("nick \\name" == symbol);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71457);lexer.close();
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61j4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71458,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61j4y() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71458);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71459);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21j4a1j4alusvndic.R.inc(71460);JSONScanner lexer = new JSONScanner("\"nick \\/name\"");
        __CLR4_5_21j4a1j4alusvndic.R.inc(71461);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21j4a1j4alusvndic.R.inc(71462);Assert.assertTrue("nick /name" == symbol);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71463);lexer.close();
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1j54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71464,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1j54() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71464);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71465);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21j4a1j4alusvndic.R.inc(71466);JSONScanner lexer = new JSONScanner("\"nick \\bname\"");
        __CLR4_5_21j4a1j4alusvndic.R.inc(71467);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21j4a1j4alusvndic.R.inc(71468);Assert.assertTrue("nick \bname" == symbol);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71469);lexer.close();
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81j5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71470,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81j5a() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71470);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71471);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21j4a1j4alusvndic.R.inc(71472);JSONScanner lexer = new JSONScanner("\"nick \\f name\"");
        __CLR4_5_21j4a1j4alusvndic.R.inc(71473);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21j4a1j4alusvndic.R.inc(71474);Assert.assertTrue("nick \f name" == symbol);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71475);lexer.close();
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1j5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71476,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1j5g() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71476);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71477);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21j4a1j4alusvndic.R.inc(71478);JSONScanner lexer = new JSONScanner("\"nick \\F name\"");
        __CLR4_5_21j4a1j4alusvndic.R.inc(71479);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21j4a1j4alusvndic.R.inc(71480);Assert.assertTrue("nick \f name" == symbol);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71481);lexer.close();
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1j5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1j5m() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71482);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71483);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21j4a1j4alusvndic.R.inc(71484);JSONScanner lexer = new JSONScanner("\"nick \\n name\"");
        __CLR4_5_21j4a1j4alusvndic.R.inc(71485);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21j4a1j4alusvndic.R.inc(71486);Assert.assertTrue("nick \n name" == symbol);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71487);lexer.close();
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71j5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71488,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71j5s() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71488);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71489);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21j4a1j4alusvndic.R.inc(71490);JSONScanner lexer = new JSONScanner("\"nick \\r name\"");
        __CLR4_5_21j4a1j4alusvndic.R.inc(71491);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21j4a1j4alusvndic.R.inc(71492);Assert.assertTrue("nick \r name" == symbol);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71493);lexer.close();
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1j5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1j5y() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71494);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71495);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21j4a1j4alusvndic.R.inc(71496);JSONScanner lexer = new JSONScanner("\"nick \\t name\"");
        __CLR4_5_21j4a1j4alusvndic.R.inc(71497);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21j4a1j4alusvndic.R.inc(71498);Assert.assertTrue("nick \t name" == symbol);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71499);lexer.close();
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1j64();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71500,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1j64() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71500);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71501);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21j4a1j4alusvndic.R.inc(71502);JSONScanner lexer = new JSONScanner("\"nick \\u4e2d name\"");
        __CLR4_5_21j4a1j4alusvndic.R.inc(71503);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21j4a1j4alusvndic.R.inc(71504);Assert.assertTrue("nick \u4e2d name" == symbol);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71505);lexer.close();
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1j6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71506,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1j6a() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71506);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71507);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21j4a1j4alusvndic.R.inc(71508);JSONScanner lexer = new JSONScanner(
                                            "\"\\tabcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890\"");
        __CLR4_5_21j4a1j4alusvndic.R.inc(71509);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21j4a1j4alusvndic.R.inc(71510);Assert.assertTrue("\tabcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890" == symbol);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71511);lexer.close();
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1j6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71512,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1j6g() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71512);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71513);JSONException error = null;
        __CLR4_5_21j4a1j4alusvndic.R.inc(71514);try {
            __CLR4_5_21j4a1j4alusvndic.R.inc(71515);SymbolTable symbolTable = new SymbolTable(512);

            __CLR4_5_21j4a1j4alusvndic.R.inc(71516);JSONScanner lexer = new JSONScanner("\"nick \\a name\"");
            __CLR4_5_21j4a1j4alusvndic.R.inc(71517);lexer.scanSymbol(symbolTable, '"');
            __CLR4_5_21j4a1j4alusvndic.R.inc(71518);lexer.close();
        } catch (JSONException e) {
            __CLR4_5_21j4a1j4alusvndic.R.inc(71519);error = e;
        }
        __CLR4_5_21j4a1j4alusvndic.R.inc(71520);Assert.assertNotNull(error);
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21j4a1j4alusvndic.R.globalSliceStart(getClass().getName(),71521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1j6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j4a1j4alusvndic.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j4a1j4alusvndic.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71521,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1j6p() throws Exception{try{__CLR4_5_21j4a1j4alusvndic.R.inc(71521);
        __CLR4_5_21j4a1j4alusvndic.R.inc(71522);JSONException error = null;
        __CLR4_5_21j4a1j4alusvndic.R.inc(71523);try {
            __CLR4_5_21j4a1j4alusvndic.R.inc(71524);SymbolTable symbolTable = new SymbolTable(512);

            __CLR4_5_21j4a1j4alusvndic.R.inc(71525);JSONScanner lexer = new JSONScanner("\"name");
            __CLR4_5_21j4a1j4alusvndic.R.inc(71526);lexer.scanSymbol(symbolTable, '"');
            __CLR4_5_21j4a1j4alusvndic.R.inc(71527);lexer.close();
        } catch (JSONException e) {
            __CLR4_5_21j4a1j4alusvndic.R.inc(71528);error = e;
        }
        __CLR4_5_21j4a1j4alusvndic.R.inc(71529);Assert.assertNotNull(error);
    }finally{__CLR4_5_21j4a1j4alusvndic.R.flushNeeded();}}
}
