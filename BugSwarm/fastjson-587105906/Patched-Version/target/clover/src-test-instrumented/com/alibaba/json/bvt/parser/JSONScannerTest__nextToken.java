/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;

public class JSONScannerTest__nextToken extends TestCase {static class __CLR4_5_21ha81ha8lusyjtp6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,69126,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_next() throws Exception {__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceStart(getClass().getName(),69056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u1ievb1ha8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ha81ha8lusyjtp6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69056,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u1ievb1ha8() throws Exception{try{__CLR4_5_21ha81ha8lusyjtp6.R.inc(69056);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69057);String text = "\"aaa\"";
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69058);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69059);lexer.nextToken(JSONToken.LITERAL_INT);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69060);Assert.assertEquals(JSONToken.LITERAL_STRING, lexer.token());
    }finally{__CLR4_5_21ha81ha8lusyjtp6.R.flushNeeded();}}
    
    public void test_next_1() throws Exception {__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceStart(getClass().getName(),69061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z1j3yf1had();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ha81ha8lusyjtp6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69061,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z1j3yf1had() throws Exception{try{__CLR4_5_21ha81ha8lusyjtp6.R.inc(69061);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69062);String text = "[";
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69063);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69064);lexer.nextToken(JSONToken.LITERAL_INT);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69065);Assert.assertEquals(JSONToken.LBRACKET, lexer.token());
    }finally{__CLR4_5_21ha81ha8lusyjtp6.R.flushNeeded();}}
    
    public void test_next_2() throws Exception {__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceStart(getClass().getName(),69066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vsj55y1hai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ha81ha8lusyjtp6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vsj55y1hai() throws Exception{try{__CLR4_5_21ha81ha8lusyjtp6.R.inc(69066);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69067);String text = "{";
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69068);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69069);lexer.nextToken(JSONToken.LITERAL_INT);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69070);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_5_21ha81ha8lusyjtp6.R.flushNeeded();}}
    
    public void test_next_3() throws Exception {__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceStart(getClass().getName(),69071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sjj6dh1han();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ha81ha8lusyjtp6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69071,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sjj6dh1han() throws Exception{try{__CLR4_5_21ha81ha8lusyjtp6.R.inc(69071);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69072);String text = "{";
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69073);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69074);lexer.nextToken(JSONToken.LBRACKET);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69075);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_5_21ha81ha8lusyjtp6.R.flushNeeded();}}
    
    public void test_next_4() throws Exception {__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceStart(getClass().getName(),69076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2paj7l01has();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ha81ha8lusyjtp6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69076,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2paj7l01has() throws Exception{try{__CLR4_5_21ha81ha8lusyjtp6.R.inc(69076);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69077);String text = "";
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69078);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69079);lexer.nextToken(JSONToken.LBRACKET);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69080);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_5_21ha81ha8lusyjtp6.R.flushNeeded();}}
    
    public void test_next_5() throws Exception {__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceStart(getClass().getName(),69081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1j8sj1hax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ha81ha8lusyjtp6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69081,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1j8sj1hax() throws Exception{try{__CLR4_5_21ha81ha8lusyjtp6.R.inc(69081);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69082);String text = " \n\r\t\f\b 1";
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69083);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69084);lexer.nextToken(JSONToken.LBRACKET);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69085);Assert.assertEquals(JSONToken.LITERAL_INT, lexer.token());
    }finally{__CLR4_5_21ha81ha8lusyjtp6.R.flushNeeded();}}
    
    public void test_next_6() throws Exception {__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceStart(getClass().getName(),69086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2isja021hb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ha81ha8lusyjtp6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69086,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2isja021hb2() throws Exception{try{__CLR4_5_21ha81ha8lusyjtp6.R.inc(69086);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69087);String text = "";
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69088);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69089);lexer.nextToken(JSONToken.EOF);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69090);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_5_21ha81ha8lusyjtp6.R.flushNeeded();}}
    
    public void test_next_7() throws Exception {__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceStart(getClass().getName(),69091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fjjb7l1hb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ha81ha8lusyjtp6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69091,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fjjb7l1hb7() throws Exception{try{__CLR4_5_21ha81ha8lusyjtp6.R.inc(69091);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69092);String text = "{";
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69093);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69094);lexer.nextToken(JSONToken.EOF);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69095);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_5_21ha81ha8lusyjtp6.R.flushNeeded();}}
    
    public void test_next_8() throws Exception {__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceStart(getClass().getName(),69096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cajcf41hbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ha81ha8lusyjtp6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cajcf41hbc() throws Exception{try{__CLR4_5_21ha81ha8lusyjtp6.R.inc(69096);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69097);String text = "\n\r\t\f\b :{";
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69098);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69099);lexer.nextTokenWithColon(JSONToken.LBRACE);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69100);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_5_21ha81ha8lusyjtp6.R.flushNeeded();}}
    
    public void test_next_9() throws Exception {__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceStart(getClass().getName(),69101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_291jdmn1hbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ha81ha8lusyjtp6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69101,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_291jdmn1hbh() throws Exception{try{__CLR4_5_21ha81ha8lusyjtp6.R.inc(69101);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69102);String text = "\n\r\t\f\b :[";
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69103);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69104);lexer.nextTokenWithColon(JSONToken.LBRACE);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69105);Assert.assertEquals(JSONToken.LBRACKET, lexer.token());
    }finally{__CLR4_5_21ha81ha8lusyjtp6.R.flushNeeded();}}
    
    public void test_next_10() throws Exception {__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceStart(getClass().getName(),69106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ffoq111hbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ha81ha8lusyjtp6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69106,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ffoq111hbm() throws Exception{try{__CLR4_5_21ha81ha8lusyjtp6.R.inc(69106);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69107);String text = "\n\r\t\f\b :";
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69108);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69109);lexer.nextTokenWithColon(JSONToken.LBRACE);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69110);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_5_21ha81ha8lusyjtp6.R.flushNeeded();}}
    
    public void test_next_11() throws Exception {__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceStart(getClass().getName(),69111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ioooti1hbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ha81ha8lusyjtp6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69111,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ioooti1hbr() throws Exception{try{__CLR4_5_21ha81ha8lusyjtp6.R.inc(69111);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69112);String text = "\n\r\t\f\b :{";
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69113);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69114);lexer.nextTokenWithColon(JSONToken.LBRACKET);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69115);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_5_21ha81ha8lusyjtp6.R.flushNeeded();}}
    
    public void test_next_12() throws Exception {__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceStart(getClass().getName(),69116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lxonlz1hbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ha81ha8lusyjtp6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69116,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lxonlz1hbw() throws Exception{try{__CLR4_5_21ha81ha8lusyjtp6.R.inc(69116);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69117);String text = "\n\r\t\f\b :";
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69118);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69119);lexer.nextTokenWithColon(JSONToken.LBRACKET);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69120);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_5_21ha81ha8lusyjtp6.R.flushNeeded();}}
    public void test_next_13() throws Exception {__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceStart(getClass().getName(),69121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p6omeg1hc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ha81ha8lusyjtp6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ha81ha8lusyjtp6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69121,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p6omeg1hc1() throws Exception{try{__CLR4_5_21ha81ha8lusyjtp6.R.inc(69121);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69122);String text = "\n\r\t\f\b :\n\r\t\f\b ";
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69123);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69124);lexer.nextTokenWithColon(JSONToken.LBRACKET);
        __CLR4_5_21ha81ha8lusyjtp6.R.inc(69125);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_5_21ha81ha8lusyjtp6.R.flushNeeded();}}
}
