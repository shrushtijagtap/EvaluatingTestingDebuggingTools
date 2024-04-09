/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.math.BigDecimal;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

public class DefaultExtJSONParserTest_3 extends TestCase {static class __CLR4_5_21gqm1gqmlusvncij{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,68421,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21gqm1gqmlusvncij.R.globalSliceStart(getClass().getName(),68350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21gqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gqm1gqmlusvncij.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gqm1gqmlusvncij.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68350,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21gqm() throws Exception{try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68350);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68351);DefaultJSONParser parser = new DefaultJSONParser("{v1:3}");
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68352);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68353);A a = parser.parseObject(A.class);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68354);Assert.assertEquals(3, a.getV1());
    }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21gqm1gqmlusvncij.R.globalSliceStart(getClass().getName(),68355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1gqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gqm1gqmlusvncij.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gqm1gqmlusvncij.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68355,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1gqr() throws Exception{try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68355);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68356);DefaultJSONParser parser = new DefaultJSONParser("{v1:'3'}");
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68357);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68358);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68359);A a = parser.parseObject(A.class);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68360);Assert.assertEquals(3, a.getV1());
    }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21gqm1gqmlusvncij.R.globalSliceStart(getClass().getName(),68361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441gqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gqm1gqmlusvncij.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gqm1gqmlusvncij.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68361,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441gqx() throws Exception{try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68361);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68362);DefaultJSONParser parser = new DefaultJSONParser("{v1:\"3\"}");
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68363);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68364);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68365);A a = parser.parseObject(A.class);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68366);Assert.assertEquals(3, a.getV1());
    }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21gqm1gqmlusvncij.R.globalSliceStart(getClass().getName(),68367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1gr3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gqm1gqmlusvncij.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gqm1gqmlusvncij.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68367,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1gr3() throws Exception{try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68367);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68368);DefaultJSONParser parser = new DefaultJSONParser("{o1:{}}");
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68369);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68370);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68371);A a = parser.parseObject(A.class);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68372);Assert.assertEquals(true, a.getO1() != null);
    }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21gqm1gqmlusvncij.R.globalSliceStart(getClass().getName(),68373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61gr9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gqm1gqmlusvncij.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gqm1gqmlusvncij.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68373,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61gr9() throws Exception{try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68373);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68374);DefaultJSONParser parser = new DefaultJSONParser("{v5:'3'}");
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68375);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68376);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68377);A a = parser.parseObject(A.class);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68378);Assert.assertEquals(3L, a.getV5().longValue());
    }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21gqm1gqmlusvncij.R.globalSliceStart(getClass().getName(),68379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1grf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gqm1gqmlusvncij.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gqm1gqmlusvncij.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68379,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1grf() throws Exception{try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68379);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68380);DefaultJSONParser parser = new DefaultJSONParser("{v5:\"3\"}");
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68381);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68382);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68383);A a = parser.parseObject(A.class);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68384);Assert.assertEquals(3L, a.getV5().longValue());
    }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21gqm1gqmlusvncij.R.globalSliceStart(getClass().getName(),68385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81grl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gqm1gqmlusvncij.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gqm1gqmlusvncij.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68385,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81grl() throws Exception{try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68385);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68386);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68387);features = Feature.config(features, Feature.AllowSingleQuotes, true);

        __CLR4_5_21gqm1gqmlusvncij.R.inc(68388);Assert.assertEquals(true, Feature.isEnabled(features, Feature.AllowSingleQuotes));

        __CLR4_5_21gqm1gqmlusvncij.R.inc(68389);DefaultJSONParser parser = new DefaultJSONParser("'abc'", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21gqm1gqmlusvncij.R.inc(68390);Assert.assertEquals("abc", parser.parse());
    }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21gqm1gqmlusvncij.R.globalSliceStart(getClass().getName(),68391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1grr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gqm1gqmlusvncij.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gqm1gqmlusvncij.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68391,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1grr() throws Exception{try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68391);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68392);DefaultJSONParser parser = new DefaultJSONParser("123");

        __CLR4_5_21gqm1gqmlusvncij.R.inc(68393);ParserConfig mapping = new ParserConfig();
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68394);parser.setConfig(mapping);
        __CLR4_5_21gqm1gqmlusvncij.R.inc(68395);Assert.assertEquals(mapping, parser.getConfig());
    }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

    public static class A {

        private int        v1;
        private String     v2;
        private boolean    v3;
        private BigDecimal v4;
        private Long       v5;

        private B          o1;

        public A(){try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68396);

        }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

        public Long getV5() {try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68397);
            __CLR4_5_21gqm1gqmlusvncij.R.inc(68398);return v5;
        }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

        public void setV5(Long v5) {try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68399);
            __CLR4_5_21gqm1gqmlusvncij.R.inc(68400);this.v5 = v5;
        }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

        public B getO1() {try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68401);
            __CLR4_5_21gqm1gqmlusvncij.R.inc(68402);return o1;
        }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

        public void setO1(B o1) {try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68403);
            __CLR4_5_21gqm1gqmlusvncij.R.inc(68404);this.o1 = o1;
        }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

        public int getV1() {try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68405);
            __CLR4_5_21gqm1gqmlusvncij.R.inc(68406);return v1;
        }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

        public void setV1(int v1) {try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68407);
            __CLR4_5_21gqm1gqmlusvncij.R.inc(68408);this.v1 = v1;
        }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

        public String getV2() {try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68409);
            __CLR4_5_21gqm1gqmlusvncij.R.inc(68410);return v2;
        }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

        public void setV2(String v2) {try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68411);
            __CLR4_5_21gqm1gqmlusvncij.R.inc(68412);this.v2 = v2;
        }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

        public boolean isV3() {try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68413);
            __CLR4_5_21gqm1gqmlusvncij.R.inc(68414);return v3;
        }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

        public void setV3(boolean v3) {try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68415);
            __CLR4_5_21gqm1gqmlusvncij.R.inc(68416);this.v3 = v3;
        }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

        public BigDecimal getV4() {try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68417);
            __CLR4_5_21gqm1gqmlusvncij.R.inc(68418);return v4;
        }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

        public void setV4(BigDecimal v4) {try{__CLR4_5_21gqm1gqmlusvncij.R.inc(68419);
            __CLR4_5_21gqm1gqmlusvncij.R.inc(68420);this.v4 = v4;
        }finally{__CLR4_5_21gqm1gqmlusvncij.R.flushNeeded();}}

    }

    public static class B {

    }
}
