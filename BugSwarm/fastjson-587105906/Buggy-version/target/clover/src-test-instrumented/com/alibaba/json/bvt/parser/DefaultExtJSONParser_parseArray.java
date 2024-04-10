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

public class DefaultExtJSONParser_parseArray extends TestCase {static class __CLR4_1_101gw61gw6luszwccy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,68733,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21gw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68550,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21gw6() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68550);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68551);DefaultJSONParser parser = new DefaultJSONParser("[1,2,,,3]");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68552);List list = new ArrayList();
        __CLR4_1_101gw61gw6luszwccy.R.inc(68553);parser.parseArray(int.class, list);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68554);Assert.assertEquals("[1, 2, 3]", list.toString());
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1gwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68555,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1gwb() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68555);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68556);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3]");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68557);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68558);List list = new ArrayList();
        __CLR4_1_101gw61gw6luszwccy.R.inc(68559);parser.parseArray(int.class, list);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68560);Assert.assertEquals("[1, 2, 3]", list.toString());
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441gwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68561,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441gwh() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68561);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68562);DefaultJSONParser parser = new DefaultJSONParser("['1','2','3']");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68563);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68564);List list = new ArrayList();
        __CLR4_1_101gw61gw6luszwccy.R.inc(68565);parser.parseArray(String.class, list);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68566);Assert.assertEquals("[1, 2, 3]", list.toString());
        __CLR4_1_101gw61gw6luszwccy.R.inc(68567);Assert.assertEquals("1", list.get(0));
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1gwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68568,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1gwo() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68568);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68569);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3]");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68570);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68571);List list = new ArrayList();
        __CLR4_1_101gw61gw6luszwccy.R.inc(68572);parser.parseArray(BigDecimal.class, list);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68573);Assert.assertEquals("[1, 2, 3]", list.toString());
        __CLR4_1_101gw61gw6luszwccy.R.inc(68574);Assert.assertEquals(new BigDecimal("1"), list.get(0));
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61gwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68575,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61gwv() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68575);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68576);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3,null]");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68577);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68578);List list = new ArrayList();
        __CLR4_1_101gw61gw6luszwccy.R.inc(68579);parser.parseArray(BigDecimal.class, list);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68580);Assert.assertEquals("[1, 2, 3, null]", list.toString());
        __CLR4_1_101gw61gw6luszwccy.R.inc(68581);Assert.assertEquals(new BigDecimal("1"), list.get(0));
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1gx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68582,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1gx2() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68582);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68583);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3,null]");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68584);Object[] array = parser.parseArray(new Type[] { Integer.class, BigDecimal.class, Long.class, String.class });
        __CLR4_1_101gw61gw6luszwccy.R.inc(68585);Assert.assertEquals(new Integer(1), array[0]);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68586);Assert.assertEquals(new BigDecimal("2"), array[1]);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68587);Assert.assertEquals(new Long(3), array[2]);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68588);Assert.assertEquals(null, array[3]);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1gx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68589,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1gx9() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68589);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68590);DefaultJSONParser parser = new DefaultJSONParser("{}");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68591);Exception error = null;
        __CLR4_1_101gw61gw6luszwccy.R.inc(68592);try {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68593);parser.parseArray(new ArrayList());
        } catch (Exception ex) {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68594);error = ex;
        }
        __CLR4_1_101gw61gw6luszwccy.R.inc(68595);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81gxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68596,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81gxg() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68596);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68597);DefaultJSONParser parser = new DefaultJSONParser("[1.2]");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68598);parser.config(Feature.UseBigDecimal, false);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68599);ArrayList list = new ArrayList();
        __CLR4_1_101gw61gw6luszwccy.R.inc(68600);parser.parseArray(list);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68601);Assert.assertEquals(Double.valueOf(1.2), list.get(0));
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1gxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68602,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1gxm() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68602);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68603);DefaultJSONParser parser = new DefaultJSONParser("[\"2011-01-09T13:49:53.254\", \"xxx\", true, false, null, {}]");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68604);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68605);ArrayList list = new ArrayList();
        __CLR4_1_101gw61gw6luszwccy.R.inc(68606);parser.parseArray(list);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68607);Assert.assertEquals(new Date(1294552193254L), list.get(0));
        __CLR4_1_101gw61gw6luszwccy.R.inc(68608);Assert.assertEquals("xxx", list.get(1));
        __CLR4_1_101gw61gw6luszwccy.R.inc(68609);Assert.assertEquals(Boolean.TRUE, list.get(2));
        __CLR4_1_101gw61gw6luszwccy.R.inc(68610);Assert.assertEquals(Boolean.FALSE, list.get(3));
        __CLR4_1_101gw61gw6luszwccy.R.inc(68611);Assert.assertEquals(null, list.get(4));
        __CLR4_1_101gw61gw6luszwccy.R.inc(68612);Assert.assertEquals(new JSONObject(), list.get(5));
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1gxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68613,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1gxx() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68613);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68614);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53.254\"");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68615);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68616);Object value = parser.parse();
        __CLR4_1_101gw61gw6luszwccy.R.inc(68617);Assert.assertEquals(new Date(1294552193254L), value);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71gy2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68618,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71gy2() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68618);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68619);DefaultJSONParser parser = new DefaultJSONParser("");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68620);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68621);Object value = parser.parse();
        __CLR4_1_101gw61gw6luszwccy.R.inc(68622);Assert.assertEquals(null, value);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1gy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68623,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1gy7() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68623);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68624);DefaultJSONParser parser = new DefaultJSONParser("{}");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68625);Exception error = null;
        __CLR4_1_101gw61gw6luszwccy.R.inc(68626);try {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68627);parser.accept(JSONToken.NULL);
        } catch (Exception ex) {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68628);error = ex;
        }
        __CLR4_1_101gw61gw6luszwccy.R.inc(68629);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x1gye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68630,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x1gye() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68630);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68631);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3]");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68632);Object[] array = parser.parseArray(new Type[] { Integer[].class });
        __CLR4_1_101gw61gw6luszwccy.R.inc(68633);Integer[] values = (Integer[]) array[0];
        __CLR4_1_101gw61gw6luszwccy.R.inc(68634);Assert.assertEquals(new Integer(1), values[0]);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68635);Assert.assertEquals(new Integer(2), values[1]);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68636);Assert.assertEquals(new Integer(3), values[2]);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg1gyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68637,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg1gyl() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68637);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68638);DefaultJSONParser parser = new DefaultJSONParser("[1]");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68639);Object[] array = parser.parseArray(new Type[] { String.class });
        __CLR4_1_101gw61gw6luszwccy.R.inc(68640);Assert.assertEquals("1", array[0]);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105lolmz1gyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68641,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105lolmz1gyp() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68641);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68642);DefaultJSONParser parser = new DefaultJSONParser("['1']");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68643);Object[] array = parser.parseArray(new Type[] { int.class });
        __CLR4_1_101gw61gw6luszwccy.R.inc(68644);Assert.assertEquals(new Integer(1), array[0]);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102comui1gyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68645,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102comui1gyt() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68645);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68646);DefaultJSONParser parser = new DefaultJSONParser("['1']");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68647);Object[] array = parser.parseArray(new Type[] { Integer.class });
        __CLR4_1_101gw61gw6luszwccy.R.inc(68648);Assert.assertEquals(new Integer(1), array[0]);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wbbxz1gyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68649,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wbbxz1gyx() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68649);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68650);DefaultJSONParser parser = new DefaultJSONParser("[]");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68651);Object[] array = parser.parseArray(new Type[] {});
        __CLR4_1_101gw61gw6luszwccy.R.inc(68652);Assert.assertEquals(0, array.length);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1045baqg1gz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68653,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1045baqg1gz1() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68653);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68654);DefaultJSONParser parser = new DefaultJSONParser("[1,null]");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68655);ArrayList list = new ArrayList();
        __CLR4_1_101gw61gw6luszwccy.R.inc(68656);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68657);parser.parseArray(String.class, list);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68658);Assert.assertEquals("1", list.get(0));
        __CLR4_1_101gw61gw6luszwccy.R.inc(68659);Assert.assertEquals(null, list.get(1));
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107eb9ix1gz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_16",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68660,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107eb9ix1gz8() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68660);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68661);DefaultJSONParser parser = new DefaultJSONParser("[[1]]");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68662);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68663);Object[] array = parser.parseArray(new Type[] { new TypeReference<List<Integer>>() {
        }.getType() });
        __CLR4_1_101gw61gw6luszwccy.R.inc(68664);Assert.assertEquals(new Integer(1), ((List<Integer>) (array[0])).get(0));
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10anb8be1gzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_17",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68665,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10anb8be1gzd() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68665);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68666);DefaultJSONParser parser = new DefaultJSONParser("[]");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68667);Object[] array = parser.parseArray(new Type[] { Integer[].class });
        __CLR4_1_101gw61gw6luszwccy.R.inc(68668);Integer[] values = (Integer[]) array[0];
        __CLR4_1_101gw61gw6luszwccy.R.inc(68669);Assert.assertEquals(0, values.length);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_18() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dwb73v1gzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_18",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68670,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dwb73v1gzi() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68670);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68671);DefaultJSONParser parser = new DefaultJSONParser("null");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68672);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68673);List<Integer> list = (List<Integer>) parser.parseArrayWithType(new TypeReference<List<Integer>>() {
        }.getType());
        __CLR4_1_101gw61gw6luszwccy.R.inc(68674);Assert.assertEquals(null, list);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_error_var() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bmoro61gzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_var",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68675,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bmoro61gzn() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68675);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68676);DefaultJSONParser parser = new DefaultJSONParser("[1,2,null }");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68677);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101gw61gw6luszwccy.R.inc(68678);Exception error = null;
        __CLR4_1_101gw61gw6luszwccy.R.inc(68679);try {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68680);Object[] array = parser.parseArray(new Type[] { Integer[].class });
        } catch (Exception ex) {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68681);error = ex;
        }
        __CLR4_1_101gw61gw6luszwccy.R.inc(68682);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1gzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68683,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1gzv() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68683);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68684);DefaultJSONParser parser = new DefaultJSONParser("[1,null }");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68685);ArrayList list = new ArrayList();
        __CLR4_1_101gw61gw6luszwccy.R.inc(68686);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101gw61gw6luszwccy.R.inc(68687);Exception error = null;
        __CLR4_1_101gw61gw6luszwccy.R.inc(68688);try {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68689);parser.parseArray(String.class, list);
        } catch (Exception ex) {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68690);error = ex;
        }
        __CLR4_1_101gw61gw6luszwccy.R.inc(68691);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1h04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68692,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1h04() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68692);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68693);DefaultJSONParser parser = new DefaultJSONParser("[1,null }");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68694);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101gw61gw6luszwccy.R.inc(68695);Exception error = null;
        __CLR4_1_101gw61gw6luszwccy.R.inc(68696);try {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68697);parser.parseArray(new Type[] { String.class });
        } catch (Exception ex) {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68698);error = ex;
        }
        __CLR4_1_101gw61gw6luszwccy.R.inc(68699);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81h0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68700,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81h0c() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68700);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68701);DefaultJSONParser parser = new DefaultJSONParser("[1,null }");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68702);ArrayList list = new ArrayList();
        __CLR4_1_101gw61gw6luszwccy.R.inc(68703);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101gw61gw6luszwccy.R.inc(68704);Exception error = null;
        __CLR4_1_101gw61gw6luszwccy.R.inc(68705);try {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68706);parser.parseArray(String.class, list);
        } catch (Exception ex) {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68707);error = ex;
        }
        __CLR4_1_101gw61gw6luszwccy.R.inc(68708);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaop1h0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68709,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaop1h0l() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68709);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68710);DefaultJSONParser parser = new DefaultJSONParser("{1,null }");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68711);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101gw61gw6luszwccy.R.inc(68712);Exception error = null;
        __CLR4_1_101gw61gw6luszwccy.R.inc(68713);try {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68714);parser.parseArray(new Type[] { String.class });
        } catch (Exception ex) {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68715);error = ex;
        }
        __CLR4_1_101gw61gw6luszwccy.R.inc(68716);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_error_7() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9rshy1h0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68717,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9rshy1h0t() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68717);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68718);DefaultJSONParser parser = new DefaultJSONParser("{1}");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68719);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101gw61gw6luszwccy.R.inc(68720);Exception error = null;
        __CLR4_1_101gw61gw6luszwccy.R.inc(68721);try {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68722);parser.parseArray(new Type[] {});
        } catch (Exception ex) {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68723);error = ex;
        }
        __CLR4_1_101gw61gw6luszwccy.R.inc(68724);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}

    public void test_error_8() throws Exception {__CLR4_1_101gw61gw6luszwccy.R.globalSliceStart(getClass().getName(),68725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u0rtph1h11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gw61gw6luszwccy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gw61gw6luszwccy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68725,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u0rtph1h11() throws Exception{try{__CLR4_1_101gw61gw6luszwccy.R.inc(68725);
        __CLR4_1_101gw61gw6luszwccy.R.inc(68726);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3 4]");
        __CLR4_1_101gw61gw6luszwccy.R.inc(68727);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101gw61gw6luszwccy.R.inc(68728);Exception error = null;
        __CLR4_1_101gw61gw6luszwccy.R.inc(68729);try {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68730);parser.parseArray(new Type[] { Integer.class });
        } catch (Exception ex) {
            __CLR4_1_101gw61gw6luszwccy.R.inc(68731);error = ex;
        }
        __CLR4_1_101gw61gw6luszwccy.R.inc(68732);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gw61gw6luszwccy.R.flushNeeded();}}
}
