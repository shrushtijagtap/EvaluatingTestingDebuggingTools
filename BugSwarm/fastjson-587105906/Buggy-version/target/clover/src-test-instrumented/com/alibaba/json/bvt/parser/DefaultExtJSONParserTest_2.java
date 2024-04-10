/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.User;

public class DefaultExtJSONParserTest_2 extends TestCase {static class __CLR4_1_101gol1golluszwcbb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,68361,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101gol1golluszwcbb.R.globalSliceStart(getClass().getName(),68277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21gol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gol1golluszwcbb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gol1golluszwcbb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68277,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21gol() throws Exception{try{__CLR4_1_101gol1golluszwcbb.R.inc(68277);
        __CLR4_1_101gol1golluszwcbb.R.inc(68278);DefaultJSONParser parser = new DefaultJSONParser("{'a':3}");
        __CLR4_1_101gol1golluszwcbb.R.inc(68279);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101gol1golluszwcbb.R.inc(68280);A a = parser.parseObject(A.class);
        __CLR4_1_101gol1golluszwcbb.R.inc(68281);Assert.assertEquals(3, a.getA());
    }finally{__CLR4_1_101gol1golluszwcbb.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101gol1golluszwcbb.R.globalSliceStart(getClass().getName(),68282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1goq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gol1golluszwcbb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gol1golluszwcbb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68282,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1goq() throws Exception{try{__CLR4_1_101gol1golluszwcbb.R.inc(68282);
        __CLR4_1_101gol1golluszwcbb.R.inc(68283);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_1_101gol1golluszwcbb.R.inc(68284);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101gol1golluszwcbb.R.inc(68285);A a = parser.parseObject(A.class);
        __CLR4_1_101gol1golluszwcbb.R.inc(68286);Assert.assertEquals(3, a.getA());
    }finally{__CLR4_1_101gol1golluszwcbb.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101gol1golluszwcbb.R.globalSliceStart(getClass().getName(),68287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441gov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gol1golluszwcbb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gol1golluszwcbb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68287,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441gov() throws Exception{try{__CLR4_1_101gol1golluszwcbb.R.inc(68287);
        __CLR4_1_101gol1golluszwcbb.R.inc(68288);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_1_101gol1golluszwcbb.R.inc(68289);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101gol1golluszwcbb.R.inc(68290);Map a = parser.parseObject(Map.class);
        __CLR4_1_101gol1golluszwcbb.R.inc(68291);Assert.assertEquals(3, a.get("a"));
    }finally{__CLR4_1_101gol1golluszwcbb.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101gol1golluszwcbb.R.globalSliceStart(getClass().getName(),68292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1gp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gol1golluszwcbb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gol1golluszwcbb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68292,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1gp0() throws Exception{try{__CLR4_1_101gol1golluszwcbb.R.inc(68292);
        __CLR4_1_101gol1golluszwcbb.R.inc(68293);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_1_101gol1golluszwcbb.R.inc(68294);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101gol1golluszwcbb.R.inc(68295);HashMap a = parser.parseObject(HashMap.class);
        __CLR4_1_101gol1golluszwcbb.R.inc(68296);Assert.assertEquals(3, a.get("a"));
    }finally{__CLR4_1_101gol1golluszwcbb.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101gol1golluszwcbb.R.globalSliceStart(getClass().getName(),68297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61gp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gol1golluszwcbb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gol1golluszwcbb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68297,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61gp5() throws Exception{try{__CLR4_1_101gol1golluszwcbb.R.inc(68297);
        __CLR4_1_101gol1golluszwcbb.R.inc(68298);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_1_101gol1golluszwcbb.R.inc(68299);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101gol1golluszwcbb.R.inc(68300);LinkedHashMap a = parser.parseObject(LinkedHashMap.class);
        __CLR4_1_101gol1golluszwcbb.R.inc(68301);Assert.assertEquals(3, a.get("a"));
    }finally{__CLR4_1_101gol1golluszwcbb.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_1_101gol1golluszwcbb.R.globalSliceStart(getClass().getName(),68302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1gpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gol1golluszwcbb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gol1golluszwcbb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68302,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1gpa() throws Exception{try{__CLR4_1_101gol1golluszwcbb.R.inc(68302);
        __CLR4_1_101gol1golluszwcbb.R.inc(68303);Exception error = null;
        __CLR4_1_101gol1golluszwcbb.R.inc(68304);try {
            __CLR4_1_101gol1golluszwcbb.R.inc(68305);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123]";
            __CLR4_1_101gol1golluszwcbb.R.inc(68306);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101gol1golluszwcbb.R.inc(68307);parser.parseArray(User.class);
        } catch (Exception ex) {
            __CLR4_1_101gol1golluszwcbb.R.inc(68308);error = ex;
        }
        __CLR4_1_101gol1golluszwcbb.R.inc(68309);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gol1golluszwcbb.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101gol1golluszwcbb.R.globalSliceStart(getClass().getName(),68310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1gpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gol1golluszwcbb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gol1golluszwcbb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68310,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1gpi() throws Exception{try{__CLR4_1_101gol1golluszwcbb.R.inc(68310);
        __CLR4_1_101gol1golluszwcbb.R.inc(68311);JSONException error = null;
        __CLR4_1_101gol1golluszwcbb.R.inc(68312);try {
            __CLR4_1_101gol1golluszwcbb.R.inc(68313);DefaultJSONParser parser = new DefaultJSONParser("{'a'3}");
            __CLR4_1_101gol1golluszwcbb.R.inc(68314);parser.config(Feature.AllowSingleQuotes, true);
            __CLR4_1_101gol1golluszwcbb.R.inc(68315);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_1_101gol1golluszwcbb.R.inc(68316);error = e;
        }
        __CLR4_1_101gol1golluszwcbb.R.inc(68317);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gol1golluszwcbb.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101gol1golluszwcbb.R.globalSliceStart(getClass().getName(),68318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1gpq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gol1golluszwcbb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gol1golluszwcbb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68318,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1gpq() throws Exception{try{__CLR4_1_101gol1golluszwcbb.R.inc(68318);
        __CLR4_1_101gol1golluszwcbb.R.inc(68319);JSONException error = null;
        __CLR4_1_101gol1golluszwcbb.R.inc(68320);try {
            __CLR4_1_101gol1golluszwcbb.R.inc(68321);DefaultJSONParser parser = new DefaultJSONParser("{a 3}");
            __CLR4_1_101gol1golluszwcbb.R.inc(68322);parser.config(Feature.AllowUnQuotedFieldNames, true);
            __CLR4_1_101gol1golluszwcbb.R.inc(68323);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_1_101gol1golluszwcbb.R.inc(68324);error = e;
        }
        __CLR4_1_101gol1golluszwcbb.R.inc(68325);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gol1golluszwcbb.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101gol1golluszwcbb.R.globalSliceStart(getClass().getName(),68326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1gpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gol1golluszwcbb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gol1golluszwcbb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68326,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1gpy() throws Exception{try{__CLR4_1_101gol1golluszwcbb.R.inc(68326);
        __CLR4_1_101gol1golluszwcbb.R.inc(68327);JSONException error = null;
        __CLR4_1_101gol1golluszwcbb.R.inc(68328);try {
            __CLR4_1_101gol1golluszwcbb.R.inc(68329);DefaultJSONParser parser = new DefaultJSONParser("{");
            __CLR4_1_101gol1golluszwcbb.R.inc(68330);parser.config(Feature.AllowUnQuotedFieldNames, true);
            __CLR4_1_101gol1golluszwcbb.R.inc(68331);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_1_101gol1golluszwcbb.R.inc(68332);error = e;
        }
        __CLR4_1_101gol1golluszwcbb.R.inc(68333);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gol1golluszwcbb.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101gol1golluszwcbb.R.globalSliceStart(getClass().getName(),68334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1gq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gol1golluszwcbb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gol1golluszwcbb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68334,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1gq6() throws Exception{try{__CLR4_1_101gol1golluszwcbb.R.inc(68334);
        __CLR4_1_101gol1golluszwcbb.R.inc(68335);JSONException error = null;
        __CLR4_1_101gol1golluszwcbb.R.inc(68336);try {
            __CLR4_1_101gol1golluszwcbb.R.inc(68337);DefaultJSONParser parser = new DefaultJSONParser("{\"a\"3}");
            __CLR4_1_101gol1golluszwcbb.R.inc(68338);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_1_101gol1golluszwcbb.R.inc(68339);error = e;
        }
        __CLR4_1_101gol1golluszwcbb.R.inc(68340);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gol1golluszwcbb.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_1_101gol1golluszwcbb.R.globalSliceStart(getClass().getName(),68341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81gqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gol1golluszwcbb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gol1golluszwcbb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68341,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81gqd() throws Exception{try{__CLR4_1_101gol1golluszwcbb.R.inc(68341);
        __CLR4_1_101gol1golluszwcbb.R.inc(68342);JSONException error = null;
        __CLR4_1_101gol1golluszwcbb.R.inc(68343);try {
            __CLR4_1_101gol1golluszwcbb.R.inc(68344);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
            __CLR4_1_101gol1golluszwcbb.R.inc(68345);parser.config(Feature.AllowUnQuotedFieldNames, false);
            __CLR4_1_101gol1golluszwcbb.R.inc(68346);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_1_101gol1golluszwcbb.R.inc(68347);error = e;
        }
        __CLR4_1_101gol1golluszwcbb.R.inc(68348);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gol1golluszwcbb.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_1_101gol1golluszwcbb.R.globalSliceStart(getClass().getName(),68349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaop1gql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gol1golluszwcbb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gol1golluszwcbb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68349,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaop1gql() throws Exception{try{__CLR4_1_101gol1golluszwcbb.R.inc(68349);
        __CLR4_1_101gol1golluszwcbb.R.inc(68350);JSONException error = null;
        __CLR4_1_101gol1golluszwcbb.R.inc(68351);try {
            __CLR4_1_101gol1golluszwcbb.R.inc(68352);DefaultJSONParser parser = new DefaultJSONParser("{'a':3}");
            __CLR4_1_101gol1golluszwcbb.R.inc(68353);parser.config(Feature.AllowSingleQuotes, false);
            __CLR4_1_101gol1golluszwcbb.R.inc(68354);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_1_101gol1golluszwcbb.R.inc(68355);error = e;
        }
        __CLR4_1_101gol1golluszwcbb.R.inc(68356);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gol1golluszwcbb.R.flushNeeded();}}

    public static class A {

        private int a;

        public int getA() {try{__CLR4_1_101gol1golluszwcbb.R.inc(68357);
            __CLR4_1_101gol1golluszwcbb.R.inc(68358);return a;
        }finally{__CLR4_1_101gol1golluszwcbb.R.flushNeeded();}}

        public void setA(int a) {try{__CLR4_1_101gol1golluszwcbb.R.inc(68359);
            __CLR4_1_101gol1golluszwcbb.R.inc(68360);this.a = a;
        }finally{__CLR4_1_101gol1golluszwcbb.R.flushNeeded();}}

    }

}
