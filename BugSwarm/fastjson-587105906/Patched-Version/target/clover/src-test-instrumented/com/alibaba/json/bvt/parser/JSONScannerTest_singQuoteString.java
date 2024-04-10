/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;

public class JSONScannerTest_singQuoteString extends TestCase {static class __CLR4_5_21i3m1i3mlusyjtry{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,70202,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_string() throws Exception {__CLR4_5_21i3m1i3mlusyjtry.R.globalSliceStart(getClass().getName(),70114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d3tq791i3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i3m1i3mlusyjtry.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i3m1i3mlusyjtry.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70114,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d3tq791i3m() throws Exception{try{__CLR4_5_21i3m1i3mlusyjtry.R.inc(70114);
        {
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70115);JSONScanner lexer = new JSONScanner("\'\u4e2d\u56fd\'");
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70116);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70117);lexer.nextToken();
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70118);Assert.assertEquals("\u4e2d\u56fd", lexer.stringVal());
        }
        {
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70119);JSONScanner lexer = new JSONScanner("'\u4e2d\u56fd\t\\'\\\"'");
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70120);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70121);lexer.nextToken();
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70122);Assert.assertEquals("\u4e2d\u56fd\t'\"", lexer.stringVal());
        }
        {
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70123);JSONScanner lexer = new JSONScanner("\'\u4e2d\u56fd\tV5\'");
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70124);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70125);lexer.nextToken();
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70126);Assert.assertEquals("\u4e2d\u56fd\tV5", lexer.stringVal());
        }

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70127);StringBuilder buf = new StringBuilder();

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70128);buf.append('\'');
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70129);buf.append("\\\\\\/\\b\\f\\n\\r\t\\u" + Integer.toHexString('\u4e2d'));
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70130);buf.append('\'');
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70131);buf.append('\u2001');

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70132);String text = buf.toString();

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70133);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length() - 1);
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70134);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70135);lexer.nextToken();

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70136);Assert.assertEquals(0, lexer.pos());

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70137);String stringVal = lexer.stringVal();

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70138);Assert.assertEquals("\"\\\\/\\b\\f\\n\\r\\t\u4e2d\"", JSON.toJSONString(stringVal));

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70139);JSON.toJSONString(stringVal);
    }finally{__CLR4_5_21i3m1i3mlusyjtry.R.flushNeeded();}}

    public void test_string2() throws Exception {__CLR4_5_21i3m1i3mlusyjtry.R.globalSliceStart(getClass().getName(),70140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mwdh0b1i4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i3m1i3mlusyjtry.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i3m1i3mlusyjtry.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70140,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mwdh0b1i4c() throws Exception{try{__CLR4_5_21i3m1i3mlusyjtry.R.inc(70140);
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70141);StringBuilder buf = new StringBuilder();

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70142);buf.append('\'');
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70143);for (int i = 0; (((i < 200)&&(__CLR4_5_21i3m1i3mlusyjtry.R.iget(70144)!=0|true))||(__CLR4_5_21i3m1i3mlusyjtry.R.iget(70145)==0&false)); ++i) {{
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70146);buf.append("\\\\\\/\\b\\f\\n\\r\\t\\u" + Integer.toHexString('\u4e2d'));
        }
        }__CLR4_5_21i3m1i3mlusyjtry.R.inc(70147);buf.append('\'');

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70148);String text = buf.toString();

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70149);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70150);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70151);lexer.nextToken();

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70152);Assert.assertEquals(0, lexer.pos());

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70153);String stringVal = lexer.stringVal();

        // Assert.assertEquals("\"\\\\\\/\\b\\f\\n\\r\\t\u4e2d\"",
        // JSON.toJSONString(stringVal));

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70154);JSON.toJSONString(stringVal);
    }finally{__CLR4_5_21i3m1i3mlusyjtry.R.flushNeeded();}}

    public void test_string3() throws Exception {__CLR4_5_21i3m1i3mlusyjtry.R.globalSliceStart(getClass().getName(),70155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q5dfss1i4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i3m1i3mlusyjtry.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i3m1i3mlusyjtry.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q5dfss1i4r() throws Exception{try{__CLR4_5_21i3m1i3mlusyjtry.R.inc(70155);
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70156);StringBuilder buf = new StringBuilder();

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70157);buf.append('\'');
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70158);for (int i = 0; (((i < 200)&&(__CLR4_5_21i3m1i3mlusyjtry.R.iget(70159)!=0|true))||(__CLR4_5_21i3m1i3mlusyjtry.R.iget(70160)==0&false)); ++i) {{
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70161);buf.append("abcdefghijklmn012345689ABCDEFG");
        }
        }__CLR4_5_21i3m1i3mlusyjtry.R.inc(70162);buf.append('\'');

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70163);String text = buf.toString();

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70164);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70165);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70166);lexer.nextToken();

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70167);Assert.assertEquals(0, lexer.pos());

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70168);String stringVal = lexer.stringVal();

        // Assert.assertEquals("\"\\\\\\/\\b\\f\\n\\r\\t\u4e2d\"",
        // JSON.toJSONString(stringVal));

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70169);JSON.toJSONString(stringVal);
    }finally{__CLR4_5_21i3m1i3mlusyjtry.R.flushNeeded();}}

    public void test_string4() throws Exception {__CLR4_5_21i3m1i3mlusyjtry.R.globalSliceStart(getClass().getName(),70170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tedel91i56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i3m1i3mlusyjtry.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i3m1i3mlusyjtry.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_string4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70170,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tedel91i56() throws Exception{try{__CLR4_5_21i3m1i3mlusyjtry.R.inc(70170);
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70171);StringBuilder buf = new StringBuilder();

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70172);buf.append('\'');
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70173);for (int i = 0; (((i < 200)&&(__CLR4_5_21i3m1i3mlusyjtry.R.iget(70174)!=0|true))||(__CLR4_5_21i3m1i3mlusyjtry.R.iget(70175)==0&false)); ++i) {{
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70176);buf.append("\\tabcdefghijklmn012345689ABCDEFG");
        }
        }__CLR4_5_21i3m1i3mlusyjtry.R.inc(70177);buf.append('\'');

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70178);String text = buf.toString();

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70179);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70180);lexer.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70181);lexer.nextToken();

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70182);Assert.assertEquals(0, lexer.pos());

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70183);String stringVal = lexer.stringVal();

        // Assert.assertEquals("\"\\\\\\/\\b\\f\\n\\r\\t\u4e2d\"",
        // JSON.toJSONString(stringVal));

        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70184);JSON.toJSONString(stringVal);
    }finally{__CLR4_5_21i3m1i3mlusyjtry.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21i3m1i3mlusyjtry.R.globalSliceStart(getClass().getName(),70185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1i5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i3m1i3mlusyjtry.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i3m1i3mlusyjtry.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70185,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1i5l() throws Exception{try{__CLR4_5_21i3m1i3mlusyjtry.R.inc(70185);
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70186);Exception error = null;
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70187);try {
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70188);JSONScanner lexer = new JSONScanner("'k");
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70189);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70190);lexer.nextToken();
        } catch (JSONException ex) {
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70191);error = ex;
        }
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70192);Assert.assertNotNull(error);
    }finally{__CLR4_5_21i3m1i3mlusyjtry.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21i3m1i3mlusyjtry.R.globalSliceStart(getClass().getName(),70193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1i5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i3m1i3mlusyjtry.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i3m1i3mlusyjtry.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_singQuoteString.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70193,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1i5t() throws Exception{try{__CLR4_5_21i3m1i3mlusyjtry.R.inc(70193);
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70194);Exception error = null;
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70195);try {
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70196);JSONScanner lexer = new JSONScanner("'k\\k'");
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70197);lexer.config(Feature.AllowSingleQuotes, true);
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70198);lexer.nextToken();
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70199);Assert.assertEquals(JSONToken.ERROR, lexer.token());
        } catch (JSONException ex) {
            __CLR4_5_21i3m1i3mlusyjtry.R.inc(70200);error = ex;
        }
        __CLR4_5_21i3m1i3mlusyjtry.R.inc(70201);Assert.assertNotNull(error);
    }finally{__CLR4_5_21i3m1i3mlusyjtry.R.flushNeeded();}}
}
