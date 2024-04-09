/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONToken;

public class DefaultExtJSONParser_parseArray extends TestCase {static class __CLR4_1_101fxy1fxylusqkd3f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,67501,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21fxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67318,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21fxy() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67318);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67319);DefaultJSONParser parser = new DefaultJSONParser("[1,2,,,3]");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67320);List list = new ArrayList();
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67321);parser.parseArray(int.class, list);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67322);Assert.assertEquals("[1, 2, 3]", list.toString());
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1fy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67323,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1fy3() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67323);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67324);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3]");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67325);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67326);List list = new ArrayList();
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67327);parser.parseArray(int.class, list);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67328);Assert.assertEquals("[1, 2, 3]", list.toString());
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441fy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67329,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441fy9() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67329);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67330);DefaultJSONParser parser = new DefaultJSONParser("['1','2','3']");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67331);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67332);List list = new ArrayList();
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67333);parser.parseArray(String.class, list);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67334);Assert.assertEquals("[1, 2, 3]", list.toString());
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67335);Assert.assertEquals("1", list.get(0));
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1fyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67336,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1fyg() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67336);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67337);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3]");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67338);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67339);List list = new ArrayList();
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67340);parser.parseArray(BigDecimal.class, list);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67341);Assert.assertEquals("[1, 2, 3]", list.toString());
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67342);Assert.assertEquals(new BigDecimal("1"), list.get(0));
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61fyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67343,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61fyn() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67343);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67344);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3,null]");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67345);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67346);List list = new ArrayList();
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67347);parser.parseArray(BigDecimal.class, list);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67348);Assert.assertEquals("[1, 2, 3, null]", list.toString());
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67349);Assert.assertEquals(new BigDecimal("1"), list.get(0));
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1fyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67350,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1fyu() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67350);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67351);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3,null]");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67352);Object[] array = parser.parseArray(new Type[] { Integer.class, BigDecimal.class, Long.class, String.class });
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67353);Assert.assertEquals(new Integer(1), array[0]);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67354);Assert.assertEquals(new BigDecimal("2"), array[1]);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67355);Assert.assertEquals(new Long(3), array[2]);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67356);Assert.assertEquals(null, array[3]);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1fz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67357,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1fz1() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67357);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67358);DefaultJSONParser parser = new DefaultJSONParser("{}");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67359);Exception error = null;
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67360);try {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67361);parser.parseArray(new ArrayList());
        } catch (Exception ex) {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67362);error = ex;
        }
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67363);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81fz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67364,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81fz8() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67364);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67365);DefaultJSONParser parser = new DefaultJSONParser("[1.2]");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67366);parser.config(Feature.UseBigDecimal, false);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67367);ArrayList list = new ArrayList();
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67368);parser.parseArray(list);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67369);Assert.assertEquals(Double.valueOf(1.2), list.get(0));
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1fze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67370,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1fze() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67370);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67371);DefaultJSONParser parser = new DefaultJSONParser("[\"2011-01-09T13:49:53.254\", \"xxx\", true, false, null, {}]");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67372);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67373);ArrayList list = new ArrayList();
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67374);parser.parseArray(list);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67375);Assert.assertEquals(new Date(1294552193254L), list.get(0));
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67376);Assert.assertEquals("xxx", list.get(1));
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67377);Assert.assertEquals(Boolean.TRUE, list.get(2));
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67378);Assert.assertEquals(Boolean.FALSE, list.get(3));
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67379);Assert.assertEquals(null, list.get(4));
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67380);Assert.assertEquals(new JSONObject(), list.get(5));
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1fzp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67381,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1fzp() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67381);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67382);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53.254\"");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67383);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67384);Object value = parser.parse();
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67385);Assert.assertEquals(new Date(1294552193254L), value);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71fzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67386,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71fzu() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67386);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67387);DefaultJSONParser parser = new DefaultJSONParser("");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67388);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67389);Object value = parser.parse();
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67390);Assert.assertEquals(null, value);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1fzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67391,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1fzz() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67391);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67392);DefaultJSONParser parser = new DefaultJSONParser("{}");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67393);Exception error = null;
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67394);try {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67395);parser.accept(JSONToken.NULL);
        } catch (Exception ex) {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67396);error = ex;
        }
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67397);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x1g06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67398,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x1g06() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67398);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67399);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3]");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67400);Object[] array = parser.parseArray(new Type[] { Integer[].class });
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67401);Integer[] values = (Integer[]) array[0];
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67402);Assert.assertEquals(new Integer(1), values[0]);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67403);Assert.assertEquals(new Integer(2), values[1]);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67404);Assert.assertEquals(new Integer(3), values[2]);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg1g0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67405,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg1g0d() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67405);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67406);DefaultJSONParser parser = new DefaultJSONParser("[1]");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67407);Object[] array = parser.parseArray(new Type[] { String.class });
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67408);Assert.assertEquals("1", array[0]);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105lolmz1g0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67409,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105lolmz1g0h() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67409);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67410);DefaultJSONParser parser = new DefaultJSONParser("['1']");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67411);Object[] array = parser.parseArray(new Type[] { int.class });
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67412);Assert.assertEquals(new Integer(1), array[0]);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102comui1g0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67413,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102comui1g0l() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67413);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67414);DefaultJSONParser parser = new DefaultJSONParser("['1']");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67415);Object[] array = parser.parseArray(new Type[] { Integer.class });
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67416);Assert.assertEquals(new Integer(1), array[0]);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wbbxz1g0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67417,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wbbxz1g0p() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67417);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67418);DefaultJSONParser parser = new DefaultJSONParser("[]");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67419);Object[] array = parser.parseArray(new Type[] {});
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67420);Assert.assertEquals(0, array.length);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1045baqg1g0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67421,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1045baqg1g0t() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67421);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67422);DefaultJSONParser parser = new DefaultJSONParser("[1,null]");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67423);ArrayList list = new ArrayList();
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67424);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67425);parser.parseArray(String.class, list);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67426);Assert.assertEquals("1", list.get(0));
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67427);Assert.assertEquals(null, list.get(1));
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107eb9ix1g10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_16",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67428,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107eb9ix1g10() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67428);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67429);DefaultJSONParser parser = new DefaultJSONParser("[[1]]");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67430);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67431);Object[] array = parser.parseArray(new Type[] { new TypeReference<List<Integer>>() {
        }.getType() });
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67432);Assert.assertEquals(new Integer(1), ((List<Integer>) (array[0])).get(0));
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10anb8be1g15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_17",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67433,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10anb8be1g15() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67433);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67434);DefaultJSONParser parser = new DefaultJSONParser("[]");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67435);Object[] array = parser.parseArray(new Type[] { Integer[].class });
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67436);Integer[] values = (Integer[]) array[0];
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67437);Assert.assertEquals(0, values.length);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_18() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dwb73v1g1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_18",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67438,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dwb73v1g1a() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67438);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67439);DefaultJSONParser parser = new DefaultJSONParser("null");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67440);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67441);List<Integer> list = (List<Integer>) parser.parseArrayWithType(new TypeReference<List<Integer>>() {
        }.getType());
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67442);Assert.assertEquals(null, list);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_error_var() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bmoro61g1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_var",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67443,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bmoro61g1f() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67443);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67444);DefaultJSONParser parser = new DefaultJSONParser("[1,2,null }");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67445);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67446);Exception error = null;
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67447);try {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67448);Object[] array = parser.parseArray(new Type[] { Integer[].class });
        } catch (Exception ex) {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67449);error = ex;
        }
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67450);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1g1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67451,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1g1n() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67451);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67452);DefaultJSONParser parser = new DefaultJSONParser("[1,null }");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67453);ArrayList list = new ArrayList();
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67454);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67455);Exception error = null;
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67456);try {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67457);parser.parseArray(String.class, list);
        } catch (Exception ex) {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67458);error = ex;
        }
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67459);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1g1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67460,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1g1w() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67460);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67461);DefaultJSONParser parser = new DefaultJSONParser("[1,null }");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67462);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67463);Exception error = null;
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67464);try {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67465);parser.parseArray(new Type[] { String.class });
        } catch (Exception ex) {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67466);error = ex;
        }
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67467);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81g24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67468,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81g24() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67468);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67469);DefaultJSONParser parser = new DefaultJSONParser("[1,null }");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67470);ArrayList list = new ArrayList();
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67471);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67472);Exception error = null;
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67473);try {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67474);parser.parseArray(String.class, list);
        } catch (Exception ex) {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67475);error = ex;
        }
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67476);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaop1g2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67477,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaop1g2d() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67477);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67478);DefaultJSONParser parser = new DefaultJSONParser("{1,null }");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67479);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67480);Exception error = null;
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67481);try {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67482);parser.parseArray(new Type[] { String.class });
        } catch (Exception ex) {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67483);error = ex;
        }
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67484);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_error_7() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9rshy1g2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67485,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9rshy1g2l() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67485);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67486);DefaultJSONParser parser = new DefaultJSONParser("{1}");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67487);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67488);Exception error = null;
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67489);try {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67490);parser.parseArray(new Type[] {});
        } catch (Exception ex) {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67491);error = ex;
        }
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67492);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}

    public void test_error_8() throws Exception {__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceStart(getClass().getName(),67493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u0rtph1g2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fxy1fxylusqkd3f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fxy1fxylusqkd3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67493,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u0rtph1g2t() throws Exception{try{__CLR4_1_101fxy1fxylusqkd3f.R.inc(67493);
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67494);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3 4]");
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67495);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67496);Exception error = null;
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67497);try {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67498);parser.parseArray(new Type[] { Integer.class });
        } catch (Exception ex) {
            __CLR4_1_101fxy1fxylusqkd3f.R.inc(67499);error = ex;
        }
        __CLR4_1_101fxy1fxylusqkd3f.R.inc(67500);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fxy1fxylusqkd3f.R.flushNeeded();}}
}
