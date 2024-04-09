/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.SymbolTable;

/**
 * \u6d4b\u8bd5\u5b57\u7b26':'\u7684\u5904\u7406
 * 
 * @author wenshao[szujobs@hotmail.com]
 */
public class JSONScannerTest_scanSymbol extends TestCase {static class __CLR4_5_21j0i1j0ilusvndhn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,71346,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21j0i1j0ilusvndhn.R.globalSliceStart(getClass().getName(),71298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21j0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j0i1j0ilusvndhn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j0i1j0ilusvndhn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71298,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21j0i() throws Exception{try{__CLR4_5_21j0i1j0ilusvndhn.R.inc(71298);
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71299);JSONScanner lexer = new JSONScanner("\"value\":\"aa\\n\"");
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71300);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71301);assertEquals(0, hashCode);
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71302);Assert.assertEquals(JSONScanner.NOT_MATCH, lexer.matchStat());
    }finally{__CLR4_5_21j0i1j0ilusvndhn.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21j0i1j0ilusvndhn.R.globalSliceStart(getClass().getName(),71303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1j0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j0i1j0ilusvndhn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j0i1j0ilusvndhn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1j0n() throws Exception{try{__CLR4_5_21j0i1j0ilusvndhn.R.inc(71303);
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71304);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"},");
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71305);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71306);Assert.assertEquals(fnv_hash("aa"), hashCode);
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71307);Assert.assertEquals(JSONScanner.END, lexer.matchStat());
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71308);Assert.assertEquals(JSONToken.COMMA, lexer.token());
    }finally{__CLR4_5_21j0i1j0ilusvndhn.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_5_21j0i1j0ilusvndhn.R.globalSliceStart(getClass().getName(),71309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441j0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j0i1j0ilusvndhn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j0i1j0ilusvndhn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441j0t() throws Exception{try{__CLR4_5_21j0i1j0ilusvndhn.R.inc(71309);
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71310);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"}]");
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71311);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71312);Assert.assertEquals(fnv_hash("aa"), hashCode);
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71313);Assert.assertEquals(JSONScanner.END, lexer.matchStat());
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71314);Assert.assertEquals(JSONToken.RBRACKET, lexer.token());
    }finally{__CLR4_5_21j0i1j0ilusvndhn.R.flushNeeded();}}
    
    public void test_3() throws Exception {__CLR4_5_21j0i1j0ilusvndhn.R.globalSliceStart(getClass().getName(),71315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1j0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j0i1j0ilusvndhn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j0i1j0ilusvndhn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71315,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1j0z() throws Exception{try{__CLR4_5_21j0i1j0ilusvndhn.R.inc(71315);
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71316);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"}}");
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71317);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71318);Assert.assertEquals(fnv_hash("aa"), hashCode);
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71319);Assert.assertEquals(JSONScanner.END, lexer.matchStat());
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71320);Assert.assertEquals(JSONToken.RBRACE, lexer.token());
    }finally{__CLR4_5_21j0i1j0ilusvndhn.R.flushNeeded();}}
    
    public void test_4() throws Exception {__CLR4_5_21j0i1j0ilusvndhn.R.globalSliceStart(getClass().getName(),71321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61j15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j0i1j0ilusvndhn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j0i1j0ilusvndhn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61j15() throws Exception{try{__CLR4_5_21j0i1j0ilusvndhn.R.inc(71321);
    	__CLR4_5_21j0i1j0ilusvndhn.R.inc(71322);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"}");
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71323);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
    	__CLR4_5_21j0i1j0ilusvndhn.R.inc(71324);Assert.assertEquals(fnv_hash("aa"), hashCode);
    	__CLR4_5_21j0i1j0ilusvndhn.R.inc(71325);Assert.assertEquals(JSONScanner.END, lexer.matchStat());
    	__CLR4_5_21j0i1j0ilusvndhn.R.inc(71326);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_5_21j0i1j0ilusvndhn.R.flushNeeded();}}
    
    public void test_6() throws Exception {__CLR4_5_21j0i1j0ilusvndhn.R.globalSliceStart(getClass().getName(),71327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81j1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j0i1j0ilusvndhn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j0i1j0ilusvndhn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71327,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81j1b() throws Exception{try{__CLR4_5_21j0i1j0ilusvndhn.R.inc(71327);
    	__CLR4_5_21j0i1j0ilusvndhn.R.inc(71328);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"}{");
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71329);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
    	__CLR4_5_21j0i1j0ilusvndhn.R.inc(71330);Assert.assertEquals(0, hashCode);
    	__CLR4_5_21j0i1j0ilusvndhn.R.inc(71331);Assert.assertEquals(JSONScanner.NOT_MATCH, lexer.matchStat());
    }finally{__CLR4_5_21j0i1j0ilusvndhn.R.flushNeeded();}}
    
    public void test_7() throws Exception {__CLR4_5_21j0i1j0ilusvndhn.R.globalSliceStart(getClass().getName(),71332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1j1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j0i1j0ilusvndhn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j0i1j0ilusvndhn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71332,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1j1g() throws Exception{try{__CLR4_5_21j0i1j0ilusvndhn.R.inc(71332);
    	__CLR4_5_21j0i1j0ilusvndhn.R.inc(71333);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"");
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71334);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
    	__CLR4_5_21j0i1j0ilusvndhn.R.inc(71335);Assert.assertEquals(0, hashCode);
    	__CLR4_5_21j0i1j0ilusvndhn.R.inc(71336);Assert.assertEquals(JSONScanner.NOT_MATCH, lexer.matchStat());
    }finally{__CLR4_5_21j0i1j0ilusvndhn.R.flushNeeded();}}

    static long fnv_hash(String text) {try{__CLR4_5_21j0i1j0ilusvndhn.R.inc(71337);
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71338);long hash = 0xcbf29ce484222325L;
        __CLR4_5_21j0i1j0ilusvndhn.R.inc(71339);for (int i = 0; (((i < text.length())&&(__CLR4_5_21j0i1j0ilusvndhn.R.iget(71340)!=0|true))||(__CLR4_5_21j0i1j0ilusvndhn.R.iget(71341)==0&false)); ++i) {{
            __CLR4_5_21j0i1j0ilusvndhn.R.inc(71342);char c = text.charAt(i);
            __CLR4_5_21j0i1j0ilusvndhn.R.inc(71343);hash ^= c;
            __CLR4_5_21j0i1j0ilusvndhn.R.inc(71344);hash *= 0x100000001b3L;
        }
        }__CLR4_5_21j0i1j0ilusvndhn.R.inc(71345);return hash;
    }finally{__CLR4_5_21j0i1j0ilusvndhn.R.flushNeeded();}}
}
