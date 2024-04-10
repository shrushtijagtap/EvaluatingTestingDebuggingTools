/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;

public class JSONScannerTest_singQuoteString extends TestCase {static class __CLR4_1_101j251j25luszwcpu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,71445,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_string() throws Exception {__CLR4_1_101j251j25luszwcpu.R.globalSliceStart(getClass().getName(),71357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d3tq791j25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j251j25luszwcpu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j251j25luszwcpu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71357,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d3tq791j25() throws Exception{try{__CLR4_1_101j251j25luszwcpu.R.inc(71357);
        {
            __CLR4_1_101j251j25luszwcpu.R.inc(71358);JSONScanner lexer = new JSONScanner("\'\u4e2d\u56fd\'");
            __CLR4_1_101j251j25luszwcpu.R.inc(71359);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_1_101j251j25luszwcpu.R.inc(71360);lexer.nextToken();
            __CLR4_1_101j251j25luszwcpu.R.inc(71361);Assert.assertEquals("\u4e2d\u56fd", lexer.stringVal());
        }
        {
            __CLR4_1_101j251j25luszwcpu.R.inc(71362);JSONScanner lexer = new JSONScanner("'\u4e2d\u56fd\t\\'\\\"'");
            __CLR4_1_101j251j25luszwcpu.R.inc(71363);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_1_101j251j25luszwcpu.R.inc(71364);lexer.nextToken();
            __CLR4_1_101j251j25luszwcpu.R.inc(71365);Assert.assertEquals("\u4e2d\u56fd\t'\"", lexer.stringVal());
        }
        {
            __CLR4_1_101j251j25luszwcpu.R.inc(71366);JSONScanner lexer = new JSONScanner("\'\u4e2d\u56fd\tV5\'");
            __CLR4_1_101j251j25luszwcpu.R.inc(71367);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_1_101j251j25luszwcpu.R.inc(71368);lexer.nextToken();
            __CLR4_1_101j251j25luszwcpu.R.inc(71369);Assert.assertEquals("\u4e2d\u56fd\tV5", lexer.stringVal());
        }

        __CLR4_1_101j251j25luszwcpu.R.inc(71370);StringBuilder buf = new StringBuilder();

        __CLR4_1_101j251j25luszwcpu.R.inc(71371);buf.append('\'');
        __CLR4_1_101j251j25luszwcpu.R.inc(71372);buf.append("\\\\\\/\\b\\f\\n\\r\t\\u" + Integer.toHexString('\u4e2d'));
        __CLR4_1_101j251j25luszwcpu.R.inc(71373);buf.append('\'');
        __CLR4_1_101j251j25luszwcpu.R.inc(71374);buf.append('\u2001');

        __CLR4_1_101j251j25luszwcpu.R.inc(71375);String text = buf.toString();

        __CLR4_1_101j251j25luszwcpu.R.inc(71376);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length() - 1);
        __CLR4_1_101j251j25luszwcpu.R.inc(71377);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101j251j25luszwcpu.R.inc(71378);lexer.nextToken();

        __CLR4_1_101j251j25luszwcpu.R.inc(71379);Assert.assertEquals(0, lexer.pos());

        __CLR4_1_101j251j25luszwcpu.R.inc(71380);String stringVal = lexer.stringVal();

        __CLR4_1_101j251j25luszwcpu.R.inc(71381);Assert.assertEquals("\"\\\\/\\b\\f\\n\\r\\t\u4e2d\"", JSON.toJSONString(stringVal));

        __CLR4_1_101j251j25luszwcpu.R.inc(71382);JSON.toJSONString(stringVal);
    }finally{__CLR4_1_101j251j25luszwcpu.R.flushNeeded();}}

