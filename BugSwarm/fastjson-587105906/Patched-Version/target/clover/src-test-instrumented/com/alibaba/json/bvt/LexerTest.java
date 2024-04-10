/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
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

public class LexerTest extends TestCase {static class __CLR4_5_2ym5ym5lusyjq36{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,45050,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_float() throws Exception {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),44861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t1l4buym5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_float",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44861,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t1l4buym5() throws Exception{try{__CLR4_5_2ym5ym5lusyjq36.R.inc(44861);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44862);String text = "123456789.0123";
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44863);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44864);lexer.nextToken();
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44865);BigDecimal decimalValue = lexer.decimalValue();
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44866);Assert.assertEquals(new BigDecimal("123456789.0123"), decimalValue);

    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void test_string() throws Exception {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),44867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d3tq79ymb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_string",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44867,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d3tq79ymb() throws Exception{try{__CLR4_5_2ym5ym5lusyjq36.R.inc(44867);
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44868);JSONScanner lexer = new JSONScanner("\"\u4e2d\u56fd\"");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44869);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44870);Assert.assertEquals("\u4e2d\u56fd", lexer.stringVal());
        }
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44871);JSONScanner lexer = new JSONScanner("\"\u4e2d\u56fd\t\"");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44872);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44873);Assert.assertEquals("\u4e2d\u56fd\t", lexer.stringVal());
        }
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44874);JSONScanner lexer = new JSONScanner("\"\u4e2d\u56fd\tV5\"");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44875);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44876);Assert.assertEquals("\u4e2d\u56fd\tV5", lexer.stringVal());
        }

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44877);StringBuilder buf = new StringBuilder();

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44878);buf.append('"');
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44879);buf.append("\\\\\\/\\b\\f\\n\\r\\t\\u" + Integer.toHexString('\u4e2d'));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44880);buf.append('"');
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44881);buf.append('\u2001');

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44882);String text = buf.toString();

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44883);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length() - 1);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44884);lexer.nextToken();

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44885);Assert.assertEquals(0, lexer.pos());

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44886);String stringVal = lexer.stringVal();

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44887);Assert.assertEquals("\"\\\\/\\b\\f\\n\\r\\t\u4e2d\"", JSON.toJSONString(stringVal));

    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void test_string2() throws Exception {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),44888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mwdh0bymw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_string2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44888,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mwdh0bymw() throws Exception{try{__CLR4_5_2ym5ym5lusyjq36.R.inc(44888);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44889);StringBuilder buf = new StringBuilder();

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44890);buf.append('"');
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44891);for (int i = 0; (((i < 200)&&(__CLR4_5_2ym5ym5lusyjq36.R.iget(44892)!=0|true))||(__CLR4_5_2ym5ym5lusyjq36.R.iget(44893)==0&false)); ++i) {{
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44894);buf.append("\\\\\\/\\b\\f\\n\\r\\t\\u" + Integer.toHexString('\u4e2d'));
        }
        }__CLR4_5_2ym5ym5lusyjq36.R.inc(44895);buf.append('"');

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44896);String text = buf.toString();

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44897);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44898);lexer.nextToken();

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44899);Assert.assertEquals(0, lexer.pos());

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44900);lexer.stringVal();

    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void test_string3() throws Exception {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),44901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q5dfssyn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_string3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q5dfssyn9() throws Exception{try{__CLR4_5_2ym5ym5lusyjq36.R.inc(44901);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44902);StringBuilder buf = new StringBuilder();

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44903);buf.append('"');
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44904);for (int i = 0; (((i < 200)&&(__CLR4_5_2ym5ym5lusyjq36.R.iget(44905)!=0|true))||(__CLR4_5_2ym5ym5lusyjq36.R.iget(44906)==0&false)); ++i) {{
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44907);buf.append("abcdefghijklmn012345689ABCDEFG");
        }
        }__CLR4_5_2ym5ym5lusyjq36.R.inc(44908);buf.append('"');

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44909);String text = buf.toString();

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44910);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44911);lexer.nextToken();

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44912);Assert.assertEquals(0, lexer.pos());

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44913);lexer.stringVal();
    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void test_string4() throws Exception {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),44914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tedel9ynm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_string4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44914,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tedel9ynm() throws Exception{try{__CLR4_5_2ym5ym5lusyjq36.R.inc(44914);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44915);StringBuilder buf = new StringBuilder();

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44916);buf.append('"');
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44917);for (int i = 0; (((i < 200)&&(__CLR4_5_2ym5ym5lusyjq36.R.iget(44918)!=0|true))||(__CLR4_5_2ym5ym5lusyjq36.R.iget(44919)==0&false)); ++i) {{
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44920);buf.append("\\tabcdefghijklmn012345689ABCDEFG");
        }
        }__CLR4_5_2ym5ym5lusyjq36.R.inc(44921);buf.append('"');

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44922);String text = buf.toString();

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44923);JSONScanner lexer = new JSONScanner(text.toCharArray(), text.length());
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44924);lexer.nextToken();

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44925);Assert.assertEquals(0, lexer.pos());

        __CLR4_5_2ym5ym5lusyjq36.R.inc(44926);lexer.stringVal();

        // Assert.assertEquals("\"\\\\\\/\\b\\f\\n\\r\\t\u4e2d\"",
        // JSON.toJSONString(stringVal));

    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),44927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1ch21ynz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44927,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1ch21ynz() throws Exception{try{__CLR4_5_2ym5ym5lusyjq36.R.inc(44927);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44928);JSONScanner lexer = new JSONScanner("".toCharArray(), 0);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44929);lexer.nextToken();
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44930);Assert.assertEquals(JSONToken.EOF, lexer.token());
    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void test_isWhitespace() throws Exception {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),44931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23hgj2zyo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_isWhitespace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44931,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23hgj2zyo3() throws Exception{try{__CLR4_5_2ym5ym5lusyjq36.R.inc(44931);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44932);new JSONScanner("".toCharArray(), 0);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44933);Assert.assertTrue(JSONScanner.isWhitespace(' '));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44934);Assert.assertTrue(JSONScanner.isWhitespace('\b'));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44935);Assert.assertTrue(JSONScanner.isWhitespace('\f'));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44936);Assert.assertTrue(JSONScanner.isWhitespace('\n'));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44937);Assert.assertTrue(JSONScanner.isWhitespace('\r'));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44938);Assert.assertTrue(JSONScanner.isWhitespace('\t'));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44939);Assert.assertFalse(JSONScanner.isWhitespace('k'));
    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),44940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1ayoc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44940,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1ayoc() throws Exception{try{__CLR4_5_2ym5ym5lusyjq36.R.inc(44940);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44941);JSONScanner lexer = new JSONScanner("k");
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44942);lexer.nextToken();
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44943);Assert.assertEquals(JSONToken.ERROR, lexer.token());
    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void test_error1() throws Exception {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),44944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_284g0lfyog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_error1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_284g0lfyog() throws Exception{try{__CLR4_5_2ym5ym5lusyjq36.R.inc(44944);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44945);Exception error = null;
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44946);try {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44947);JSONScanner lexer = new JSONScanner("\"\\k\"");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44948);lexer.nextToken();
        } catch (Exception ex) {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44949);error = ex;
        }
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44950);Assert.assertNotNull(error);
    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void f_test_ident() throws Exception {try{__CLR4_5_2ym5ym5lusyjq36.R.inc(44951);
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44952);JSONScanner lexer = new JSONScanner("ttue");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44953);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44954);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44955);JSONScanner lexer = new JSONScanner("tree");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44956);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44957);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44958);JSONScanner lexer = new JSONScanner("truu");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44959);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44960);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44961);JSONScanner lexer = new JSONScanner("fflse");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44962);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44963);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44964);JSONScanner lexer = new JSONScanner("nalse");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44965);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44966);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44967);JSONScanner lexer = new JSONScanner("faase");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44968);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44969);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44970);JSONScanner lexer = new JSONScanner("falle");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44971);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44972);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44973);JSONScanner lexer = new JSONScanner("falss");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44974);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44975);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44976);JSONScanner lexer = new JSONScanner("nnll");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44977);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44978);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44979);JSONScanner lexer = new JSONScanner("nuul");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44980);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44981);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44982);JSONScanner lexer = new JSONScanner("nulk");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44983);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44984);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
        {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44985);StringBuilder buf = new StringBuilder();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44986);buf.append('n');
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44987);for (char ch = 'A'; (((ch <= 'Z')&&(__CLR4_5_2ym5ym5lusyjq36.R.iget(44988)!=0|true))||(__CLR4_5_2ym5ym5lusyjq36.R.iget(44989)==0&false)); ++ch) {{
                __CLR4_5_2ym5ym5lusyjq36.R.inc(44990);buf.append(ch);
            }
            }__CLR4_5_2ym5ym5lusyjq36.R.inc(44991);for (char ch = 'a'; (((ch <= 'z')&&(__CLR4_5_2ym5ym5lusyjq36.R.iget(44992)!=0|true))||(__CLR4_5_2ym5ym5lusyjq36.R.iget(44993)==0&false)); ++ch) {{
                __CLR4_5_2ym5ym5lusyjq36.R.inc(44994);buf.append(ch);
            }
            }__CLR4_5_2ym5ym5lusyjq36.R.inc(44995);JSONScanner lexer = new JSONScanner(buf.toString());
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44996);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(44997);Assert.assertEquals(JSONToken.IDENTIFIER, lexer.token());
        }
    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void test_number() throws Exception {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),44998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nvgwdfypy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_number",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44998,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nvgwdfypy() throws Exception{try{__CLR4_5_2ym5ym5lusyjq36.R.inc(44998);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(44999);String text = "[0,1,-1,2E3,2E+3,2E-3,2e3,2e+3,2e-3]";
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45000);JSONArray array = JSON.parseArray(text);

        __CLR4_5_2ym5ym5lusyjq36.R.inc(45001);Assert.assertEquals(0, array.get(0));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45002);Assert.assertEquals(1, array.get(1));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45003);Assert.assertEquals(-1, array.get(2));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45004);Assert.assertEquals(new BigDecimal("2E3"), array.get(3));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45005);Assert.assertEquals(new BigDecimal("2E3"), array.get(4));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45006);Assert.assertEquals(new BigDecimal("2E-3"), array.get(5));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45007);Assert.assertEquals(new BigDecimal("2E3"), array.get(6));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45008);Assert.assertEquals(new BigDecimal("2E3"), array.get(7));
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45009);Assert.assertEquals(new BigDecimal("2E-3"), array.get(8));

        __CLR4_5_2ym5ym5lusyjq36.R.inc(45010);for (long i = Long.MIN_VALUE; (((i <= Long.MIN_VALUE + 1000 * 10)&&(__CLR4_5_2ym5ym5lusyjq36.R.iget(45011)!=0|true))||(__CLR4_5_2ym5ym5lusyjq36.R.iget(45012)==0&false)); ++i) {{
            __CLR4_5_2ym5ym5lusyjq36.R.inc(45013);Assert.assertEquals(i, JSON.parse(Long.toString(i)));
        }

        }__CLR4_5_2ym5ym5lusyjq36.R.inc(45014);for (long i = Long.MAX_VALUE - 1000 * 10; (((i <= Long.MAX_VALUE && i > 0)&&(__CLR4_5_2ym5ym5lusyjq36.R.iget(45015)!=0|true))||(__CLR4_5_2ym5ym5lusyjq36.R.iget(45016)==0&false)); ++i) {{
            __CLR4_5_2ym5ym5lusyjq36.R.inc(45017);Assert.assertEquals(i, JSON.parse(Long.toString(i)));
        }
    }}finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void test_big_integer_1() throws Exception {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),45018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b8fy2dyqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_big_integer_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45018,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b8fy2dyqi() throws Exception{try{__CLR4_5_2ym5ym5lusyjq36.R.inc(45018);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45019);String text = Long.MAX_VALUE + "1234";
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45020);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45021);lexer.nextToken();
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45022);Assert.assertEquals(new BigInteger(text), lexer.integerValue());
    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void test_big_integer_2() throws Exception {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),45023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27zfz9wyqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_big_integer_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45023,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27zfz9wyqn() throws Exception{try{__CLR4_5_2ym5ym5lusyjq36.R.inc(45023);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45024);String text = Long.MIN_VALUE + "1234";
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45025);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45026);lexer.nextToken();
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45027);Assert.assertEquals(new BigInteger(text), lexer.integerValue());
    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void test_big_integer_3() throws Exception {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),45028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24qg0hfyqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_big_integer_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45028,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24qg0hfyqs() throws Exception{try{__CLR4_5_2ym5ym5lusyjq36.R.inc(45028);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45029);String text = "9223372036854775809";
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45030);JSONScanner lexer = new JSONScanner(text);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45031);lexer.nextToken();
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45032);Assert.assertEquals(new BigInteger(text), lexer.integerValue());
    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void test_error2() {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),45033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24vg1syyqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_error2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45033,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24vg1syyqx(){try{__CLR4_5_2ym5ym5lusyjq36.R.inc(45033);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45034);Exception error = null;
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45035);try {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(45036);JSONScanner lexer = new JSONScanner("--");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(45037);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(45038);lexer.integerValue();
        } catch (Exception ex) {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(45039);error = ex;
        }
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45040);Assert.assertNotNull(error);
    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}

    public void test_error3() {__CLR4_5_2ym5ym5lusyjq36.R.globalSliceStart(getClass().getName(),45041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21mg30hyr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ym5ym5lusyjq36.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ym5ym5lusyjq36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LexerTest.test_error3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45041,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21mg30hyr5(){try{__CLR4_5_2ym5ym5lusyjq36.R.inc(45041);
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45042);Exception error = null;
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45043);try {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(45044);JSONScanner lexer = new JSONScanner("");
            __CLR4_5_2ym5ym5lusyjq36.R.inc(45045);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(45046);lexer.nextToken();
            __CLR4_5_2ym5ym5lusyjq36.R.inc(45047);lexer.integerValue();
        } catch (Exception ex) {
            __CLR4_5_2ym5ym5lusyjq36.R.inc(45048);error = ex;
        }
        __CLR4_5_2ym5ym5lusyjq36.R.inc(45049);Assert.assertNotNull(error);
    }finally{__CLR4_5_2ym5ym5lusyjq36.R.flushNeeded();}}
}
