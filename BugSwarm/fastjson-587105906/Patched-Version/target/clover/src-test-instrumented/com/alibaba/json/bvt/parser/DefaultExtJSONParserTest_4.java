/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

public class DefaultExtJSONParserTest_4 extends TestCase {static class __CLR4_5_21gsl1gsllusvncis{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,68476,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21gsl1gsllusvncis.R.globalSliceStart(getClass().getName(),68421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21gsl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gsl1gsllusvncis.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gsl1gsllusvncis.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_4.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68421,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21gsl() throws Exception{try{__CLR4_5_21gsl1gsllusvncis.R.inc(68421);
        __CLR4_5_21gsl1gsllusvncis.R.inc(68422);List<?> res = Arrays.asList(1, 2, 3);
        __CLR4_5_21gsl1gsllusvncis.R.inc(68423);String[] tests = { "[1,2,3]", "[1,,2,3]", "[1,2,,,3]", "[1 2,,,3]", "[1 2 3]", "[1, 2, 3,,]", "[,,1, 2, 3,,]", };

        __CLR4_5_21gsl1gsllusvncis.R.inc(68424);for (String t : tests) {{
            __CLR4_5_21gsl1gsllusvncis.R.inc(68425);DefaultJSONParser ext = new DefaultJSONParser(t);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68426);ext.config(Feature.AllowArbitraryCommas, true);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68427);List<Object> extRes = ext.parseArray(Object.class);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68428);Assert.assertEquals(res, extRes);

            __CLR4_5_21gsl1gsllusvncis.R.inc(68429);DefaultJSONParser basic = new DefaultJSONParser(t);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68430);basic.config(Feature.AllowArbitraryCommas, true);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68431);List<Object> basicRes = new ArrayList<Object>();
            __CLR4_5_21gsl1gsllusvncis.R.inc(68432);basic.parseArray(basicRes);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68433);Assert.assertEquals(res, basicRes);
        }
    }}finally{__CLR4_5_21gsl1gsllusvncis.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21gsl1gsllusvncis.R.globalSliceStart(getClass().getName(),68434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1gsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gsl1gsllusvncis.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gsl1gsllusvncis.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_4.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1gsy() throws Exception{try{__CLR4_5_21gsl1gsllusvncis.R.inc(68434);
        __CLR4_5_21gsl1gsllusvncis.R.inc(68435);JSONObject res = new JSONObject();
        __CLR4_5_21gsl1gsllusvncis.R.inc(68436);res.put("a", 1);
        __CLR4_5_21gsl1gsllusvncis.R.inc(68437);res.put("b", 2);
        __CLR4_5_21gsl1gsllusvncis.R.inc(68438);res.put("c", 3);

        __CLR4_5_21gsl1gsllusvncis.R.inc(68439);String[] tests = { "{ 'a':1, 'b':2, 'c':3 }", "{ 'a':1,,'b':2, 'c':3 }", "{,'a':1, 'b':2, 'c':3 }", "{'a':1, 'b':2, 'c':3,,}",
                "{,,'a':1,,,,'b':2,'c':3,,,,,}", };

        __CLR4_5_21gsl1gsllusvncis.R.inc(68440);for (String t : tests) {{
            __CLR4_5_21gsl1gsllusvncis.R.inc(68441);DefaultJSONParser ext = new DefaultJSONParser(t);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68442);ext.config(Feature.AllowArbitraryCommas, true);

            __CLR4_5_21gsl1gsllusvncis.R.inc(68443);JSONObject extRes = ext.parseObject();
            __CLR4_5_21gsl1gsllusvncis.R.inc(68444);Assert.assertEquals(res, extRes);

            __CLR4_5_21gsl1gsllusvncis.R.inc(68445);DefaultJSONParser basic = new DefaultJSONParser(t);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68446);basic.config(Feature.AllowArbitraryCommas, true);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68447);JSONObject basicRes = basic.parseObject();
            __CLR4_5_21gsl1gsllusvncis.R.inc(68448);Assert.assertEquals(res, basicRes);
        }
    }}finally{__CLR4_5_21gsl1gsllusvncis.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21gsl1gsllusvncis.R.globalSliceStart(getClass().getName(),68449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441gtd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gsl1gsllusvncis.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gsl1gsllusvncis.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_4.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68449,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441gtd() throws Exception{try{__CLR4_5_21gsl1gsllusvncis.R.inc(68449);
        __CLR4_5_21gsl1gsllusvncis.R.inc(68450);A res = new A();
        __CLR4_5_21gsl1gsllusvncis.R.inc(68451);res.setA(1);
        __CLR4_5_21gsl1gsllusvncis.R.inc(68452);res.setB(2);
        __CLR4_5_21gsl1gsllusvncis.R.inc(68453);res.setC(3);

        __CLR4_5_21gsl1gsllusvncis.R.inc(68454);String[] tests = { "{ 'a':1, 'b':2, 'c':3 }", "{ 'a':1,,'b':2, 'c':3 }", "{,'a':1, 'b':2, 'c':3 }", "{'a':1, 'b':2, 'c':3,,}",
                "{,,'a':1,,,,'b':2,,'c':3,,,,,}", };

        __CLR4_5_21gsl1gsllusvncis.R.inc(68455);for (String t : tests) {{
            __CLR4_5_21gsl1gsllusvncis.R.inc(68456);DefaultJSONParser ext = new DefaultJSONParser(t);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68457);ext.config(Feature.AllowArbitraryCommas, true);

            __CLR4_5_21gsl1gsllusvncis.R.inc(68458);A extRes = ext.parseObject(A.class);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68459);Assert.assertEquals(res, extRes);
        }
    }}finally{__CLR4_5_21gsl1gsllusvncis.R.flushNeeded();}}

    public static class A {

        private int a, b, c;

        public A(){try{__CLR4_5_21gsl1gsllusvncis.R.inc(68460);
        }finally{__CLR4_5_21gsl1gsllusvncis.R.flushNeeded();}}

        public int getA() {try{__CLR4_5_21gsl1gsllusvncis.R.inc(68461);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68462);return a;
        }finally{__CLR4_5_21gsl1gsllusvncis.R.flushNeeded();}}

        public void setA(int a) {try{__CLR4_5_21gsl1gsllusvncis.R.inc(68463);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68464);this.a = a;
        }finally{__CLR4_5_21gsl1gsllusvncis.R.flushNeeded();}}

        public int getB() {try{__CLR4_5_21gsl1gsllusvncis.R.inc(68465);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68466);return b;
        }finally{__CLR4_5_21gsl1gsllusvncis.R.flushNeeded();}}

        public void setB(int b) {try{__CLR4_5_21gsl1gsllusvncis.R.inc(68467);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68468);this.b = b;
        }finally{__CLR4_5_21gsl1gsllusvncis.R.flushNeeded();}}

        public int getC() {try{__CLR4_5_21gsl1gsllusvncis.R.inc(68469);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68470);return c;
        }finally{__CLR4_5_21gsl1gsllusvncis.R.flushNeeded();}}

        public void setC(int c) {try{__CLR4_5_21gsl1gsllusvncis.R.inc(68471);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68472);this.c = c;
        }finally{__CLR4_5_21gsl1gsllusvncis.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_5_21gsl1gsllusvncis.R.inc(68473);
            __CLR4_5_21gsl1gsllusvncis.R.inc(68474);A o = (A) obj;
            __CLR4_5_21gsl1gsllusvncis.R.inc(68475);return a == o.a && b == o.b && c == o.c;
        }finally{__CLR4_5_21gsl1gsllusvncis.R.flushNeeded();}}
    }
}
