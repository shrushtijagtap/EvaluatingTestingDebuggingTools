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
public class JSONScannerTest_symbol extends TestCase {static class __CLR4_5_21i621i62lusyjts2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,70298,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21i62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70202,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21i62() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70202);
        __CLR4_5_21i621i62lusyjts2.R.inc(70203);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21i621i62lusyjts2.R.inc(70204);JSONScanner lexer = new JSONScanner("\"name\"");
        __CLR4_5_21i621i62lusyjts2.R.inc(70205);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21i621i62lusyjts2.R.inc(70206);Assert.assertTrue("name".equals(symbol));
        __CLR4_5_21i621i62lusyjts2.R.inc(70207);lexer.close();
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1i68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70208,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1i68() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70208);
        __CLR4_5_21i621i62lusyjts2.R.inc(70209);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21i621i62lusyjts2.R.inc(70210);JSONScanner lexer = new JSONScanner("\"nick name\"");
        __CLR4_5_21i621i62lusyjts2.R.inc(70211);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21i621i62lusyjts2.R.inc(70212);Assert.assertTrue("nick name".equals(symbol));
        __CLR4_5_21i621i62lusyjts2.R.inc(70213);lexer.close();
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441i6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70214,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441i6e() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70214);
        __CLR4_5_21i621i62lusyjts2.R.inc(70215);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21i621i62lusyjts2.R.inc(70216);JSONScanner lexer = new JSONScanner("\"nick \\\"name\"");
        __CLR4_5_21i621i62lusyjts2.R.inc(70217);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21i621i62lusyjts2.R.inc(70218);Assert.assertTrue("nick \"name" == symbol);
        __CLR4_5_21i621i62lusyjts2.R.inc(70219);lexer.close();
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1i6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70220,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1i6k() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70220);
        __CLR4_5_21i621i62lusyjts2.R.inc(70221);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21i621i62lusyjts2.R.inc(70222);JSONScanner lexer = new JSONScanner("\"nick \\\\name\"");
        __CLR4_5_21i621i62lusyjts2.R.inc(70223);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21i621i62lusyjts2.R.inc(70224);Assert.assertTrue("nick \\name" == symbol);
        __CLR4_5_21i621i62lusyjts2.R.inc(70225);lexer.close();
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61i6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61i6q() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70226);
        __CLR4_5_21i621i62lusyjts2.R.inc(70227);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21i621i62lusyjts2.R.inc(70228);JSONScanner lexer = new JSONScanner("\"nick \\/name\"");
        __CLR4_5_21i621i62lusyjts2.R.inc(70229);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21i621i62lusyjts2.R.inc(70230);Assert.assertTrue("nick /name" == symbol);
        __CLR4_5_21i621i62lusyjts2.R.inc(70231);lexer.close();
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1i6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70232,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1i6w() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70232);
        __CLR4_5_21i621i62lusyjts2.R.inc(70233);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21i621i62lusyjts2.R.inc(70234);JSONScanner lexer = new JSONScanner("\"nick \\bname\"");
        __CLR4_5_21i621i62lusyjts2.R.inc(70235);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21i621i62lusyjts2.R.inc(70236);Assert.assertTrue("nick \bname" == symbol);
        __CLR4_5_21i621i62lusyjts2.R.inc(70237);lexer.close();
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81i72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70238,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81i72() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70238);
        __CLR4_5_21i621i62lusyjts2.R.inc(70239);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21i621i62lusyjts2.R.inc(70240);JSONScanner lexer = new JSONScanner("\"nick \\f name\"");
        __CLR4_5_21i621i62lusyjts2.R.inc(70241);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21i621i62lusyjts2.R.inc(70242);Assert.assertTrue("nick \f name" == symbol);
        __CLR4_5_21i621i62lusyjts2.R.inc(70243);lexer.close();
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1i78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70244,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1i78() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70244);
        __CLR4_5_21i621i62lusyjts2.R.inc(70245);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21i621i62lusyjts2.R.inc(70246);JSONScanner lexer = new JSONScanner("\"nick \\F name\"");
        __CLR4_5_21i621i62lusyjts2.R.inc(70247);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21i621i62lusyjts2.R.inc(70248);Assert.assertTrue("nick \f name" == symbol);
        __CLR4_5_21i621i62lusyjts2.R.inc(70249);lexer.close();
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1i7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70250,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1i7e() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70250);
        __CLR4_5_21i621i62lusyjts2.R.inc(70251);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21i621i62lusyjts2.R.inc(70252);JSONScanner lexer = new JSONScanner("\"nick \\n name\"");
        __CLR4_5_21i621i62lusyjts2.R.inc(70253);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21i621i62lusyjts2.R.inc(70254);Assert.assertTrue("nick \n name" == symbol);
        __CLR4_5_21i621i62lusyjts2.R.inc(70255);lexer.close();
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71i7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71i7k() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70256);
        __CLR4_5_21i621i62lusyjts2.R.inc(70257);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21i621i62lusyjts2.R.inc(70258);JSONScanner lexer = new JSONScanner("\"nick \\r name\"");
        __CLR4_5_21i621i62lusyjts2.R.inc(70259);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21i621i62lusyjts2.R.inc(70260);Assert.assertTrue("nick \r name" == symbol);
        __CLR4_5_21i621i62lusyjts2.R.inc(70261);lexer.close();
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1i7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70262,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1i7q() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70262);
        __CLR4_5_21i621i62lusyjts2.R.inc(70263);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21i621i62lusyjts2.R.inc(70264);JSONScanner lexer = new JSONScanner("\"nick \\t name\"");
        __CLR4_5_21i621i62lusyjts2.R.inc(70265);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21i621i62lusyjts2.R.inc(70266);Assert.assertTrue("nick \t name" == symbol);
        __CLR4_5_21i621i62lusyjts2.R.inc(70267);lexer.close();
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1i7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1i7w() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70268);
        __CLR4_5_21i621i62lusyjts2.R.inc(70269);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21i621i62lusyjts2.R.inc(70270);JSONScanner lexer = new JSONScanner("\"nick \\u4e2d name\"");
        __CLR4_5_21i621i62lusyjts2.R.inc(70271);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21i621i62lusyjts2.R.inc(70272);Assert.assertTrue("nick \u4e2d name" == symbol);
        __CLR4_5_21i621i62lusyjts2.R.inc(70273);lexer.close();
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1i82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70274,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1i82() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70274);
        __CLR4_5_21i621i62lusyjts2.R.inc(70275);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_5_21i621i62lusyjts2.R.inc(70276);JSONScanner lexer = new JSONScanner(
                                            "\"\\tabcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890\"");
        __CLR4_5_21i621i62lusyjts2.R.inc(70277);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_5_21i621i62lusyjts2.R.inc(70278);Assert.assertTrue("\tabcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890" == symbol);
        __CLR4_5_21i621i62lusyjts2.R.inc(70279);lexer.close();
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1i88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70280,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1i88() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70280);
        __CLR4_5_21i621i62lusyjts2.R.inc(70281);JSONException error = null;
        __CLR4_5_21i621i62lusyjts2.R.inc(70282);try {
            __CLR4_5_21i621i62lusyjts2.R.inc(70283);SymbolTable symbolTable = new SymbolTable(512);

            __CLR4_5_21i621i62lusyjts2.R.inc(70284);JSONScanner lexer = new JSONScanner("\"nick \\a name\"");
            __CLR4_5_21i621i62lusyjts2.R.inc(70285);lexer.scanSymbol(symbolTable, '"');
            __CLR4_5_21i621i62lusyjts2.R.inc(70286);lexer.close();
        } catch (JSONException e) {
            __CLR4_5_21i621i62lusyjts2.R.inc(70287);error = e;
        }
        __CLR4_5_21i621i62lusyjts2.R.inc(70288);Assert.assertNotNull(error);
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21i621i62lusyjts2.R.globalSliceStart(getClass().getName(),70289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1i8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i621i62lusyjts2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i621i62lusyjts2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1i8h() throws Exception{try{__CLR4_5_21i621i62lusyjts2.R.inc(70289);
        __CLR4_5_21i621i62lusyjts2.R.inc(70290);JSONException error = null;
        __CLR4_5_21i621i62lusyjts2.R.inc(70291);try {
            __CLR4_5_21i621i62lusyjts2.R.inc(70292);SymbolTable symbolTable = new SymbolTable(512);

            __CLR4_5_21i621i62lusyjts2.R.inc(70293);JSONScanner lexer = new JSONScanner("\"name");
            __CLR4_5_21i621i62lusyjts2.R.inc(70294);lexer.scanSymbol(symbolTable, '"');
            __CLR4_5_21i621i62lusyjts2.R.inc(70295);lexer.close();
        } catch (JSONException e) {
            __CLR4_5_21i621i62lusyjts2.R.inc(70296);error = e;
        }
        __CLR4_5_21i621i62lusyjts2.R.inc(70297);Assert.assertNotNull(error);
    }finally{__CLR4_5_21i621i62lusyjts2.R.flushNeeded();}}
}
