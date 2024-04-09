/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.math.BigDecimal;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

public class DefaultExtJSONParserTest_3 extends TestCase {static class __CLR4_1_101fsp1fsplusqkd1v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,67200,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceStart(getClass().getName(),67129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21fsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fsp1fsplusqkd1v.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67129,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21fsp() throws Exception{try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67129);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67130);DefaultJSONParser parser = new DefaultJSONParser("{v1:3}");
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67131);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67132);A a = parser.parseObject(A.class);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67133);Assert.assertEquals(3, a.getV1());
    }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceStart(getClass().getName(),67134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1fsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fsp1fsplusqkd1v.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67134,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1fsu() throws Exception{try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67134);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67135);DefaultJSONParser parser = new DefaultJSONParser("{v1:'3'}");
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67136);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67137);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67138);A a = parser.parseObject(A.class);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67139);Assert.assertEquals(3, a.getV1());
    }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceStart(getClass().getName(),67140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441ft0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fsp1fsplusqkd1v.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67140,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441ft0() throws Exception{try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67140);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67141);DefaultJSONParser parser = new DefaultJSONParser("{v1:\"3\"}");
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67142);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67143);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67144);A a = parser.parseObject(A.class);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67145);Assert.assertEquals(3, a.getV1());
    }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceStart(getClass().getName(),67146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1ft6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fsp1fsplusqkd1v.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67146,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1ft6() throws Exception{try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67146);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67147);DefaultJSONParser parser = new DefaultJSONParser("{o1:{}}");
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67148);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67149);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67150);A a = parser.parseObject(A.class);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67151);Assert.assertEquals(true, a.getO1() != null);
    }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceStart(getClass().getName(),67152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61ftc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fsp1fsplusqkd1v.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67152,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61ftc() throws Exception{try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67152);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67153);DefaultJSONParser parser = new DefaultJSONParser("{v5:'3'}");
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67154);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67155);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67156);A a = parser.parseObject(A.class);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67157);Assert.assertEquals(3L, a.getV5().longValue());
    }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceStart(getClass().getName(),67158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1fti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fsp1fsplusqkd1v.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67158,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1fti() throws Exception{try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67158);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67159);DefaultJSONParser parser = new DefaultJSONParser("{v5:\"3\"}");
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67160);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67161);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67162);A a = parser.parseObject(A.class);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67163);Assert.assertEquals(3L, a.getV5().longValue());
    }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceStart(getClass().getName(),67164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81fto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fsp1fsplusqkd1v.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67164,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81fto() throws Exception{try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67164);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67165);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67166);features = Feature.config(features, Feature.AllowSingleQuotes, true);

        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67167);Assert.assertEquals(true, Feature.isEnabled(features, Feature.AllowSingleQuotes));

        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67168);DefaultJSONParser parser = new DefaultJSONParser("'abc'", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67169);Assert.assertEquals("abc", parser.parse());
    }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceStart(getClass().getName(),67170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1ftu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fsp1fsplusqkd1v.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fsp1fsplusqkd1v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67170,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1ftu() throws Exception{try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67170);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67171);DefaultJSONParser parser = new DefaultJSONParser("123");

        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67172);ParserConfig mapping = new ParserConfig();
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67173);parser.setConfig(mapping);
        __CLR4_1_101fsp1fsplusqkd1v.R.inc(67174);Assert.assertEquals(mapping, parser.getConfig());
    }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

    public static class A {

        private int        v1;
        private String     v2;
        private boolean    v3;
        private BigDecimal v4;
        private Long       v5;

        private B          o1;

        public A(){try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67175);

        }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

        public Long getV5() {try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67176);
            __CLR4_1_101fsp1fsplusqkd1v.R.inc(67177);return v5;
        }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

        public void setV5(Long v5) {try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67178);
            __CLR4_1_101fsp1fsplusqkd1v.R.inc(67179);this.v5 = v5;
        }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

        public B getO1() {try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67180);
            __CLR4_1_101fsp1fsplusqkd1v.R.inc(67181);return o1;
        }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

        public void setO1(B o1) {try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67182);
            __CLR4_1_101fsp1fsplusqkd1v.R.inc(67183);this.o1 = o1;
        }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

        public int getV1() {try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67184);
            __CLR4_1_101fsp1fsplusqkd1v.R.inc(67185);return v1;
        }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

        public void setV1(int v1) {try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67186);
            __CLR4_1_101fsp1fsplusqkd1v.R.inc(67187);this.v1 = v1;
        }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

        public String getV2() {try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67188);
            __CLR4_1_101fsp1fsplusqkd1v.R.inc(67189);return v2;
        }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

        public void setV2(String v2) {try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67190);
            __CLR4_1_101fsp1fsplusqkd1v.R.inc(67191);this.v2 = v2;
        }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

        public boolean isV3() {try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67192);
            __CLR4_1_101fsp1fsplusqkd1v.R.inc(67193);return v3;
        }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

        public void setV3(boolean v3) {try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67194);
            __CLR4_1_101fsp1fsplusqkd1v.R.inc(67195);this.v3 = v3;
        }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

        public BigDecimal getV4() {try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67196);
            __CLR4_1_101fsp1fsplusqkd1v.R.inc(67197);return v4;
        }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

        public void setV4(BigDecimal v4) {try{__CLR4_1_101fsp1fsplusqkd1v.R.inc(67198);
            __CLR4_1_101fsp1fsplusqkd1v.R.inc(67199);this.v4 = v4;
        }finally{__CLR4_1_101fsp1fsplusqkd1v.R.flushNeeded();}}

    }

    public static class B {

    }
}
