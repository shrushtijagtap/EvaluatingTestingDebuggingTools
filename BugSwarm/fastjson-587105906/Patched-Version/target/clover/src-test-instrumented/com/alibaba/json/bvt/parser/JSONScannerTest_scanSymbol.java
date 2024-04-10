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
public class JSONScannerTest_scanSymbol extends TestCase {static class __CLR4_5_21i2a1i2alusyjtrs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,70114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21i2a1i2alusyjtrs.R.globalSliceStart(getClass().getName(),70066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21i2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i2a1i2alusyjtrs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i2a1i2alusyjtrs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21i2a() throws Exception{try{__CLR4_5_21i2a1i2alusyjtrs.R.inc(70066);
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70067);JSONScanner lexer = new JSONScanner("\"value\":\"aa\\n\"");
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70068);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70069);assertEquals(0, hashCode);
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70070);Assert.assertEquals(JSONScanner.NOT_MATCH, lexer.matchStat());
    }finally{__CLR4_5_21i2a1i2alusyjtrs.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21i2a1i2alusyjtrs.R.globalSliceStart(getClass().getName(),70071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1i2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i2a1i2alusyjtrs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i2a1i2alusyjtrs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70071,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1i2f() throws Exception{try{__CLR4_5_21i2a1i2alusyjtrs.R.inc(70071);
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70072);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"},");
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70073);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70074);Assert.assertEquals(fnv_hash("aa"), hashCode);
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70075);Assert.assertEquals(JSONScanner.END, lexer.matchStat());
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70076);Assert.assertEquals(JSONToken.COMMA, lexer.token());
    }finally{__CLR4_5_21i2a1i2alusyjtrs.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_5_21i2a1i2alusyjtrs.R.globalSliceStart(getClass().getName(),70077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441i2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i2a1i2alusyjtrs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i2a1i2alusyjtrs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70077,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441i2l() throws Exception{try{__CLR4_5_21i2a1i2alusyjtrs.R.inc(70077);
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70078);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"}]");
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70079);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70080);Assert.assertEquals(fnv_hash("aa"), hashCode);
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70081);Assert.assertEquals(JSONScanner.END, lexer.matchStat());
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70082);Assert.assertEquals(JSONToken.RBRACKET, lexer.token());
    }finally{__CLR4_5_21i2a1i2alusyjtrs.R.flushNeeded();}}
    
    public void test_3() throws Exception {__CLR4_5_21i2a1i2alusyjtrs.R.globalSliceStart(getClass().getName(),70083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1i2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i2a1i2alusyjtrs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i2a1i2alusyjtrs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70083,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1i2r() throws Exception{try{__CLR4_5_21i2a1i2alusyjtrs.R.inc(70083);
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70084);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"}}");
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70085);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70086);Assert.assertEquals(fnv_hash("aa"), hashCode);
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70087);Assert.assertEquals(JSONScanner.END, lexer.matchStat());
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70088);Assert.assertEquals(JSONToken.RBRACE, lexer.token());
    }finally{__CLR4_5_21i2a1i2alusyjtrs.R.flushNeeded();}}
    
    public void test_4() throws Exception {__CLR4_5_21i2a1i2alusyjtrs.R.globalSliceStart(getClass().getName(),70089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61i2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i2a1i2alusyjtrs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i2a1i2alusyjtrs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70089,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61i2x() throws Exception{try{__CLR4_5_21i2a1i2alusyjtrs.R.inc(70089);
    	__CLR4_5_21i2a1i2alusyjtrs.R.inc(70090);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"}");
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70091);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
    	__CLR4_5_21i2a1i2alusyjtrs.R.inc(70092);Assert.assertEquals(fnv_hash("aa"), hashCode);
    	__CLR4_5_21i2a1i2alusyjtrs.R.inc(70093);Assert.assertEquals(JSONScanner.END, lexer.matchStat());
    	__CLR4_5_21i2a1i2alusyjtrs.R.inc(70094);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_5_21i2a1i2alusyjtrs.R.flushNeeded();}}
    
    public void test_6() throws Exception {__CLR4_5_21i2a1i2alusyjtrs.R.globalSliceStart(getClass().getName(),70095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81i33();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i2a1i2alusyjtrs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i2a1i2alusyjtrs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70095,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81i33() throws Exception{try{__CLR4_5_21i2a1i2alusyjtrs.R.inc(70095);
    	__CLR4_5_21i2a1i2alusyjtrs.R.inc(70096);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"}{");
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70097);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
    	__CLR4_5_21i2a1i2alusyjtrs.R.inc(70098);Assert.assertEquals(0, hashCode);
    	__CLR4_5_21i2a1i2alusyjtrs.R.inc(70099);Assert.assertEquals(JSONScanner.NOT_MATCH, lexer.matchStat());
    }finally{__CLR4_5_21i2a1i2alusyjtrs.R.flushNeeded();}}
    
    public void test_7() throws Exception {__CLR4_5_21i2a1i2alusyjtrs.R.globalSliceStart(getClass().getName(),70100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1i38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i2a1i2alusyjtrs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i2a1i2alusyjtrs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70100,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1i38() throws Exception{try{__CLR4_5_21i2a1i2alusyjtrs.R.inc(70100);
    	__CLR4_5_21i2a1i2alusyjtrs.R.inc(70101);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"");
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70102);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
    	__CLR4_5_21i2a1i2alusyjtrs.R.inc(70103);Assert.assertEquals(0, hashCode);
    	__CLR4_5_21i2a1i2alusyjtrs.R.inc(70104);Assert.assertEquals(JSONScanner.NOT_MATCH, lexer.matchStat());
    }finally{__CLR4_5_21i2a1i2alusyjtrs.R.flushNeeded();}}

    static long fnv_hash(String text) {try{__CLR4_5_21i2a1i2alusyjtrs.R.inc(70105);
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70106);long hash = 0xcbf29ce484222325L;
        __CLR4_5_21i2a1i2alusyjtrs.R.inc(70107);for (int i = 0; (((i < text.length())&&(__CLR4_5_21i2a1i2alusyjtrs.R.iget(70108)!=0|true))||(__CLR4_5_21i2a1i2alusyjtrs.R.iget(70109)==0&false)); ++i) {{
            __CLR4_5_21i2a1i2alusyjtrs.R.inc(70110);char c = text.charAt(i);
            __CLR4_5_21i2a1i2alusyjtrs.R.inc(70111);hash ^= c;
            __CLR4_5_21i2a1i2alusyjtrs.R.inc(70112);hash *= 0x100000001b3L;
        }
        }__CLR4_5_21i2a1i2alusyjtrs.R.inc(70113);return hash;
    }finally{__CLR4_5_21i2a1i2alusyjtrs.R.flushNeeded();}}
}
