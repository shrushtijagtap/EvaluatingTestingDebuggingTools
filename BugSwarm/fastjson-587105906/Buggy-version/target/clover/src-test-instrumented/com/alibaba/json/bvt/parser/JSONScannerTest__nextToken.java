/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;

public class JSONScannerTest__nextToken extends TestCase {static class __CLR4_1_101i8r1i8rluszwckf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,70369,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_next() throws Exception {__CLR4_1_101i8r1i8rluszwckf.R.globalSliceStart(getClass().getName(),70299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u1ievb1i8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i8r1i8rluszwckf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i8r1i8rluszwckf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70299,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u1ievb1i8r() throws Exception{try{__CLR4_1_101i8r1i8rluszwckf.R.inc(70299);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70300);String text = "\"aaa\"";
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70301);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70302);lexer.nextToken(JSONToken.LITERAL_INT);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70303);Assert.assertEquals(JSONToken.LITERAL_STRING, lexer.token());
    }finally{__CLR4_1_101i8r1i8rluszwckf.R.flushNeeded();}}
    
    public void test_next_1() throws Exception {__CLR4_1_101i8r1i8rluszwckf.R.globalSliceStart(getClass().getName(),70304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10z1j3yf1i8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i8r1i8rluszwckf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i8r1i8rluszwckf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70304,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10z1j3yf1i8w() throws Exception{try{__CLR4_1_101i8r1i8rluszwckf.R.inc(70304);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70305);String text = "[";
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70306);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70307);lexer.nextToken(JSONToken.LITERAL_INT);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70308);Assert.assertEquals(JSONToken.LBRACKET, lexer.token());
    }finally{__CLR4_1_101i8r1i8rluszwckf.R.flushNeeded();}}
    
    public void test_next_2() throws Exception {__CLR4_1_101i8r1i8rluszwckf.R.globalSliceStart(getClass().getName(),70309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vsj55y1i91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i8r1i8rluszwckf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i8r1i8rluszwckf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70309,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vsj55y1i91() throws Exception{try{__CLR4_1_101i8r1i8rluszwckf.R.inc(70309);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70310);String text = "{";
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70311);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70312);lexer.nextToken(JSONToken.LITERAL_INT);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70313);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_1_101i8r1i8rluszwckf.R.flushNeeded();}}
    
    public void test_next_3() throws Exception {__CLR4_1_101i8r1i8rluszwckf.R.globalSliceStart(getClass().getName(),70314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10sjj6dh1i96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i8r1i8rluszwckf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i8r1i8rluszwckf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70314,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10sjj6dh1i96() throws Exception{try{__CLR4_1_101i8r1i8rluszwckf.R.inc(70314);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70315);String text = "{";
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70316);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70317);lexer.nextToken(JSONToken.LBRACKET);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70318);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_1_101i8r1i8rluszwckf.R.flushNeeded();}}
    
    public void test_next_4() throws Exception {__CLR4_1_101i8r1i8rluszwckf.R.globalSliceStart(getClass().getName(),70319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10paj7l01i9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i8r1i8rluszwckf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i8r1i8rluszwckf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70319,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10paj7l01i9b() throws Exception{try{__CLR4_1_101i8r1i8rluszwckf.R.inc(70319);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70320);String text = "";
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70321);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70322);lexer.nextToken(JSONToken.LBRACKET);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70323);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_1_101i8r1i8rluszwckf.R.flushNeeded();}}
    
    public void test_next_5() throws Exception {__CLR4_1_101i8r1i8rluszwckf.R.globalSliceStart(getClass().getName(),70324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1j8sj1i9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i8r1i8rluszwckf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i8r1i8rluszwckf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70324,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1j8sj1i9g() throws Exception{try{__CLR4_1_101i8r1i8rluszwckf.R.inc(70324);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70325);String text = " \n\r\t\f\b 1";
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70326);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70327);lexer.nextToken(JSONToken.LBRACKET);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70328);Assert.assertEquals(JSONToken.LITERAL_INT, lexer.token());
    }finally{__CLR4_1_101i8r1i8rluszwckf.R.flushNeeded();}}
    
    public void test_next_6() throws Exception {__CLR4_1_101i8r1i8rluszwckf.R.globalSliceStart(getClass().getName(),70329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10isja021i9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i8r1i8rluszwckf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i8r1i8rluszwckf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70329,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10isja021i9l() throws Exception{try{__CLR4_1_101i8r1i8rluszwckf.R.inc(70329);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70330);String text = "";
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70331);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70332);lexer.nextToken(JSONToken.EOF);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70333);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_1_101i8r1i8rluszwckf.R.flushNeeded();}}
    
    public void test_next_7() throws Exception {__CLR4_1_101i8r1i8rluszwckf.R.globalSliceStart(getClass().getName(),70334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fjjb7l1i9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i8r1i8rluszwckf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i8r1i8rluszwckf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70334,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fjjb7l1i9q() throws Exception{try{__CLR4_1_101i8r1i8rluszwckf.R.inc(70334);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70335);String text = "{";
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70336);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70337);lexer.nextToken(JSONToken.EOF);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70338);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_1_101i8r1i8rluszwckf.R.flushNeeded();}}
    
    public void test_next_8() throws Exception {__CLR4_1_101i8r1i8rluszwckf.R.globalSliceStart(getClass().getName(),70339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cajcf41i9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i8r1i8rluszwckf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i8r1i8rluszwckf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70339,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cajcf41i9v() throws Exception{try{__CLR4_1_101i8r1i8rluszwckf.R.inc(70339);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70340);String text = "\n\r\t\f\b :{";
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70341);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70342);lexer.nextTokenWithColon(JSONToken.LBRACE);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70343);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_1_101i8r1i8rluszwckf.R.flushNeeded();}}
    
    public void test_next_9() throws Exception {__CLR4_1_101i8r1i8rluszwckf.R.globalSliceStart(getClass().getName(),70344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1091jdmn1ia0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i8r1i8rluszwckf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i8r1i8rluszwckf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70344,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1091jdmn1ia0() throws Exception{try{__CLR4_1_101i8r1i8rluszwckf.R.inc(70344);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70345);String text = "\n\r\t\f\b :[";
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70346);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70347);lexer.nextTokenWithColon(JSONToken.LBRACE);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70348);Assert.assertEquals(JSONToken.LBRACKET, lexer.token());
    }finally{__CLR4_1_101i8r1i8rluszwckf.R.flushNeeded();}}
    
    public void test_next_10() throws Exception {__CLR4_1_101i8r1i8rluszwckf.R.globalSliceStart(getClass().getName(),70349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ffoq111ia5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i8r1i8rluszwckf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i8r1i8rluszwckf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70349,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ffoq111ia5() throws Exception{try{__CLR4_1_101i8r1i8rluszwckf.R.inc(70349);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70350);String text = "\n\r\t\f\b :";
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70351);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70352);lexer.nextTokenWithColon(JSONToken.LBRACE);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70353);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_1_101i8r1i8rluszwckf.R.flushNeeded();}}
    
    public void test_next_11() throws Exception {__CLR4_1_101i8r1i8rluszwckf.R.globalSliceStart(getClass().getName(),70354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ioooti1iaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i8r1i8rluszwckf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i8r1i8rluszwckf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70354,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ioooti1iaa() throws Exception{try{__CLR4_1_101i8r1i8rluszwckf.R.inc(70354);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70355);String text = "\n\r\t\f\b :{";
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70356);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70357);lexer.nextTokenWithColon(JSONToken.LBRACKET);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70358);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_1_101i8r1i8rluszwckf.R.flushNeeded();}}
    
    public void test_next_12() throws Exception {__CLR4_1_101i8r1i8rluszwckf.R.globalSliceStart(getClass().getName(),70359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lxonlz1iaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i8r1i8rluszwckf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i8r1i8rluszwckf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70359,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lxonlz1iaf() throws Exception{try{__CLR4_1_101i8r1i8rluszwckf.R.inc(70359);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70360);String text = "\n\r\t\f\b :";
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70361);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70362);lexer.nextTokenWithColon(JSONToken.LBRACKET);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70363);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_1_101i8r1i8rluszwckf.R.flushNeeded();}}
    public void test_next_13() throws Exception {__CLR4_1_101i8r1i8rluszwckf.R.globalSliceStart(getClass().getName(),70364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10p6omeg1iak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i8r1i8rluszwckf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i8r1i8rluszwckf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70364,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10p6omeg1iak() throws Exception{try{__CLR4_1_101i8r1i8rluszwckf.R.inc(70364);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70365);String text = "\n\r\t\f\b :\n\r\t\f\b ";
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70366);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70367);lexer.nextTokenWithColon(JSONToken.LBRACKET);
        __CLR4_1_101i8r1i8rluszwckf.R.inc(70368);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_1_101i8r1i8rluszwckf.R.flushNeeded();}}
}
