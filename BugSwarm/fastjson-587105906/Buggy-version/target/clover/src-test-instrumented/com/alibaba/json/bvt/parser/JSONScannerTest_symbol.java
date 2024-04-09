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
public class JSONScannerTest_symbol extends TestCase {static class __CLR4_1_101i6d1i6dlusqkdwd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,70309,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21i6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70213,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21i6d() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70213);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70214);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70215);JSONScanner lexer = new JSONScanner("\"name\"");
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70216);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70217);Assert.assertTrue("name".equals(symbol));
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70218);lexer.close();
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1i6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70219,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1i6j() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70219);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70220);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70221);JSONScanner lexer = new JSONScanner("\"nick name\"");
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70222);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70223);Assert.assertTrue("nick name".equals(symbol));
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70224);lexer.close();
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441i6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70225,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441i6p() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70225);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70226);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70227);JSONScanner lexer = new JSONScanner("\"nick \\\"name\"");
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70228);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70229);Assert.assertTrue("nick \"name" == symbol);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70230);lexer.close();
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1i6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70231,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1i6v() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70231);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70232);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70233);JSONScanner lexer = new JSONScanner("\"nick \\\\name\"");
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70234);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70235);Assert.assertTrue("nick \\name" == symbol);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70236);lexer.close();
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61i71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70237,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61i71() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70237);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70238);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70239);JSONScanner lexer = new JSONScanner("\"nick \\/name\"");
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70240);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70241);Assert.assertTrue("nick /name" == symbol);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70242);lexer.close();
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1i77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70243,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1i77() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70243);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70244);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70245);JSONScanner lexer = new JSONScanner("\"nick \\bname\"");
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70246);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70247);Assert.assertTrue("nick \bname" == symbol);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70248);lexer.close();
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81i7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70249,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81i7d() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70249);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70250);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70251);JSONScanner lexer = new JSONScanner("\"nick \\f name\"");
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70252);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70253);Assert.assertTrue("nick \f name" == symbol);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70254);lexer.close();
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1i7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70255,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1i7j() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70255);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70256);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70257);JSONScanner lexer = new JSONScanner("\"nick \\F name\"");
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70258);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70259);Assert.assertTrue("nick \f name" == symbol);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70260);lexer.close();
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1i7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70261,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1i7p() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70261);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70262);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70263);JSONScanner lexer = new JSONScanner("\"nick \\n name\"");
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70264);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70265);Assert.assertTrue("nick \n name" == symbol);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70266);lexer.close();
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71i7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70267,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71i7v() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70267);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70268);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70269);JSONScanner lexer = new JSONScanner("\"nick \\r name\"");
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70270);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70271);Assert.assertTrue("nick \r name" == symbol);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70272);lexer.close();
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x1i81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70273,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x1i81() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70273);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70274);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70275);JSONScanner lexer = new JSONScanner("\"nick \\t name\"");
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70276);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70277);Assert.assertTrue("nick \t name" == symbol);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70278);lexer.close();
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg1i87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70279,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg1i87() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70279);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70280);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70281);JSONScanner lexer = new JSONScanner("\"nick \\u4e2d name\"");
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70282);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70283);Assert.assertTrue("nick \u4e2d name" == symbol);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70284);lexer.close();
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105lolmz1i8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70285,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105lolmz1i8d() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70285);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70286);SymbolTable symbolTable = new SymbolTable(512);

        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70287);JSONScanner lexer = new JSONScanner(
                                            "\"\\tabcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890\"");
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70288);String symbol = lexer.scanSymbol(symbolTable, '"');
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70289);Assert.assertTrue("\tabcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890abcdefghijklmnopqrstuvwxyz01234567890" == symbol);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70290);lexer.close();
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1i8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70291,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1i8j() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70291);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70292);JSONException error = null;
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70293);try {
            __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70294);SymbolTable symbolTable = new SymbolTable(512);

            __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70295);JSONScanner lexer = new JSONScanner("\"nick \\a name\"");
            __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70296);lexer.scanSymbol(symbolTable, '"');
            __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70297);lexer.close();
        } catch (JSONException e) {
            __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70298);error = e;
        }
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70299);Assert.assertNotNull(error);
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceStart(getClass().getName(),70300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1i8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i6d1i6dlusqkdwd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i6d1i6dlusqkdwd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_symbol.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70300,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1i8s() throws Exception{try{__CLR4_1_101i6d1i6dlusqkdwd.R.inc(70300);
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70301);JSONException error = null;
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70302);try {
            __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70303);SymbolTable symbolTable = new SymbolTable(512);

            __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70304);JSONScanner lexer = new JSONScanner("\"name");
            __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70305);lexer.scanSymbol(symbolTable, '"');
            __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70306);lexer.close();
        } catch (JSONException e) {
            __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70307);error = e;
        }
        __CLR4_1_101i6d1i6dlusqkdwd.R.inc(70308);Assert.assertNotNull(error);
    }finally{__CLR4_1_101i6d1i6dlusqkdwd.R.flushNeeded();}}
}
