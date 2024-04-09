/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

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
public class JSONScannerTest_scanSymbol extends TestCase {static class __CLR4_1_101i2l1i2llusqkdv9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,70125,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101i2l1i2llusqkdv9.R.globalSliceStart(getClass().getName(),70077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21i2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i2l1i2llusqkdv9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i2l1i2llusqkdv9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70077,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21i2l() throws Exception{try{__CLR4_1_101i2l1i2llusqkdv9.R.inc(70077);
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70078);JSONScanner lexer = new JSONScanner("\"value\":\"aa\\n\"");
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70079);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70080);assertEquals(0, hashCode);
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70081);Assert.assertEquals(JSONScanner.NOT_MATCH, lexer.matchStat());
    }finally{__CLR4_1_101i2l1i2llusqkdv9.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101i2l1i2llusqkdv9.R.globalSliceStart(getClass().getName(),70082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1i2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i2l1i2llusqkdv9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i2l1i2llusqkdv9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70082,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1i2q() throws Exception{try{__CLR4_1_101i2l1i2llusqkdv9.R.inc(70082);
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70083);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"},");
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70084);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70085);Assert.assertEquals(fnv_hash("aa"), hashCode);
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70086);Assert.assertEquals(JSONScanner.END, lexer.matchStat());
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70087);Assert.assertEquals(JSONToken.COMMA, lexer.token());
    }finally{__CLR4_1_101i2l1i2llusqkdv9.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_1_101i2l1i2llusqkdv9.R.globalSliceStart(getClass().getName(),70088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441i2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i2l1i2llusqkdv9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i2l1i2llusqkdv9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70088,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441i2w() throws Exception{try{__CLR4_1_101i2l1i2llusqkdv9.R.inc(70088);
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70089);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"}]");
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70090);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70091);Assert.assertEquals(fnv_hash("aa"), hashCode);
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70092);Assert.assertEquals(JSONScanner.END, lexer.matchStat());
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70093);Assert.assertEquals(JSONToken.RBRACKET, lexer.token());
    }finally{__CLR4_1_101i2l1i2llusqkdv9.R.flushNeeded();}}
    
    public void test_3() throws Exception {__CLR4_1_101i2l1i2llusqkdv9.R.globalSliceStart(getClass().getName(),70094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1i32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i2l1i2llusqkdv9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i2l1i2llusqkdv9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70094,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1i32() throws Exception{try{__CLR4_1_101i2l1i2llusqkdv9.R.inc(70094);
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70095);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"}}");
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70096);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70097);Assert.assertEquals(fnv_hash("aa"), hashCode);
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70098);Assert.assertEquals(JSONScanner.END, lexer.matchStat());
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70099);Assert.assertEquals(JSONToken.RBRACE, lexer.token());
    }finally{__CLR4_1_101i2l1i2llusqkdv9.R.flushNeeded();}}
    
    public void test_4() throws Exception {__CLR4_1_101i2l1i2llusqkdv9.R.globalSliceStart(getClass().getName(),70100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61i38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i2l1i2llusqkdv9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i2l1i2llusqkdv9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70100,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61i38() throws Exception{try{__CLR4_1_101i2l1i2llusqkdv9.R.inc(70100);
    	__CLR4_1_101i2l1i2llusqkdv9.R.inc(70101);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"}");
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70102);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
    	__CLR4_1_101i2l1i2llusqkdv9.R.inc(70103);Assert.assertEquals(fnv_hash("aa"), hashCode);
    	__CLR4_1_101i2l1i2llusqkdv9.R.inc(70104);Assert.assertEquals(JSONScanner.END, lexer.matchStat());
    	__CLR4_1_101i2l1i2llusqkdv9.R.inc(70105);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_1_101i2l1i2llusqkdv9.R.flushNeeded();}}
    
    public void test_6() throws Exception {__CLR4_1_101i2l1i2llusqkdv9.R.globalSliceStart(getClass().getName(),70106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81i3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i2l1i2llusqkdv9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i2l1i2llusqkdv9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70106,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81i3e() throws Exception{try{__CLR4_1_101i2l1i2llusqkdv9.R.inc(70106);
    	__CLR4_1_101i2l1i2llusqkdv9.R.inc(70107);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"}{");
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70108);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
    	__CLR4_1_101i2l1i2llusqkdv9.R.inc(70109);Assert.assertEquals(0, hashCode);
    	__CLR4_1_101i2l1i2llusqkdv9.R.inc(70110);Assert.assertEquals(JSONScanner.NOT_MATCH, lexer.matchStat());
    }finally{__CLR4_1_101i2l1i2llusqkdv9.R.flushNeeded();}}
    
    public void test_7() throws Exception {__CLR4_1_101i2l1i2llusqkdv9.R.globalSliceStart(getClass().getName(),70111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1i3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i2l1i2llusqkdv9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i2l1i2llusqkdv9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanSymbol.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70111,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1i3j() throws Exception{try{__CLR4_1_101i2l1i2llusqkdv9.R.inc(70111);
    	__CLR4_1_101i2l1i2llusqkdv9.R.inc(70112);JSONScanner lexer = new JSONScanner("\"value\":\"aa\"");
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70113);long hashCode = lexer.scanFieldSymbol("\"value\":".toCharArray());
    	__CLR4_1_101i2l1i2llusqkdv9.R.inc(70114);Assert.assertEquals(0, hashCode);
    	__CLR4_1_101i2l1i2llusqkdv9.R.inc(70115);Assert.assertEquals(JSONScanner.NOT_MATCH, lexer.matchStat());
    }finally{__CLR4_1_101i2l1i2llusqkdv9.R.flushNeeded();}}

    static long fnv_hash(String text) {try{__CLR4_1_101i2l1i2llusqkdv9.R.inc(70116);
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70117);long hash = 0xcbf29ce484222325L;
        __CLR4_1_101i2l1i2llusqkdv9.R.inc(70118);for (int i = 0; (((i < text.length())&&(__CLR4_1_101i2l1i2llusqkdv9.R.iget(70119)!=0|true))||(__CLR4_1_101i2l1i2llusqkdv9.R.iget(70120)==0&false)); ++i) {{
            __CLR4_1_101i2l1i2llusqkdv9.R.inc(70121);char c = text.charAt(i);
            __CLR4_1_101i2l1i2llusqkdv9.R.inc(70122);hash ^= c;
            __CLR4_1_101i2l1i2llusqkdv9.R.inc(70123);hash *= 0x100000001b3L;
        }
        }__CLR4_1_101i2l1i2llusqkdv9.R.inc(70124);return hash;
    }finally{__CLR4_1_101i2l1i2llusqkdv9.R.flushNeeded();}}
}
