/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
 * Copyright 1999-2017 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.json.bvt;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;

public class LexerTest extends TestCase {static class __CLR4_1_10ym9ym9lusqjyez{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,45054,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_float() throws Exception {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),44865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t1l4buym9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_float",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44865,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t1l4buym9() throws Exception{try{__CLR4_1_10ym9ym9lusqjyez.R.inc(44865);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44866);String text = "123456789.0123";
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44867);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44868);lexer.nextToken();
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44869);BigDecimal decimalValue = lexer.decimalValue();
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44870);Assert.assertEquals(new BigDecimal("123456789.0123"), decimalValue);

    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void test_string() throws Exception {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),44871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d3tq79ymf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_string",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44871,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d3tq79ymf() throws Exception{try{__CLR4_1_10ym9ym9lusqjyez.R.inc(44871);
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44872);JSONScanner lexer = new JSONScanner("\"\u4e2d\u56fd\"");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44873);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44874);Assert.assertEquals("\u4e2d\u56fd", lexer.stringVal());
        }
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44875);JSONScanner lexer = new JSONScanner("\"\u4e2d\u56fd\t\"");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44876);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44877);Assert.assertEquals("\u4e2d\u56fd\t", lexer.stringVal());
        }
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44878);JSONScanner lexer = new JSONScanner("\"\u4e2d\u56fd\tV5\"");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44879);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44880);Assert.assertEquals("\u4e2d\u56fd\tV5", lexer.stringVal());
        }

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44881);StringBuilder buf = new StringBuilder();

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44882);buf.append('"');
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44883);buf.append("\\\\\\/\\b\\f\\n\\r\\t\\u" + Integer.toHexString('\u4e2d'));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44884);buf.append('"');
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44885);buf.append('\u2001');

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44886);String text = buf.toString();

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44887);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length() - 1);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44888);lexer.nextToken();

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44889);Assert.assertEquals(0, lexer.pos());

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44890);String stringVal = lexer.stringVal();

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44891);Assert.assertEquals("\"\\\\/\\b\\f\\n\\r\\t\u4e2d\"", JSON.toJSONString(stringVal));

    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void test_string2() throws Exception {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),44892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mwdh0byn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_string2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44892,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mwdh0byn0() throws Exception{try{__CLR4_1_10ym9ym9lusqjyez.R.inc(44892);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44893);StringBuilder buf = new StringBuilder();

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44894);buf.append('"');
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44895);for (int i = 0; (((i < 200)&&(__CLR4_1_10ym9ym9lusqjyez.R.iget(44896)!=0|true))||(__CLR4_1_10ym9ym9lusqjyez.R.iget(44897)==0&false)); ++i) {{
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44898);buf.append("\\\\\\/\\b\\f\\n\\r\\t\\u" + Integer.toHexString('\u4e2d'));
        }
        }__CLR4_1_10ym9ym9lusqjyez.R.inc(44899);buf.append('"');

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44900);String text = buf.toString();

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44901);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44902);lexer.nextToken();

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44903);Assert.assertEquals(0, lexer.pos());

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44904);lexer.stringVal();

    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void test_string3() throws Exception {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),44905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10q5dfssynd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_string3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44905,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10q5dfssynd() throws Exception{try{__CLR4_1_10ym9ym9lusqjyez.R.inc(44905);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44906);StringBuilder buf = new StringBuilder();

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44907);buf.append('"');
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44908);for (int i = 0; (((i < 200)&&(__CLR4_1_10ym9ym9lusqjyez.R.iget(44909)!=0|true))||(__CLR4_1_10ym9ym9lusqjyez.R.iget(44910)==0&false)); ++i) {{
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44911);buf.append("abcdefghijklmn012345689ABCDEFG");
        }
        }__CLR4_1_10ym9ym9lusqjyez.R.inc(44912);buf.append('"');

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44913);String text = buf.toString();

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44914);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44915);lexer.nextToken();

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44916);Assert.assertEquals(0, lexer.pos());

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44917);lexer.stringVal();
    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void test_string4() throws Exception {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),44918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tedel9ynq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_string4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44918,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tedel9ynq() throws Exception{try{__CLR4_1_10ym9ym9lusqjyez.R.inc(44918);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44919);StringBuilder buf = new StringBuilder();

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44920);buf.append('"');
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44921);for (int i = 0; (((i < 200)&&(__CLR4_1_10ym9ym9lusqjyez.R.iget(44922)!=0|true))||(__CLR4_1_10ym9ym9lusqjyez.R.iget(44923)==0&false)); ++i) {{
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44924);buf.append("\\tabcdefghijklmn012345689ABCDEFG");
        }
        }__CLR4_1_10ym9ym9lusqjyez.R.inc(44925);buf.append('"');

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44926);String text = buf.toString();

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44927);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44928);lexer.nextToken();

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44929);Assert.assertEquals(0, lexer.pos());

        __CLR4_1_10ym9ym9lusqjyez.R.inc(44930);lexer.stringVal();

        // Assert.assertEquals("\"\\\\\\/\\b\\f\\n\\r\\t\u4e2d\"",
        // JSON.toJSONString(stringVal));

    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),44931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch21yo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44931,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch21yo3() throws Exception{try{__CLR4_1_10ym9ym9lusqjyez.R.inc(44931);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44932);JSONScanner lexer = new JSONScanner("".toCharArray(), 0);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44933);lexer.nextToken();
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44934);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void test_isWhitespace() throws Exception {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),44935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103hgj2zyo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_isWhitespace",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44935,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103hgj2zyo7() throws Exception{try{__CLR4_1_10ym9ym9lusqjyez.R.inc(44935);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44936);new JSONScanner("".toCharArray(), 0);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44937);Assert.assertTrue(JSONScanner.isWhitespace(' '));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44938);Assert.assertTrue(JSONScanner.isWhitespace('\b'));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44939);Assert.assertTrue(JSONScanner.isWhitespace('\f'));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44940);Assert.assertTrue(JSONScanner.isWhitespace('\n'));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44941);Assert.assertTrue(JSONScanner.isWhitespace('\r'));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44942);Assert.assertTrue(JSONScanner.isWhitespace('\t'));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44943);Assert.assertFalse(JSONScanner.isWhitespace('k'));
    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),44944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1ayog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44944,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1ayog() throws Exception{try{__CLR4_1_10ym9ym9lusqjyez.R.inc(44944);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44945);JSONScanner lexer = new JSONScanner("k");
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44946);lexer.nextToken();
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44947);Assert.assertEquals(JSONToken.ERROR, lexer.token());
    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void test_error1() throws Exception {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),44948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1084g0lfyok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_error1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44948,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1084g0lfyok() throws Exception{try{__CLR4_1_10ym9ym9lusqjyez.R.inc(44948);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44949);Exception error = null;
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44950);try {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44951);JSONScanner lexer = new JSONScanner("\"\\k\"");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44952);lexer.nextToken();
        } catch (Exception ex) {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44953);error = ex;
        }
        __CLR4_1_10ym9ym9lusqjyez.R.inc(44954);Assert.assertNotNull(error);
    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void f_test_ident() throws Exception {try{__CLR4_1_10ym9ym9lusqjyez.R.inc(44955);
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44956);JSONScanner lexer = new JSONScanner("ttue");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44957);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44958);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44959);JSONScanner lexer = new JSONScanner("tree");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44960);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44961);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44962);JSONScanner lexer = new JSONScanner("truu");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44963);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44964);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44965);JSONScanner lexer = new JSONScanner("fflse");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44966);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44967);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44968);JSONScanner lexer = new JSONScanner("nalse");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44969);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44970);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44971);JSONScanner lexer = new JSONScanner("faase");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44972);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44973);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44974);JSONScanner lexer = new JSONScanner("falle");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44975);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44976);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44977);JSONScanner lexer = new JSONScanner("falss");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44978);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44979);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44980);JSONScanner lexer = new JSONScanner("nnll");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44981);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44982);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44983);JSONScanner lexer = new JSONScanner("nuul");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44984);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44985);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44986);JSONScanner lexer = new JSONScanner("nulk");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44987);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44988);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44989);StringBuilder buf = new StringBuilder();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44990);buf.append('n');
            __CLR4_1_10ym9ym9lusqjyez.R.inc(44991);for (char ch = 'A'; (((ch <= 'Z')&&(__CLR4_1_10ym9ym9lusqjyez.R.iget(44992)!=0|true))||(__CLR4_1_10ym9ym9lusqjyez.R.iget(44993)==0&false)); ++ch) {{
                __CLR4_1_10ym9ym9lusqjyez.R.inc(44994);buf.append(ch);
            }
            }__CLR4_1_10ym9ym9lusqjyez.R.inc(44995);for (char ch = 'a'; (((ch <= 'z')&&(__CLR4_1_10ym9ym9lusqjyez.R.iget(44996)!=0|true))||(__CLR4_1_10ym9ym9lusqjyez.R.iget(44997)==0&false)); ++ch) {{
                __CLR4_1_10ym9ym9lusqjyez.R.inc(44998);buf.append(ch);
            }
            }__CLR4_1_10ym9ym9lusqjyez.R.inc(44999);JSONScanner lexer = new JSONScanner(buf.toString());
            __CLR4_1_10ym9ym9lusqjyez.R.inc(45000);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(45001);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void test_number() throws Exception {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),45002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nvgwdfyq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_number",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45002,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nvgwdfyq2() throws Exception{try{__CLR4_1_10ym9ym9lusqjyez.R.inc(45002);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45003);String text = "[0,1,-1,2E3,2E+3,2E-3,2e3,2e+3,2e-3]";
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45004);JSONArray array = JSON.parseArray(text);

        __CLR4_1_10ym9ym9lusqjyez.R.inc(45005);Assert.assertEquals(0, array.get(0));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45006);Assert.assertEquals(1, array.get(1));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45007);Assert.assertEquals(-1, array.get(2));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45008);Assert.assertEquals(new BigDecimal("2E3"), array.get(3));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45009);Assert.assertEquals(new BigDecimal("2E3"), array.get(4));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45010);Assert.assertEquals(new BigDecimal("2E-3"), array.get(5));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45011);Assert.assertEquals(new BigDecimal("2E3"), array.get(6));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45012);Assert.assertEquals(new BigDecimal("2E3"), array.get(7));
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45013);Assert.assertEquals(new BigDecimal("2E-3"), array.get(8));

        __CLR4_1_10ym9ym9lusqjyez.R.inc(45014);for (long i = Long.MIN_VALUE; (((i <= Long.MIN_VALUE + 1000 * 10)&&(__CLR4_1_10ym9ym9lusqjyez.R.iget(45015)!=0|true))||(__CLR4_1_10ym9ym9lusqjyez.R.iget(45016)==0&false)); ++i) {{
            __CLR4_1_10ym9ym9lusqjyez.R.inc(45017);Assert.assertEquals(i, JSON.parse(Long.toString(i)));
        }

        }__CLR4_1_10ym9ym9lusqjyez.R.inc(45018);for (long i = Long.MAX_VALUE - 1000 * 10; (((i <= Long.MAX_VALUE && i > 0)&&(__CLR4_1_10ym9ym9lusqjyez.R.iget(45019)!=0|true))||(__CLR4_1_10ym9ym9lusqjyez.R.iget(45020)==0&false)); ++i) {{
            __CLR4_1_10ym9ym9lusqjyez.R.inc(45021);Assert.assertEquals(i, JSON.parse(Long.toString(i)));
        }
    }}finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void test_big_integer_1() throws Exception {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),45022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10b8fy2dyqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_big_integer_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45022,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10b8fy2dyqm() throws Exception{try{__CLR4_1_10ym9ym9lusqjyez.R.inc(45022);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45023);String text = Long.MAX_VALUE + "1234";
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45024);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45025);lexer.nextToken();
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45026);Assert.assertEquals(new BigInteger(text), lexer.integerValue());
    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void test_big_integer_2() throws Exception {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),45027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107zfz9wyqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_big_integer_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45027,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107zfz9wyqr() throws Exception{try{__CLR4_1_10ym9ym9lusqjyez.R.inc(45027);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45028);String text = Long.MIN_VALUE + "1234";
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45029);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45030);lexer.nextToken();
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45031);Assert.assertEquals(new BigInteger(text), lexer.integerValue());
    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void test_big_integer_3() throws Exception {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),45032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104qg0hfyqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_big_integer_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45032,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104qg0hfyqw() throws Exception{try{__CLR4_1_10ym9ym9lusqjyez.R.inc(45032);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45033);String text = "9223372036854775809";
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45034);JSONScanner lexer = new JSONScanner(text);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45035);lexer.nextToken();
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45036);Assert.assertEquals(new BigInteger(text), lexer.integerValue());
    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void test_error2() {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),45037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104vg1syyr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_error2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45037,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104vg1syyr1(){try{__CLR4_1_10ym9ym9lusqjyez.R.inc(45037);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45038);Exception error = null;
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45039);try {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(45040);JSONScanner lexer = new JSONScanner("--");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(45041);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(45042);lexer.integerValue();
        } catch (Exception ex) {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(45043);error = ex;
        }
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45044);Assert.assertNotNull(error);
    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}

    public void test_error3() {__CLR4_1_10ym9ym9lusqjyez.R.globalSliceStart(getClass().getName(),45045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101mg30hyr9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ym9ym9lusqjyez.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ym9ym9lusqjyez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_error3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45045,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101mg30hyr9(){try{__CLR4_1_10ym9ym9lusqjyez.R.inc(45045);
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45046);Exception error = null;
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45047);try {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(45048);JSONScanner lexer = new JSONScanner("");
            __CLR4_1_10ym9ym9lusqjyez.R.inc(45049);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(45050);lexer.nextToken();
            __CLR4_1_10ym9ym9lusqjyez.R.inc(45051);lexer.integerValue();
        } catch (Exception ex) {
            __CLR4_1_10ym9ym9lusqjyez.R.inc(45052);error = ex;
        }
        __CLR4_1_10ym9ym9lusqjyez.R.inc(45053);Assert.assertNotNull(error);
    }finally{__CLR4_1_10ym9ym9lusqjyez.R.flushNeeded();}}
}
