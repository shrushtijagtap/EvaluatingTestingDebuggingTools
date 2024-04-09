/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;

public class JSONScannerTest_singQuoteString extends TestCase {static class __CLR4_5_21j1u1j1ulusvndhz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,71434,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_string() throws Exception {__CLR4_5_21j1u1j1ulusvndhz.R.globalSliceStart(getClass().getName(),71346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d3tq791j1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j1u1j1ulusvndhz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j1u1j1ulusvndhz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71346,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d3tq791j1u() throws Exception{try{__CLR4_5_21j1u1j1ulusvndhz.R.inc(71346);
        {
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71347);JSONScanner lexer = new JSONScanner("\'\u4e2d\u56fd\'");
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71348);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71349);lexer.nextToken();
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71350);Assert.assertEquals("\u4e2d\u56fd", lexer.stringVal());
        }
        {
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71351);JSONScanner lexer = new JSONScanner("'\u4e2d\u56fd\t\\'\\\"'");
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71352);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71353);lexer.nextToken();
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71354);Assert.assertEquals("\u4e2d\u56fd\t'\"", lexer.stringVal());
        }
        {
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71355);JSONScanner lexer = new JSONScanner("\'\u4e2d\u56fd\tV5\'");
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71356);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71357);lexer.nextToken();
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71358);Assert.assertEquals("\u4e2d\u56fd\tV5", lexer.stringVal());
        }

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71359);StringBuilder buf = new StringBuilder();

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71360);buf.append('\'');
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71361);buf.append("\\\\\\/\\b\\f\\n\\r\t\\u" + Integer.toHexString('\u4e2d'));
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71362);buf.append('\'');
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71363);buf.append('\u2001');

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71364);String text = buf.toString();

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71365);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length() - 1);
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71366);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71367);lexer.nextToken();

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71368);Assert.assertEquals(0, lexer.pos());

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71369);String stringVal = lexer.stringVal();

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71370);Assert.assertEquals("\"\\\\/\\b\\f\\n\\r\\t\u4e2d\"", JSON.toJSONString(stringVal));

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71371);JSON.toJSONString(stringVal);
    }finally{__CLR4_5_21j1u1j1ulusvndhz.R.flushNeeded();}}

    public void test_string2() throws Exception {__CLR4_5_21j1u1j1ulusvndhz.R.globalSliceStart(getClass().getName(),71372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mwdh0b1j2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j1u1j1ulusvndhz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j1u1j1ulusvndhz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71372,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mwdh0b1j2k() throws Exception{try{__CLR4_5_21j1u1j1ulusvndhz.R.inc(71372);
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71373);StringBuilder buf = new StringBuilder();

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71374);buf.append('\'');
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71375);for (int i = 0; (((i < 200)&&(__CLR4_5_21j1u1j1ulusvndhz.R.iget(71376)!=0|true))||(__CLR4_5_21j1u1j1ulusvndhz.R.iget(71377)==0&false)); ++i) {{
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71378);buf.append("\\\\\\/\\b\\f\\n\\r\\t\\u" + Integer.toHexString('\u4e2d'));
        }
        }__CLR4_5_21j1u1j1ulusvndhz.R.inc(71379);buf.append('\'');

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71380);String text = buf.toString();

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71381);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71382);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71383);lexer.nextToken();

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71384);Assert.assertEquals(0, lexer.pos());

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71385);String stringVal = lexer.stringVal();

        // Assert.assertEquals("\"\\\\\\/\\b\\f\\n\\r\\t\u4e2d\"",
        // JSON.toJSONString(stringVal));

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71386);JSON.toJSONString(stringVal);
    }finally{__CLR4_5_21j1u1j1ulusvndhz.R.flushNeeded();}}

    public void test_string3() throws Exception {__CLR4_5_21j1u1j1ulusvndhz.R.globalSliceStart(getClass().getName(),71387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q5dfss1j2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j1u1j1ulusvndhz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j1u1j1ulusvndhz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71387,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q5dfss1j2z() throws Exception{try{__CLR4_5_21j1u1j1ulusvndhz.R.inc(71387);
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71388);StringBuilder buf = new StringBuilder();

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71389);buf.append('\'');
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71390);for (int i = 0; (((i < 200)&&(__CLR4_5_21j1u1j1ulusvndhz.R.iget(71391)!=0|true))||(__CLR4_5_21j1u1j1ulusvndhz.R.iget(71392)==0&false)); ++i) {{
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71393);buf.append("abcdefghijklmn012345689ABCDEFG");
        }
        }__CLR4_5_21j1u1j1ulusvndhz.R.inc(71394);buf.append('\'');

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71395);String text = buf.toString();

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71396);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71397);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71398);lexer.nextToken();

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71399);Assert.assertEquals(0, lexer.pos());

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71400);String stringVal = lexer.stringVal();

        // Assert.assertEquals("\"\\\\\\/\\b\\f\\n\\r\\t\u4e2d\"",
        // JSON.toJSONString(stringVal));

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71401);JSON.toJSONString(stringVal);
    }finally{__CLR4_5_21j1u1j1ulusvndhz.R.flushNeeded();}}

    public void test_string4() throws Exception {__CLR4_5_21j1u1j1ulusvndhz.R.globalSliceStart(getClass().getName(),71402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tedel91j3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j1u1j1ulusvndhz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j1u1j1ulusvndhz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71402,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tedel91j3e() throws Exception{try{__CLR4_5_21j1u1j1ulusvndhz.R.inc(71402);
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71403);StringBuilder buf = new StringBuilder();

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71404);buf.append('\'');
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71405);for (int i = 0; (((i < 200)&&(__CLR4_5_21j1u1j1ulusvndhz.R.iget(71406)!=0|true))||(__CLR4_5_21j1u1j1ulusvndhz.R.iget(71407)==0&false)); ++i) {{
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71408);buf.append("\\tabcdefghijklmn012345689ABCDEFG");
        }
        }__CLR4_5_21j1u1j1ulusvndhz.R.inc(71409);buf.append('\'');

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71410);String text = buf.toString();

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71411);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71412);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71413);lexer.nextToken();

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71414);Assert.assertEquals(0, lexer.pos());

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71415);String stringVal = lexer.stringVal();

        // Assert.assertEquals("\"\\\\\\/\\b\\f\\n\\r\\t\u4e2d\"",
        // JSON.toJSONString(stringVal));

        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71416);JSON.toJSONString(stringVal);
    }finally{__CLR4_5_21j1u1j1ulusvndhz.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21j1u1j1ulusvndhz.R.globalSliceStart(getClass().getName(),71417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1j3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j1u1j1ulusvndhz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j1u1j1ulusvndhz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71417,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1j3t() throws Exception{try{__CLR4_5_21j1u1j1ulusvndhz.R.inc(71417);
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71418);Exception error = null;
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71419);try {
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71420);JSONScanner lexer = new JSONScanner("'k");
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71421);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71422);lexer.nextToken();
        } catch (JSONException ex) {
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71423);error = ex;
        }
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71424);Assert.assertNotNull(error);
    }finally{__CLR4_5_21j1u1j1ulusvndhz.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21j1u1j1ulusvndhz.R.globalSliceStart(getClass().getName(),71425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1j41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j1u1j1ulusvndhz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j1u1j1ulusvndhz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71425,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1j41() throws Exception{try{__CLR4_5_21j1u1j1ulusvndhz.R.inc(71425);
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71426);Exception error = null;
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71427);try {
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71428);JSONScanner lexer = new JSONScanner("'k\\k'");
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71429);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71430);lexer.nextToken();
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71431);Assert.assertEquals(JSONToken.ERROR, lexer.token());
        } catch (JSONException ex) {
            __CLR4_5_21j1u1j1ulusvndhz.R.inc(71432);error = ex;
        }
        __CLR4_5_21j1u1j1ulusvndhz.R.inc(71433);Assert.assertNotNull(error);
    }finally{__CLR4_5_21j1u1j1ulusvndhz.R.flushNeeded();}}
}
