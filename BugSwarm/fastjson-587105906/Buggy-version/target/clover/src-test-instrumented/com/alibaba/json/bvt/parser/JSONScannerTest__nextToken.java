/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;

public class JSONScannerTest__nextToken extends TestCase {static class __CLR4_1_101haj1hajlusqkdmj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,69137,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_next() throws Exception {__CLR4_1_101haj1hajlusqkdmj.R.globalSliceStart(getClass().getName(),69067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u1ievb1haj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101haj1hajlusqkdmj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101haj1hajlusqkdmj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69067,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u1ievb1haj() throws Exception{try{__CLR4_1_101haj1hajlusqkdmj.R.inc(69067);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69068);String text = "\"aaa\"";
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69069);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69070);lexer.nextToken(JSONToken.LITERAL_INT);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69071);Assert.assertEquals(JSONToken.LITERAL_STRING, lexer.token());
    }finally{__CLR4_1_101haj1hajlusqkdmj.R.flushNeeded();}}
    
    public void test_next_1() throws Exception {__CLR4_1_101haj1hajlusqkdmj.R.globalSliceStart(getClass().getName(),69072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10z1j3yf1hao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101haj1hajlusqkdmj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101haj1hajlusqkdmj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69072,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10z1j3yf1hao() throws Exception{try{__CLR4_1_101haj1hajlusqkdmj.R.inc(69072);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69073);String text = "[";
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69074);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69075);lexer.nextToken(JSONToken.LITERAL_INT);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69076);Assert.assertEquals(JSONToken.LBRACKET, lexer.token());
    }finally{__CLR4_1_101haj1hajlusqkdmj.R.flushNeeded();}}
    
    public void test_next_2() throws Exception {__CLR4_1_101haj1hajlusqkdmj.R.globalSliceStart(getClass().getName(),69077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vsj55y1hat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101haj1hajlusqkdmj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101haj1hajlusqkdmj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69077,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vsj55y1hat() throws Exception{try{__CLR4_1_101haj1hajlusqkdmj.R.inc(69077);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69078);String text = "{";
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69079);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69080);lexer.nextToken(JSONToken.LITERAL_INT);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69081);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_1_101haj1hajlusqkdmj.R.flushNeeded();}}
    
    public void test_next_3() throws Exception {__CLR4_1_101haj1hajlusqkdmj.R.globalSliceStart(getClass().getName(),69082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10sjj6dh1hay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101haj1hajlusqkdmj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101haj1hajlusqkdmj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69082,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10sjj6dh1hay() throws Exception{try{__CLR4_1_101haj1hajlusqkdmj.R.inc(69082);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69083);String text = "{";
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69084);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69085);lexer.nextToken(JSONToken.LBRACKET);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69086);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_1_101haj1hajlusqkdmj.R.flushNeeded();}}
    
    public void test_next_4() throws Exception {__CLR4_1_101haj1hajlusqkdmj.R.globalSliceStart(getClass().getName(),69087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10paj7l01hb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101haj1hajlusqkdmj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101haj1hajlusqkdmj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69087,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10paj7l01hb3() throws Exception{try{__CLR4_1_101haj1hajlusqkdmj.R.inc(69087);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69088);String text = "";
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69089);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69090);lexer.nextToken(JSONToken.LBRACKET);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69091);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_1_101haj1hajlusqkdmj.R.flushNeeded();}}
    
    public void test_next_5() throws Exception {__CLR4_1_101haj1hajlusqkdmj.R.globalSliceStart(getClass().getName(),69092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1j8sj1hb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101haj1hajlusqkdmj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101haj1hajlusqkdmj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69092,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1j8sj1hb8() throws Exception{try{__CLR4_1_101haj1hajlusqkdmj.R.inc(69092);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69093);String text = " \n\r\t\f\b 1";
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69094);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69095);lexer.nextToken(JSONToken.LBRACKET);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69096);Assert.assertEquals(JSONToken.LITERAL_INT, lexer.token());
    }finally{__CLR4_1_101haj1hajlusqkdmj.R.flushNeeded();}}
    
    public void test_next_6() throws Exception {__CLR4_1_101haj1hajlusqkdmj.R.globalSliceStart(getClass().getName(),69097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10isja021hbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101haj1hajlusqkdmj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101haj1hajlusqkdmj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69097,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10isja021hbd() throws Exception{try{__CLR4_1_101haj1hajlusqkdmj.R.inc(69097);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69098);String text = "";
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69099);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69100);lexer.nextToken(JSONToken.EOF);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69101);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_1_101haj1hajlusqkdmj.R.flushNeeded();}}
    
    public void test_next_7() throws Exception {__CLR4_1_101haj1hajlusqkdmj.R.globalSliceStart(getClass().getName(),69102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fjjb7l1hbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101haj1hajlusqkdmj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101haj1hajlusqkdmj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69102,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fjjb7l1hbi() throws Exception{try{__CLR4_1_101haj1hajlusqkdmj.R.inc(69102);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69103);String text = "{";
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69104);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69105);lexer.nextToken(JSONToken.EOF);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69106);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_1_101haj1hajlusqkdmj.R.flushNeeded();}}
    
    public void test_next_8() throws Exception {__CLR4_1_101haj1hajlusqkdmj.R.globalSliceStart(getClass().getName(),69107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cajcf41hbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101haj1hajlusqkdmj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101haj1hajlusqkdmj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69107,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cajcf41hbn() throws Exception{try{__CLR4_1_101haj1hajlusqkdmj.R.inc(69107);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69108);String text = "\n\r\t\f\b :{";
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69109);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69110);lexer.nextTokenWithColon(JSONToken.LBRACE);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69111);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_1_101haj1hajlusqkdmj.R.flushNeeded();}}
    
    public void test_next_9() throws Exception {__CLR4_1_101haj1hajlusqkdmj.R.globalSliceStart(getClass().getName(),69112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1091jdmn1hbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101haj1hajlusqkdmj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101haj1hajlusqkdmj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69112,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1091jdmn1hbs() throws Exception{try{__CLR4_1_101haj1hajlusqkdmj.R.inc(69112);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69113);String text = "\n\r\t\f\b :[";
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69114);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69115);lexer.nextTokenWithColon(JSONToken.LBRACE);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69116);Assert.assertEquals(JSONToken.LBRACKET, lexer.token());
    }finally{__CLR4_1_101haj1hajlusqkdmj.R.flushNeeded();}}
    
    public void test_next_10() throws Exception {__CLR4_1_101haj1hajlusqkdmj.R.globalSliceStart(getClass().getName(),69117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ffoq111hbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101haj1hajlusqkdmj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101haj1hajlusqkdmj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69117,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ffoq111hbx() throws Exception{try{__CLR4_1_101haj1hajlusqkdmj.R.inc(69117);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69118);String text = "\n\r\t\f\b :";
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69119);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69120);lexer.nextTokenWithColon(JSONToken.LBRACE);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69121);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_1_101haj1hajlusqkdmj.R.flushNeeded();}}
    
    public void test_next_11() throws Exception {__CLR4_1_101haj1hajlusqkdmj.R.globalSliceStart(getClass().getName(),69122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ioooti1hc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101haj1hajlusqkdmj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101haj1hajlusqkdmj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69122,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ioooti1hc2() throws Exception{try{__CLR4_1_101haj1hajlusqkdmj.R.inc(69122);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69123);String text = "\n\r\t\f\b :{";
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69124);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69125);lexer.nextTokenWithColon(JSONToken.LBRACKET);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69126);Assert.assertEquals(JSONToken.LBRACE, lexer.token());
    }finally{__CLR4_1_101haj1hajlusqkdmj.R.flushNeeded();}}
    
    public void test_next_12() throws Exception {__CLR4_1_101haj1hajlusqkdmj.R.globalSliceStart(getClass().getName(),69127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lxonlz1hc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101haj1hajlusqkdmj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101haj1hajlusqkdmj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69127,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lxonlz1hc7() throws Exception{try{__CLR4_1_101haj1hajlusqkdmj.R.inc(69127);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69128);String text = "\n\r\t\f\b :";
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69129);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69130);lexer.nextTokenWithColon(JSONToken.LBRACKET);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69131);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_1_101haj1hajlusqkdmj.R.flushNeeded();}}
    public void test_next_13() throws Exception {__CLR4_1_101haj1hajlusqkdmj.R.globalSliceStart(getClass().getName(),69132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10p6omeg1hcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101haj1hajlusqkdmj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101haj1hajlusqkdmj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest__nextToken.test_next_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69132,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10p6omeg1hcc() throws Exception{try{__CLR4_1_101haj1hajlusqkdmj.R.inc(69132);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69133);String text = "\n\r\t\f\b :\n\r\t\f\b ";
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69134);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69135);lexer.nextTokenWithColon(JSONToken.LBRACKET);
        __CLR4_1_101haj1hajlusqkdmj.R.inc(69136);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_1_101haj1hajlusqkdmj.R.flushNeeded();}}
}
