/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.math.BigDecimal;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

public class DefaultExtJSONParserTest_3 extends TestCase {static class __CLR4_5_21fse1fselusyjtkw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,67189,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21fse1fselusyjtkw.R.globalSliceStart(getClass().getName(),67118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21fse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fse1fselusyjtkw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fse1fselusyjtkw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67118,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21fse() throws Exception{try{__CLR4_5_21fse1fselusyjtkw.R.inc(67118);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67119);DefaultJSONParser parser = new DefaultJSONParser("{v1:3}");
        __CLR4_5_21fse1fselusyjtkw.R.inc(67120);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67121);A a = parser.parseObject(A.class);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67122);Assert.assertEquals(3, a.getV1());
    }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21fse1fselusyjtkw.R.globalSliceStart(getClass().getName(),67123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1fsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fse1fselusyjtkw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fse1fselusyjtkw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67123,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1fsj() throws Exception{try{__CLR4_5_21fse1fselusyjtkw.R.inc(67123);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67124);DefaultJSONParser parser = new DefaultJSONParser("{v1:'3'}");
        __CLR4_5_21fse1fselusyjtkw.R.inc(67125);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67126);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67127);A a = parser.parseObject(A.class);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67128);Assert.assertEquals(3, a.getV1());
    }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21fse1fselusyjtkw.R.globalSliceStart(getClass().getName(),67129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441fsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fse1fselusyjtkw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fse1fselusyjtkw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67129,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441fsp() throws Exception{try{__CLR4_5_21fse1fselusyjtkw.R.inc(67129);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67130);DefaultJSONParser parser = new DefaultJSONParser("{v1:\"3\"}");
        __CLR4_5_21fse1fselusyjtkw.R.inc(67131);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67132);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67133);A a = parser.parseObject(A.class);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67134);Assert.assertEquals(3, a.getV1());
    }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21fse1fselusyjtkw.R.globalSliceStart(getClass().getName(),67135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1fsv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fse1fselusyjtkw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fse1fselusyjtkw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67135,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1fsv() throws Exception{try{__CLR4_5_21fse1fselusyjtkw.R.inc(67135);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67136);DefaultJSONParser parser = new DefaultJSONParser("{o1:{}}");
        __CLR4_5_21fse1fselusyjtkw.R.inc(67137);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67138);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67139);A a = parser.parseObject(A.class);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67140);Assert.assertEquals(true, a.getO1() != null);
    }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21fse1fselusyjtkw.R.globalSliceStart(getClass().getName(),67141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61ft1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fse1fselusyjtkw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fse1fselusyjtkw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67141,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61ft1() throws Exception{try{__CLR4_5_21fse1fselusyjtkw.R.inc(67141);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67142);DefaultJSONParser parser = new DefaultJSONParser("{v5:'3'}");
        __CLR4_5_21fse1fselusyjtkw.R.inc(67143);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67144);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67145);A a = parser.parseObject(A.class);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67146);Assert.assertEquals(3L, a.getV5().longValue());
    }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21fse1fselusyjtkw.R.globalSliceStart(getClass().getName(),67147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1ft7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fse1fselusyjtkw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fse1fselusyjtkw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67147,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1ft7() throws Exception{try{__CLR4_5_21fse1fselusyjtkw.R.inc(67147);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67148);DefaultJSONParser parser = new DefaultJSONParser("{v5:\"3\"}");
        __CLR4_5_21fse1fselusyjtkw.R.inc(67149);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67150);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67151);A a = parser.parseObject(A.class);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67152);Assert.assertEquals(3L, a.getV5().longValue());
    }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21fse1fselusyjtkw.R.globalSliceStart(getClass().getName(),67153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81ftd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fse1fselusyjtkw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fse1fselusyjtkw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81ftd() throws Exception{try{__CLR4_5_21fse1fselusyjtkw.R.inc(67153);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67154);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21fse1fselusyjtkw.R.inc(67155);features = Feature.config(features, Feature.AllowSingleQuotes, true);

        __CLR4_5_21fse1fselusyjtkw.R.inc(67156);Assert.assertEquals(true, Feature.isEnabled(features, Feature.AllowSingleQuotes));

        __CLR4_5_21fse1fselusyjtkw.R.inc(67157);DefaultJSONParser parser = new DefaultJSONParser("'abc'", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21fse1fselusyjtkw.R.inc(67158);Assert.assertEquals("abc", parser.parse());
    }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21fse1fselusyjtkw.R.globalSliceStart(getClass().getName(),67159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1ftj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fse1fselusyjtkw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fse1fselusyjtkw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_3.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67159,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1ftj() throws Exception{try{__CLR4_5_21fse1fselusyjtkw.R.inc(67159);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67160);DefaultJSONParser parser = new DefaultJSONParser("123");

        __CLR4_5_21fse1fselusyjtkw.R.inc(67161);ParserConfig mapping = new ParserConfig();
        __CLR4_5_21fse1fselusyjtkw.R.inc(67162);parser.setConfig(mapping);
        __CLR4_5_21fse1fselusyjtkw.R.inc(67163);Assert.assertEquals(mapping, parser.getConfig());
    }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

    public static class A {

        private int        v1;
        private String     v2;
        private boolean    v3;
        private BigDecimal v4;
        private Long       v5;

        private B          o1;

        public A(){try{__CLR4_5_21fse1fselusyjtkw.R.inc(67164);

        }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

        public Long getV5() {try{__CLR4_5_21fse1fselusyjtkw.R.inc(67165);
            __CLR4_5_21fse1fselusyjtkw.R.inc(67166);return v5;
        }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

        public void setV5(Long v5) {try{__CLR4_5_21fse1fselusyjtkw.R.inc(67167);
            __CLR4_5_21fse1fselusyjtkw.R.inc(67168);this.v5 = v5;
        }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

        public B getO1() {try{__CLR4_5_21fse1fselusyjtkw.R.inc(67169);
            __CLR4_5_21fse1fselusyjtkw.R.inc(67170);return o1;
        }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

        public void setO1(B o1) {try{__CLR4_5_21fse1fselusyjtkw.R.inc(67171);
            __CLR4_5_21fse1fselusyjtkw.R.inc(67172);this.o1 = o1;
        }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

        public int getV1() {try{__CLR4_5_21fse1fselusyjtkw.R.inc(67173);
            __CLR4_5_21fse1fselusyjtkw.R.inc(67174);return v1;
        }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

        public void setV1(int v1) {try{__CLR4_5_21fse1fselusyjtkw.R.inc(67175);
            __CLR4_5_21fse1fselusyjtkw.R.inc(67176);this.v1 = v1;
        }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

        public String getV2() {try{__CLR4_5_21fse1fselusyjtkw.R.inc(67177);
            __CLR4_5_21fse1fselusyjtkw.R.inc(67178);return v2;
        }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

        public void setV2(String v2) {try{__CLR4_5_21fse1fselusyjtkw.R.inc(67179);
            __CLR4_5_21fse1fselusyjtkw.R.inc(67180);this.v2 = v2;
        }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

        public boolean isV3() {try{__CLR4_5_21fse1fselusyjtkw.R.inc(67181);
            __CLR4_5_21fse1fselusyjtkw.R.inc(67182);return v3;
        }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

        public void setV3(boolean v3) {try{__CLR4_5_21fse1fselusyjtkw.R.inc(67183);
            __CLR4_5_21fse1fselusyjtkw.R.inc(67184);this.v3 = v3;
        }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

        public BigDecimal getV4() {try{__CLR4_5_21fse1fselusyjtkw.R.inc(67185);
            __CLR4_5_21fse1fselusyjtkw.R.inc(67186);return v4;
        }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

        public void setV4(BigDecimal v4) {try{__CLR4_5_21fse1fselusyjtkw.R.inc(67187);
            __CLR4_5_21fse1fselusyjtkw.R.inc(67188);this.v4 = v4;
        }finally{__CLR4_5_21fse1fselusyjtkw.R.flushNeeded();}}

    }

    public static class B {

    }
}
