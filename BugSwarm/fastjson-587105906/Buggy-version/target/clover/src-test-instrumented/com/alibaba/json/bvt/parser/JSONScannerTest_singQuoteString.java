/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;

public class JSONScannerTest_singQuoteString extends TestCase {static class __CLR4_1_101i3x1i3xlusqkdvl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,70213,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_string() throws Exception {__CLR4_1_101i3x1i3xlusqkdvl.R.globalSliceStart(getClass().getName(),70125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d3tq791i3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i3x1i3xlusqkdvl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i3x1i3xlusqkdvl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70125,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d3tq791i3x() throws Exception{try{__CLR4_1_101i3x1i3xlusqkdvl.R.inc(70125);
        {
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70126);JSONScanner lexer = new JSONScanner("\'\u4e2d\u56fd\'");
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70127);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70128);lexer.nextToken();
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70129);Assert.assertEquals("\u4e2d\u56fd", lexer.stringVal());
        }
        {
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70130);JSONScanner lexer = new JSONScanner("'\u4e2d\u56fd\t\\'\\\"'");
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70131);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70132);lexer.nextToken();
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70133);Assert.assertEquals("\u4e2d\u56fd\t'\"", lexer.stringVal());
        }
        {
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70134);JSONScanner lexer = new JSONScanner("\'\u4e2d\u56fd\tV5\'");
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70135);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70136);lexer.nextToken();
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70137);Assert.assertEquals("\u4e2d\u56fd\tV5", lexer.stringVal());
        }

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70138);StringBuilder buf = new StringBuilder();

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70139);buf.append('\'');
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70140);buf.append("\\\\\\/\\b\\f\\n\\r\t\\u" + Integer.toHexString('\u4e2d'));
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70141);buf.append('\'');
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70142);buf.append('\u2001');

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70143);String text = buf.toString();

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70144);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length() - 1);
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70145);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70146);lexer.nextToken();

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70147);Assert.assertEquals(0, lexer.pos());

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70148);String stringVal = lexer.stringVal();

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70149);Assert.assertEquals("\"\\\\/\\b\\f\\n\\r\\t\u4e2d\"", JSON.toJSONString(stringVal));

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70150);JSON.toJSONString(stringVal);
    }finally{__CLR4_1_101i3x1i3xlusqkdvl.R.flushNeeded();}}

    public void test_string2() throws Exception {__CLR4_1_101i3x1i3xlusqkdvl.R.globalSliceStart(getClass().getName(),70151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mwdh0b1i4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i3x1i3xlusqkdvl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i3x1i3xlusqkdvl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70151,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mwdh0b1i4n() throws Exception{try{__CLR4_1_101i3x1i3xlusqkdvl.R.inc(70151);
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70152);StringBuilder buf = new StringBuilder();

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70153);buf.append('\'');
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70154);for (int i = 0; (((i < 200)&&(__CLR4_1_101i3x1i3xlusqkdvl.R.iget(70155)!=0|true))||(__CLR4_1_101i3x1i3xlusqkdvl.R.iget(70156)==0&false)); ++i) {{
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70157);buf.append("\\\\\\/\\b\\f\\n\\r\\t\\u" + Integer.toHexString('\u4e2d'));
        }
        }__CLR4_1_101i3x1i3xlusqkdvl.R.inc(70158);buf.append('\'');

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70159);String text = buf.toString();

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70160);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70161);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70162);lexer.nextToken();

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70163);Assert.assertEquals(0, lexer.pos());

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70164);String stringVal = lexer.stringVal();

        // Assert.assertEquals("\"\\\\\\/\\b\\f\\n\\r\\t\u4e2d\"",
        // JSON.toJSONString(stringVal));

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70165);JSON.toJSONString(stringVal);
    }finally{__CLR4_1_101i3x1i3xlusqkdvl.R.flushNeeded();}}

    public void test_string3() throws Exception {__CLR4_1_101i3x1i3xlusqkdvl.R.globalSliceStart(getClass().getName(),70166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10q5dfss1i52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i3x1i3xlusqkdvl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i3x1i3xlusqkdvl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70166,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10q5dfss1i52() throws Exception{try{__CLR4_1_101i3x1i3xlusqkdvl.R.inc(70166);
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70167);StringBuilder buf = new StringBuilder();

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70168);buf.append('\'');
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70169);for (int i = 0; (((i < 200)&&(__CLR4_1_101i3x1i3xlusqkdvl.R.iget(70170)!=0|true))||(__CLR4_1_101i3x1i3xlusqkdvl.R.iget(70171)==0&false)); ++i) {{
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70172);buf.append("abcdefghijklmn012345689ABCDEFG");
        }
        }__CLR4_1_101i3x1i3xlusqkdvl.R.inc(70173);buf.append('\'');

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70174);String text = buf.toString();

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70175);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70176);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70177);lexer.nextToken();

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70178);Assert.assertEquals(0, lexer.pos());

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70179);String stringVal = lexer.stringVal();

        // Assert.assertEquals("\"\\\\\\/\\b\\f\\n\\r\\t\u4e2d\"",
        // JSON.toJSONString(stringVal));

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70180);JSON.toJSONString(stringVal);
    }finally{__CLR4_1_101i3x1i3xlusqkdvl.R.flushNeeded();}}

    public void test_string4() throws Exception {__CLR4_1_101i3x1i3xlusqkdvl.R.globalSliceStart(getClass().getName(),70181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tedel91i5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i3x1i3xlusqkdvl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i3x1i3xlusqkdvl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70181,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tedel91i5h() throws Exception{try{__CLR4_1_101i3x1i3xlusqkdvl.R.inc(70181);
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70182);StringBuilder buf = new StringBuilder();

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70183);buf.append('\'');
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70184);for (int i = 0; (((i < 200)&&(__CLR4_1_101i3x1i3xlusqkdvl.R.iget(70185)!=0|true))||(__CLR4_1_101i3x1i3xlusqkdvl.R.iget(70186)==0&false)); ++i) {{
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70187);buf.append("\\tabcdefghijklmn012345689ABCDEFG");
        }
        }__CLR4_1_101i3x1i3xlusqkdvl.R.inc(70188);buf.append('\'');

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70189);String text = buf.toString();

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70190);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70191);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70192);lexer.nextToken();

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70193);Assert.assertEquals(0, lexer.pos());

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70194);String stringVal = lexer.stringVal();

        // Assert.assertEquals("\"\\\\\\/\\b\\f\\n\\r\\t\u4e2d\"",
        // JSON.toJSONString(stringVal));

        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70195);JSON.toJSONString(stringVal);
    }finally{__CLR4_1_101i3x1i3xlusqkdvl.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101i3x1i3xlusqkdvl.R.globalSliceStart(getClass().getName(),70196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1i5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i3x1i3xlusqkdvl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i3x1i3xlusqkdvl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70196,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1i5w() throws Exception{try{__CLR4_1_101i3x1i3xlusqkdvl.R.inc(70196);
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70197);Exception error = null;
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70198);try {
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70199);JSONScanner lexer = new JSONScanner("'k");
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70200);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70201);lexer.nextToken();
        } catch (JSONException ex) {
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70202);error = ex;
        }
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70203);Assert.assertNotNull(error);
    }finally{__CLR4_1_101i3x1i3xlusqkdvl.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101i3x1i3xlusqkdvl.R.globalSliceStart(getClass().getName(),70204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1i64();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i3x1i3xlusqkdvl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i3x1i3xlusqkdvl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70204,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1i64() throws Exception{try{__CLR4_1_101i3x1i3xlusqkdvl.R.inc(70204);
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70205);Exception error = null;
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70206);try {
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70207);JSONScanner lexer = new JSONScanner("'k\\k'");
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70208);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70209);lexer.nextToken();
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70210);Assert.assertEquals(JSONToken.ERROR, lexer.token());
        } catch (JSONException ex) {
            __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70211);error = ex;
        }
        __CLR4_1_101i3x1i3xlusqkdvl.R.inc(70212);Assert.assertNotNull(error);
    }finally{__CLR4_1_101i3x1i3xlusqkdvl.R.flushNeeded();}}
}
