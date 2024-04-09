/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;

public class JSONScannerTest__nextToken extends TestCase {static class __CLR4_5_21i8g1i8glusvnd1y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,70358,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_next() throws Exception {__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceStart(getClass().getName(),70288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u1ievb1i8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8g1i8glusvnd1y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70288,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u1ievb1i8g() throws Exception{try{__CLR4_5_21i8g1i8glusvnd1y.R.inc(70288);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70289);String text = "\"aaa\"";
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70290);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70291);lexer.nextToken(JSONToken.LITERAL_INT);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70292);Assert.assertEquals(JSONToken.LITERAL_STRING, lexer.token());
    }finally{__CLR4_5_21i8g1i8glusvnd1y.R.flushNeeded();}}
    
    public void test_next_1() throws Exception {__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceStart(getClass().getName(),70293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z1j3yf1i8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8g1i8glusvnd1y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70293,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z1j3yf1i8l() throws Exception{try{__CLR4_5_21i8g1i8glusvnd1y.R.inc(70293);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70294);String text = "[";
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70295);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70296);lexer.nextToken(JSONToken.LITERAL_INT);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70297);Assert.assertEquals(JSONToken.LBRACKET, lexer.token());
    }finally{__CLR4_5_21i8g1i8glusvnd1y.R.flushNeeded();}}
    
    public void test_next_2() throws Exception {__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceStart(getClass().getName(),70298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vsj55y1i8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8g1i8glusvnd1y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70298,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vsj55y1i8q() throws Exception{try{__CLR4_5_21i8g1i8glusvnd1y.R.inc(70298);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70299);String text = "{";
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70300);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70301);lexer.nextToken(JSONToken.LITERAL_INT);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70302);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_5_21i8g1i8glusvnd1y.R.flushNeeded();}}
    
    public void test_next_3() throws Exception {__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceStart(getClass().getName(),70303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sjj6dh1i8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8g1i8glusvnd1y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sjj6dh1i8v() throws Exception{try{__CLR4_5_21i8g1i8glusvnd1y.R.inc(70303);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70304);String text = "{";
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70305);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70306);lexer.nextToken(JSONToken.LBRACKET);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70307);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_5_21i8g1i8glusvnd1y.R.flushNeeded();}}
    
    public void test_next_4() throws Exception {__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceStart(getClass().getName(),70308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2paj7l01i90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8g1i8glusvnd1y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70308,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2paj7l01i90() throws Exception{try{__CLR4_5_21i8g1i8glusvnd1y.R.inc(70308);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70309);String text = "";
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70310);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70311);lexer.nextToken(JSONToken.LBRACKET);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70312);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_5_21i8g1i8glusvnd1y.R.flushNeeded();}}
    
    public void test_next_5() throws Exception {__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceStart(getClass().getName(),70313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1j8sj1i95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8g1i8glusvnd1y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1j8sj1i95() throws Exception{try{__CLR4_5_21i8g1i8glusvnd1y.R.inc(70313);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70314);String text = " \n\r\t\f\b 1";
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70315);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70316);lexer.nextToken(JSONToken.LBRACKET);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70317);Assert.assertEquals(JSONToken.LITERAL_INT, lexer.token());
    }finally{__CLR4_5_21i8g1i8glusvnd1y.R.flushNeeded();}}
    
    public void test_next_6() throws Exception {__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceStart(getClass().getName(),70318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2isja021i9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8g1i8glusvnd1y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70318,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2isja021i9a() throws Exception{try{__CLR4_5_21i8g1i8glusvnd1y.R.inc(70318);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70319);String text = "";
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70320);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70321);lexer.nextToken(JSONToken.EOF);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70322);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_5_21i8g1i8glusvnd1y.R.flushNeeded();}}
    
    public void test_next_7() throws Exception {__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceStart(getClass().getName(),70323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fjjb7l1i9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8g1i8glusvnd1y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70323,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fjjb7l1i9f() throws Exception{try{__CLR4_5_21i8g1i8glusvnd1y.R.inc(70323);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70324);String text = "{";
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70325);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70326);lexer.nextToken(JSONToken.EOF);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70327);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_5_21i8g1i8glusvnd1y.R.flushNeeded();}}
    
    public void test_next_8() throws Exception {__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceStart(getClass().getName(),70328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cajcf41i9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8g1i8glusvnd1y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cajcf41i9k() throws Exception{try{__CLR4_5_21i8g1i8glusvnd1y.R.inc(70328);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70329);String text = "\n\r\t\f\b :{";
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70330);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70331);lexer.nextTokenWithColon(JSONToken.LBRACE);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70332);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_5_21i8g1i8glusvnd1y.R.flushNeeded();}}
    
    public void test_next_9() throws Exception {__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceStart(getClass().getName(),70333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_291jdmn1i9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8g1i8glusvnd1y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70333,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_291jdmn1i9p() throws Exception{try{__CLR4_5_21i8g1i8glusvnd1y.R.inc(70333);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70334);String text = "\n\r\t\f\b :[";
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70335);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70336);lexer.nextTokenWithColon(JSONToken.LBRACE);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70337);Assert.assertEquals(JSONToken.LBRACKET, lexer.token());
    }finally{__CLR4_5_21i8g1i8glusvnd1y.R.flushNeeded();}}
    
    public void test_next_10() throws Exception {__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceStart(getClass().getName(),70338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ffoq111i9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8g1i8glusvnd1y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70338,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ffoq111i9u() throws Exception{try{__CLR4_5_21i8g1i8glusvnd1y.R.inc(70338);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70339);String text = "\n\r\t\f\b :";
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70340);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70341);lexer.nextTokenWithColon(JSONToken.LBRACE);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70342);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_5_21i8g1i8glusvnd1y.R.flushNeeded();}}
    
    public void test_next_11() throws Exception {__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceStart(getClass().getName(),70343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ioooti1i9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8g1i8glusvnd1y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70343,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ioooti1i9z() throws Exception{try{__CLR4_5_21i8g1i8glusvnd1y.R.inc(70343);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70344);String text = "\n\r\t\f\b :{";
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70345);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70346);lexer.nextTokenWithColon(JSONToken.LBRACKET);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70347);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_5_21i8g1i8glusvnd1y.R.flushNeeded();}}
    
    public void test_next_12() throws Exception {__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceStart(getClass().getName(),70348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lxonlz1ia4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8g1i8glusvnd1y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70348,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lxonlz1ia4() throws Exception{try{__CLR4_5_21i8g1i8glusvnd1y.R.inc(70348);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70349);String text = "\n\r\t\f\b :";
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70350);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70351);lexer.nextTokenWithColon(JSONToken.LBRACKET);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70352);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_5_21i8g1i8glusvnd1y.R.flushNeeded();}}
    public void test_next_13() throws Exception {__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceStart(getClass().getName(),70353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p6omeg1ia9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8g1i8glusvnd1y.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8g1i8glusvnd1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p6omeg1ia9() throws Exception{try{__CLR4_5_21i8g1i8glusvnd1y.R.inc(70353);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70354);String text = "\n\r\t\f\b :\n\r\t\f\b ";
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70355);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70356);lexer.nextTokenWithColon(JSONToken.LBRACKET);
        __CLR4_5_21i8g1i8glusvnd1y.R.inc(70357);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_5_21i8g1i8glusvnd1y.R.flushNeeded();}}
}
