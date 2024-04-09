/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.User;

public class DefaultExtJSONParserTest_2 extends TestCase {static class __CLR4_5_21goa1goalusvnchm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,68350,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21goa1goalusvnchm.R.globalSliceStart(getClass().getName(),68266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21goa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21goa1goalusvnchm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21goa1goalusvnchm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68266,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21goa() throws Exception{try{__CLR4_5_21goa1goalusvnchm.R.inc(68266);
        __CLR4_5_21goa1goalusvnchm.R.inc(68267);DefaultJSONParser parser = new DefaultJSONParser("{'a':3}");
        __CLR4_5_21goa1goalusvnchm.R.inc(68268);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21goa1goalusvnchm.R.inc(68269);A a = parser.parseObject(A.class);
        __CLR4_5_21goa1goalusvnchm.R.inc(68270);Assert.assertEquals(3, a.getA());
    }finally{__CLR4_5_21goa1goalusvnchm.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21goa1goalusvnchm.R.globalSliceStart(getClass().getName(),68271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1gof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21goa1goalusvnchm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21goa1goalusvnchm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68271,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1gof() throws Exception{try{__CLR4_5_21goa1goalusvnchm.R.inc(68271);
        __CLR4_5_21goa1goalusvnchm.R.inc(68272);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_5_21goa1goalusvnchm.R.inc(68273);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21goa1goalusvnchm.R.inc(68274);A a = parser.parseObject(A.class);
        __CLR4_5_21goa1goalusvnchm.R.inc(68275);Assert.assertEquals(3, a.getA());
    }finally{__CLR4_5_21goa1goalusvnchm.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21goa1goalusvnchm.R.globalSliceStart(getClass().getName(),68276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441gok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21goa1goalusvnchm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21goa1goalusvnchm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68276,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441gok() throws Exception{try{__CLR4_5_21goa1goalusvnchm.R.inc(68276);
        __CLR4_5_21goa1goalusvnchm.R.inc(68277);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_5_21goa1goalusvnchm.R.inc(68278);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21goa1goalusvnchm.R.inc(68279);Map a = parser.parseObject(Map.class);
        __CLR4_5_21goa1goalusvnchm.R.inc(68280);Assert.assertEquals(3, a.get("a"));
    }finally{__CLR4_5_21goa1goalusvnchm.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21goa1goalusvnchm.R.globalSliceStart(getClass().getName(),68281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1gop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21goa1goalusvnchm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21goa1goalusvnchm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68281,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1gop() throws Exception{try{__CLR4_5_21goa1goalusvnchm.R.inc(68281);
        __CLR4_5_21goa1goalusvnchm.R.inc(68282);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_5_21goa1goalusvnchm.R.inc(68283);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21goa1goalusvnchm.R.inc(68284);HashMap a = parser.parseObject(HashMap.class);
        __CLR4_5_21goa1goalusvnchm.R.inc(68285);Assert.assertEquals(3, a.get("a"));
    }finally{__CLR4_5_21goa1goalusvnchm.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21goa1goalusvnchm.R.globalSliceStart(getClass().getName(),68286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61gou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21goa1goalusvnchm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21goa1goalusvnchm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68286,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61gou() throws Exception{try{__CLR4_5_21goa1goalusvnchm.R.inc(68286);
        __CLR4_5_21goa1goalusvnchm.R.inc(68287);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_5_21goa1goalusvnchm.R.inc(68288);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21goa1goalusvnchm.R.inc(68289);LinkedHashMap a = parser.parseObject(LinkedHashMap.class);
        __CLR4_5_21goa1goalusvnchm.R.inc(68290);Assert.assertEquals(3, a.get("a"));
    }finally{__CLR4_5_21goa1goalusvnchm.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_5_21goa1goalusvnchm.R.globalSliceStart(getClass().getName(),68291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1goz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21goa1goalusvnchm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21goa1goalusvnchm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68291,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1goz() throws Exception{try{__CLR4_5_21goa1goalusvnchm.R.inc(68291);
        __CLR4_5_21goa1goalusvnchm.R.inc(68292);Exception error = null;
        __CLR4_5_21goa1goalusvnchm.R.inc(68293);try {
            __CLR4_5_21goa1goalusvnchm.R.inc(68294);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123]";
            __CLR4_5_21goa1goalusvnchm.R.inc(68295);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_5_21goa1goalusvnchm.R.inc(68296);parser.parseArray(User.class);
        } catch (Exception ex) {
            __CLR4_5_21goa1goalusvnchm.R.inc(68297);error = ex;
        }
        __CLR4_5_21goa1goalusvnchm.R.inc(68298);Assert.assertNotNull(error);
    }finally{__CLR4_5_21goa1goalusvnchm.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21goa1goalusvnchm.R.globalSliceStart(getClass().getName(),68299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1gp7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21goa1goalusvnchm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21goa1goalusvnchm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68299,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1gp7() throws Exception{try{__CLR4_5_21goa1goalusvnchm.R.inc(68299);
        __CLR4_5_21goa1goalusvnchm.R.inc(68300);JSONException error = null;
        __CLR4_5_21goa1goalusvnchm.R.inc(68301);try {
            __CLR4_5_21goa1goalusvnchm.R.inc(68302);DefaultJSONParser parser = new DefaultJSONParser("{'a'3}");
            __CLR4_5_21goa1goalusvnchm.R.inc(68303);parser.config(Feature.AllowSingleQuotes, true);
            __CLR4_5_21goa1goalusvnchm.R.inc(68304);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_5_21goa1goalusvnchm.R.inc(68305);error = e;
        }
        __CLR4_5_21goa1goalusvnchm.R.inc(68306);Assert.assertNotNull(error);
    }finally{__CLR4_5_21goa1goalusvnchm.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21goa1goalusvnchm.R.globalSliceStart(getClass().getName(),68307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1gpf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21goa1goalusvnchm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21goa1goalusvnchm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68307,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1gpf() throws Exception{try{__CLR4_5_21goa1goalusvnchm.R.inc(68307);
        __CLR4_5_21goa1goalusvnchm.R.inc(68308);JSONException error = null;
        __CLR4_5_21goa1goalusvnchm.R.inc(68309);try {
            __CLR4_5_21goa1goalusvnchm.R.inc(68310);DefaultJSONParser parser = new DefaultJSONParser("{a 3}");
            __CLR4_5_21goa1goalusvnchm.R.inc(68311);parser.config(Feature.AllowUnQuotedFieldNames, true);
            __CLR4_5_21goa1goalusvnchm.R.inc(68312);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_5_21goa1goalusvnchm.R.inc(68313);error = e;
        }
        __CLR4_5_21goa1goalusvnchm.R.inc(68314);Assert.assertNotNull(error);
    }finally{__CLR4_5_21goa1goalusvnchm.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21goa1goalusvnchm.R.globalSliceStart(getClass().getName(),68315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1gpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21goa1goalusvnchm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21goa1goalusvnchm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68315,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1gpn() throws Exception{try{__CLR4_5_21goa1goalusvnchm.R.inc(68315);
        __CLR4_5_21goa1goalusvnchm.R.inc(68316);JSONException error = null;
        __CLR4_5_21goa1goalusvnchm.R.inc(68317);try {
            __CLR4_5_21goa1goalusvnchm.R.inc(68318);DefaultJSONParser parser = new DefaultJSONParser("{");
            __CLR4_5_21goa1goalusvnchm.R.inc(68319);parser.config(Feature.AllowUnQuotedFieldNames, true);
            __CLR4_5_21goa1goalusvnchm.R.inc(68320);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_5_21goa1goalusvnchm.R.inc(68321);error = e;
        }
        __CLR4_5_21goa1goalusvnchm.R.inc(68322);Assert.assertNotNull(error);
    }finally{__CLR4_5_21goa1goalusvnchm.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_21goa1goalusvnchm.R.globalSliceStart(getClass().getName(),68323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1gpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21goa1goalusvnchm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21goa1goalusvnchm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68323,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1gpv() throws Exception{try{__CLR4_5_21goa1goalusvnchm.R.inc(68323);
        __CLR4_5_21goa1goalusvnchm.R.inc(68324);JSONException error = null;
        __CLR4_5_21goa1goalusvnchm.R.inc(68325);try {
            __CLR4_5_21goa1goalusvnchm.R.inc(68326);DefaultJSONParser parser = new DefaultJSONParser("{\"a\"3}");
            __CLR4_5_21goa1goalusvnchm.R.inc(68327);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_5_21goa1goalusvnchm.R.inc(68328);error = e;
        }
        __CLR4_5_21goa1goalusvnchm.R.inc(68329);Assert.assertNotNull(error);
    }finally{__CLR4_5_21goa1goalusvnchm.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_21goa1goalusvnchm.R.globalSliceStart(getClass().getName(),68330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81gq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21goa1goalusvnchm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21goa1goalusvnchm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68330,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81gq2() throws Exception{try{__CLR4_5_21goa1goalusvnchm.R.inc(68330);
        __CLR4_5_21goa1goalusvnchm.R.inc(68331);JSONException error = null;
        __CLR4_5_21goa1goalusvnchm.R.inc(68332);try {
            __CLR4_5_21goa1goalusvnchm.R.inc(68333);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
            __CLR4_5_21goa1goalusvnchm.R.inc(68334);parser.config(Feature.AllowUnQuotedFieldNames, false);
            __CLR4_5_21goa1goalusvnchm.R.inc(68335);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_5_21goa1goalusvnchm.R.inc(68336);error = e;
        }
        __CLR4_5_21goa1goalusvnchm.R.inc(68337);Assert.assertNotNull(error);
    }finally{__CLR4_5_21goa1goalusvnchm.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_5_21goa1goalusvnchm.R.globalSliceStart(getClass().getName(),68338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1gqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21goa1goalusvnchm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21goa1goalusvnchm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68338,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1gqa() throws Exception{try{__CLR4_5_21goa1goalusvnchm.R.inc(68338);
        __CLR4_5_21goa1goalusvnchm.R.inc(68339);JSONException error = null;
        __CLR4_5_21goa1goalusvnchm.R.inc(68340);try {
            __CLR4_5_21goa1goalusvnchm.R.inc(68341);DefaultJSONParser parser = new DefaultJSONParser("{'a':3}");
            __CLR4_5_21goa1goalusvnchm.R.inc(68342);parser.config(Feature.AllowSingleQuotes, false);
            __CLR4_5_21goa1goalusvnchm.R.inc(68343);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_5_21goa1goalusvnchm.R.inc(68344);error = e;
        }
        __CLR4_5_21goa1goalusvnchm.R.inc(68345);Assert.assertNotNull(error);
    }finally{__CLR4_5_21goa1goalusvnchm.R.flushNeeded();}}

    public static class A {

        private int a;

        public int getA() {try{__CLR4_5_21goa1goalusvnchm.R.inc(68346);
            __CLR4_5_21goa1goalusvnchm.R.inc(68347);return a;
        }finally{__CLR4_5_21goa1goalusvnchm.R.flushNeeded();}}

        public void setA(int a) {try{__CLR4_5_21goa1goalusvnchm.R.inc(68348);
            __CLR4_5_21goa1goalusvnchm.R.inc(68349);this.a = a;
        }finally{__CLR4_5_21goa1goalusvnchm.R.flushNeeded();}}

    }

}