    public void test_string2() throws Exception {__CLR4_1_101j251j25luszwcpu.R.globalSliceStart(getClass().getName(),71383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mwdh0b1j2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j251j25luszwcpu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j251j25luszwcpu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71383,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mwdh0b1j2v() throws Exception{try{__CLR4_1_101j251j25luszwcpu.R.inc(71383);
        __CLR4_1_101j251j25luszwcpu.R.inc(71384);StringBuilder buf = new StringBuilder();

        __CLR4_1_101j251j25luszwcpu.R.inc(71385);buf.append('\'');
        __CLR4_1_101j251j25luszwcpu.R.inc(71386);for (int i = 0; (((i < 200)&&(__CLR4_1_101j251j25luszwcpu.R.iget(71387)!=0|true))||(__CLR4_1_101j251j25luszwcpu.R.iget(71388)==0&false)); ++i) {{
            __CLR4_1_101j251j25luszwcpu.R.inc(71389);buf.append("\\\\\\/\\b\\f\\n\\r\\t\\u" + Integer.toHexString('\u4e2d'));
        }
        }__CLR4_1_101j251j25luszwcpu.R.inc(71390);buf.append('\'');

        __CLR4_1_101j251j25luszwcpu.R.inc(71391);String text = buf.toString();

        __CLR4_1_101j251j25luszwcpu.R.inc(71392);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_1_101j251j25luszwcpu.R.inc(71393);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101j251j25luszwcpu.R.inc(71394);lexer.nextToken();

        __CLR4_1_101j251j25luszwcpu.R.inc(71395);Assert.assertEquals(0, lexer.pos());

        __CLR4_1_101j251j25luszwcpu.R.inc(71396);String stringVal = lexer.stringVal();

        // Assert.assertEquals("\"\\\\\\/\\b\\f\\n\\r\\t\u4e2d\"",
        // JSON.toJSONString(stringVal));

        __CLR4_1_101j251j25luszwcpu.R.inc(71397);JSON.toJSONString(stringVal);
    }finally{__CLR4_1_101j251j25luszwcpu.R.flushNeeded();}}

    public void test_string3() throws Exception {__CLR4_1_101j251j25luszwcpu.R.globalSliceStart(getClass().getName(),71398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10q5dfss1j3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j251j25luszwcpu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j251j25luszwcpu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71398,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10q5dfss1j3a() throws Exception{try{__CLR4_1_101j251j25luszwcpu.R.inc(71398);
        __CLR4_1_101j251j25luszwcpu.R.inc(71399);StringBuilder buf = new StringBuilder();

        __CLR4_1_101j251j25luszwcpu.R.inc(71400);buf.append('\'');
        __CLR4_1_101j251j25luszwcpu.R.inc(71401);for (int i = 0; (((i < 200)&&(__CLR4_1_101j251j25luszwcpu.R.iget(71402)!=0|true))||(__CLR4_1_101j251j25luszwcpu.R.iget(71403)==0&false)); ++i) {{
            __CLR4_1_101j251j25luszwcpu.R.inc(71404);buf.append("abcdefghijklmn012345689ABCDEFG");
        }
        }__CLR4_1_101j251j25luszwcpu.R.inc(71405);buf.append('\'');

        __CLR4_1_101j251j25luszwcpu.R.inc(71406);String text = buf.toString();

        __CLR4_1_101j251j25luszwcpu.R.inc(71407);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_1_101j251j25luszwcpu.R.inc(71408);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101j251j25luszwcpu.R.inc(71409);lexer.nextToken();

        __CLR4_1_101j251j25luszwcpu.R.inc(71410);Assert.assertEquals(0, lexer.pos());

        __CLR4_1_101j251j25luszwcpu.R.inc(71411);String stringVal = lexer.stringVal();

        // Assert.assertEquals("\"\\\\\\/\\b\\f\\n\\r\\t\u4e2d\"",
        // JSON.toJSONString(stringVal));

        __CLR4_1_101j251j25luszwcpu.R.inc(71412);JSON.toJSONString(stringVal);
    }finally{__CLR4_1_101j251j25luszwcpu.R.flushNeeded();}}

    public void test_string4() throws Exception {__CLR4_1_101j251j25luszwcpu.R.globalSliceStart(getClass().getName(),71413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tedel91j3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j251j25luszwcpu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j251j25luszwcpu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71413,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tedel91j3p() throws Exception{try{__CLR4_1_101j251j25luszwcpu.R.inc(71413);
        __CLR4_1_101j251j25luszwcpu.R.inc(71414);StringBuilder buf = new StringBuilder();

        __CLR4_1_101j251j25luszwcpu.R.inc(71415);buf.append('\'');
        __CLR4_1_101j251j25luszwcpu.R.inc(71416);for (int i = 0; (((i < 200)&&(__CLR4_1_101j251j25luszwcpu.R.iget(71417)!=0|true))||(__CLR4_1_101j251j25luszwcpu.R.iget(71418)==0&false)); ++i) {{
            __CLR4_1_101j251j25luszwcpu.R.inc(71419);buf.append("\\tabcdefghijklmn012345689ABCDEFG");
        }
        }__CLR4_1_101j251j25luszwcpu.R.inc(71420);buf.append('\'');

        __CLR4_1_101j251j25luszwcpu.R.inc(71421);String text = buf.toString();

        __CLR4_1_101j251j25luszwcpu.R.inc(71422);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_1_101j251j25luszwcpu.R.inc(71423);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101j251j25luszwcpu.R.inc(71424);lexer.nextToken();

        __CLR4_1_101j251j25luszwcpu.R.inc(71425);Assert.assertEquals(0, lexer.pos());

        __CLR4_1_101j251j25luszwcpu.R.inc(71426);String stringVal = lexer.stringVal();

        // Assert.assertEquals("\"\\\\\\/\\b\\f\\n\\r\\t\u4e2d\"",
        // JSON.toJSONString(stringVal));

        __CLR4_1_101j251j25luszwcpu.R.inc(71427);JSON.toJSONString(stringVal);
    }finally{__CLR4_1_101j251j25luszwcpu.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101j251j25luszwcpu.R.globalSliceStart(getClass().getName(),71428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1j44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j251j25luszwcpu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j251j25luszwcpu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71428,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1j44() throws Exception{try{__CLR4_1_101j251j25luszwcpu.R.inc(71428);
        __CLR4_1_101j251j25luszwcpu.R.inc(71429);Exception error = null;
        __CLR4_1_101j251j25luszwcpu.R.inc(71430);try {
            __CLR4_1_101j251j25luszwcpu.R.inc(71431);JSONScanner lexer = new JSONScanner("'k");
            __CLR4_1_101j251j25luszwcpu.R.inc(71432);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_1_101j251j25luszwcpu.R.inc(71433);lexer.nextToken();
        } catch (JSONException ex) {
            __CLR4_1_101j251j25luszwcpu.R.inc(71434);error = ex;
        }
        __CLR4_1_101j251j25luszwcpu.R.inc(71435);Assert.assertNotNull(error);
    }finally{__CLR4_1_101j251j25luszwcpu.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101j251j25luszwcpu.R.globalSliceStart(getClass().getName(),71436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1j4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j251j25luszwcpu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j251j25luszwcpu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71436,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1j4c() throws Exception{try{__CLR4_1_101j251j25luszwcpu.R.inc(71436);
        __CLR4_1_101j251j25luszwcpu.R.inc(71437);Exception error = null;
        __CLR4_1_101j251j25luszwcpu.R.inc(71438);try {
            __CLR4_1_101j251j25luszwcpu.R.inc(71439);JSONScanner lexer = new JSONScanner("'k\\k'");
            __CLR4_1_101j251j25luszwcpu.R.inc(71440);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_1_101j251j25luszwcpu.R.inc(71441);lexer.nextToken();
            __CLR4_1_101j251j25luszwcpu.R.inc(71442);Assert.assertEquals(JSONToken.ERROR, lexer.token());
        } catch (JSONException ex) {
            __CLR4_1_101j251j25luszwcpu.R.inc(71443);error = ex;
        }
        __CLR4_1_101j251j25luszwcpu.R.inc(71444);Assert.assertNotNull(error);
    }finally{__CLR4_1_101j251j25luszwcpu.R.flushNeeded();}}
}
