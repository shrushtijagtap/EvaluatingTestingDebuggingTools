/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

public class DefaultExtJSONParserTest_4 extends TestCase {static class __CLR4_1_101fuo1fuolusqkd2g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,67255,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101fuo1fuolusqkd2g.R.globalSliceStart(getClass().getName(),67200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21fuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fuo1fuolusqkd2g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fuo1fuolusqkd2g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_4.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67200,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21fuo() throws Exception{try{__CLR4_1_101fuo1fuolusqkd2g.R.inc(67200);
        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67201);List<?> res = Arrays.asList(1, 2, 3);
        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67202);String[] tests = { "[1,2,3]", "[1,,2,3]", "[1,2,,,3]", "[1 2,,,3]", "[1 2 3]", "[1, 2, 3,,]", "[,,1, 2, 3,,]", };

        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67203);for (String t : tests) {{
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67204);DefaultJSONParser ext = new DefaultJSONParser(t);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67205);ext.config(Feature.AllowArbitraryCommas, true);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67206);List<Object> extRes = ext.parseArray(Object.class);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67207);Assert.assertEquals(res, extRes);

            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67208);DefaultJSONParser basic = new DefaultJSONParser(t);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67209);basic.config(Feature.AllowArbitraryCommas, true);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67210);List<Object> basicRes = new ArrayList<Object>();
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67211);basic.parseArray(basicRes);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67212);Assert.assertEquals(res, basicRes);
        }
    }}finally{__CLR4_1_101fuo1fuolusqkd2g.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101fuo1fuolusqkd2g.R.globalSliceStart(getClass().getName(),67213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1fv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fuo1fuolusqkd2g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fuo1fuolusqkd2g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_4.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67213,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1fv1() throws Exception{try{__CLR4_1_101fuo1fuolusqkd2g.R.inc(67213);
        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67214);JSONObject res = new JSONObject();
        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67215);res.put("a", 1);
        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67216);res.put("b", 2);
        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67217);res.put("c", 3);

        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67218);String[] tests = { "{ 'a':1, 'b':2, 'c':3 }", "{ 'a':1,,'b':2, 'c':3 }", "{,'a':1, 'b':2, 'c':3 }", "{'a':1, 'b':2, 'c':3,,}",
                "{,,'a':1,,,,'b':2,'c':3,,,,,}", };

        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67219);for (String t : tests) {{
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67220);DefaultJSONParser ext = new DefaultJSONParser(t);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67221);ext.config(Feature.AllowArbitraryCommas, true);

            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67222);JSONObject extRes = ext.parseObject();
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67223);Assert.assertEquals(res, extRes);

            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67224);DefaultJSONParser basic = new DefaultJSONParser(t);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67225);basic.config(Feature.AllowArbitraryCommas, true);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67226);JSONObject basicRes = basic.parseObject();
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67227);Assert.assertEquals(res, basicRes);
        }
    }}finally{__CLR4_1_101fuo1fuolusqkd2g.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101fuo1fuolusqkd2g.R.globalSliceStart(getClass().getName(),67228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441fvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fuo1fuolusqkd2g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fuo1fuolusqkd2g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_4.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67228,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441fvg() throws Exception{try{__CLR4_1_101fuo1fuolusqkd2g.R.inc(67228);
        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67229);A res = new A();
        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67230);res.setA(1);
        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67231);res.setB(2);
        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67232);res.setC(3);

        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67233);String[] tests = { "{ 'a':1, 'b':2, 'c':3 }", "{ 'a':1,,'b':2, 'c':3 }", "{,'a':1, 'b':2, 'c':3 }", "{'a':1, 'b':2, 'c':3,,}",
                "{,,'a':1,,,,'b':2,,'c':3,,,,,}", };

        __CLR4_1_101fuo1fuolusqkd2g.R.inc(67234);for (String t : tests) {{
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67235);DefaultJSONParser ext = new DefaultJSONParser(t);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67236);ext.config(Feature.AllowArbitraryCommas, true);

            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67237);A extRes = ext.parseObject(A.class);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67238);Assert.assertEquals(res, extRes);
        }
    }}finally{__CLR4_1_101fuo1fuolusqkd2g.R.flushNeeded();}}

    public static class A {

        private int a, b, c;

        public A(){try{__CLR4_1_101fuo1fuolusqkd2g.R.inc(67239);
        }finally{__CLR4_1_101fuo1fuolusqkd2g.R.flushNeeded();}}

        public int getA() {try{__CLR4_1_101fuo1fuolusqkd2g.R.inc(67240);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67241);return a;
        }finally{__CLR4_1_101fuo1fuolusqkd2g.R.flushNeeded();}}

        public void setA(int a) {try{__CLR4_1_101fuo1fuolusqkd2g.R.inc(67242);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67243);this.a = a;
        }finally{__CLR4_1_101fuo1fuolusqkd2g.R.flushNeeded();}}

        public int getB() {try{__CLR4_1_101fuo1fuolusqkd2g.R.inc(67244);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67245);return b;
        }finally{__CLR4_1_101fuo1fuolusqkd2g.R.flushNeeded();}}

        public void setB(int b) {try{__CLR4_1_101fuo1fuolusqkd2g.R.inc(67246);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67247);this.b = b;
        }finally{__CLR4_1_101fuo1fuolusqkd2g.R.flushNeeded();}}

        public int getC() {try{__CLR4_1_101fuo1fuolusqkd2g.R.inc(67248);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67249);return c;
        }finally{__CLR4_1_101fuo1fuolusqkd2g.R.flushNeeded();}}

        public void setC(int c) {try{__CLR4_1_101fuo1fuolusqkd2g.R.inc(67250);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67251);this.c = c;
        }finally{__CLR4_1_101fuo1fuolusqkd2g.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_1_101fuo1fuolusqkd2g.R.inc(67252);
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67253);A o = (A) obj;
            __CLR4_1_101fuo1fuolusqkd2g.R.inc(67254);return a == o.a && b == o.b && c == o.c;
        }finally{__CLR4_1_101fuo1fuolusqkd2g.R.flushNeeded();}}
    }
}
