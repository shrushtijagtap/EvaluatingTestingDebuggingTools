/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

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

public class DefaultExtJSONParser_parseArray extends TestCase {static class __CLR4_5_21gvv1gvvlusvnck6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,68722,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21gvv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68539,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21gvv() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68539);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68540);DefaultJSONParser parser = new DefaultJSONParser("[1,2,,,3]");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68541);List list = new ArrayList();
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68542);parser.parseArray(int.class, list);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68543);Assert.assertEquals("[1, 2, 3]", list.toString());
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1gw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68544,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1gw0() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68544);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68545);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3]");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68546);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68547);List list = new ArrayList();
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68548);parser.parseArray(int.class, list);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68549);Assert.assertEquals("[1, 2, 3]", list.toString());
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441gw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68550,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441gw6() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68550);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68551);DefaultJSONParser parser = new DefaultJSONParser("['1','2','3']");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68552);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68553);List list = new ArrayList();
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68554);parser.parseArray(String.class, list);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68555);Assert.assertEquals("[1, 2, 3]", list.toString());
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68556);Assert.assertEquals("1", list.get(0));
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1gwd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68557,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1gwd() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68557);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68558);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3]");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68559);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68560);List list = new ArrayList();
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68561);parser.parseArray(BigDecimal.class, list);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68562);Assert.assertEquals("[1, 2, 3]", list.toString());
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68563);Assert.assertEquals(new BigDecimal("1"), list.get(0));
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61gwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68564,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61gwk() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68564);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68565);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3,null]");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68566);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68567);List list = new ArrayList();
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68568);parser.parseArray(BigDecimal.class, list);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68569);Assert.assertEquals("[1, 2, 3, null]", list.toString());
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68570);Assert.assertEquals(new BigDecimal("1"), list.get(0));
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1gwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68571,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1gwr() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68571);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68572);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3,null]");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68573);Object[] array = parser.parseArray(new Type[] { Integer.class, BigDecimal.class, Long.class, String.class });
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68574);Assert.assertEquals(new Integer(1), array[0]);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68575);Assert.assertEquals(new BigDecimal("2"), array[1]);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68576);Assert.assertEquals(new Long(3), array[2]);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68577);Assert.assertEquals(null, array[3]);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1gwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1gwy() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68578);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68579);DefaultJSONParser parser = new DefaultJSONParser("{}");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68580);Exception error = null;
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68581);try {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68582);parser.parseArray(new ArrayList());
        } catch (Exception ex) {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68583);error = ex;
        }
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68584);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81gx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68585,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81gx5() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68585);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68586);DefaultJSONParser parser = new DefaultJSONParser("[1.2]");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68587);parser.config(Feature.UseBigDecimal, false);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68588);ArrayList list = new ArrayList();
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68589);parser.parseArray(list);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68590);Assert.assertEquals(Double.valueOf(1.2), list.get(0));
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1gxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68591,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1gxb() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68591);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68592);DefaultJSONParser parser = new DefaultJSONParser("[\"2011-01-09T13:49:53.254\", \"xxx\", true, false, null, {}]");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68593);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68594);ArrayList list = new ArrayList();
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68595);parser.parseArray(list);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68596);Assert.assertEquals(new Date(1294552193254L), list.get(0));
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68597);Assert.assertEquals("xxx", list.get(1));
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68598);Assert.assertEquals(Boolean.TRUE, list.get(2));
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68599);Assert.assertEquals(Boolean.FALSE, list.get(3));
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68600);Assert.assertEquals(null, list.get(4));
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68601);Assert.assertEquals(new JSONObject(), list.get(5));
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1gxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68602,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1gxm() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68602);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68603);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53.254\"");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68604);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68605);Object value = parser.parse();
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68606);Assert.assertEquals(new Date(1294552193254L), value);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71gxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68607,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71gxr() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68607);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68608);DefaultJSONParser parser = new DefaultJSONParser("");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68609);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68610);Object value = parser.parse();
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68611);Assert.assertEquals(null, value);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1gxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68612,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1gxw() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68612);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68613);DefaultJSONParser parser = new DefaultJSONParser("{}");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68614);Exception error = null;
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68615);try {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68616);parser.accept(JSONToken.NULL);
        } catch (Exception ex) {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68617);error = ex;
        }
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68618);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1gy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68619,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1gy3() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68619);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68620);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3]");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68621);Object[] array = parser.parseArray(new Type[] { Integer[].class });
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68622);Integer[] values = (Integer[]) array[0];
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68623);Assert.assertEquals(new Integer(1), values[0]);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68624);Assert.assertEquals(new Integer(2), values[1]);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68625);Assert.assertEquals(new Integer(3), values[2]);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1gya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1gya() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68626);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68627);DefaultJSONParser parser = new DefaultJSONParser("[1]");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68628);Object[] array = parser.parseArray(new Type[] { String.class });
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68629);Assert.assertEquals("1", array[0]);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1gye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1gye() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68630);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68631);DefaultJSONParser parser = new DefaultJSONParser("['1']");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68632);Object[] array = parser.parseArray(new Type[] { int.class });
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68633);Assert.assertEquals(new Integer(1), array[0]);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22comui1gyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68634,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22comui1gyi() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68634);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68635);DefaultJSONParser parser = new DefaultJSONParser("['1']");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68636);Object[] array = parser.parseArray(new Type[] { Integer.class });
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68637);Assert.assertEquals(new Integer(1), array[0]);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbbxz1gym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68638,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbbxz1gym() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68638);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68639);DefaultJSONParser parser = new DefaultJSONParser("[]");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68640);Object[] array = parser.parseArray(new Type[] {});
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68641);Assert.assertEquals(0, array.length);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_245baqg1gyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68642,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_245baqg1gyq() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68642);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68643);DefaultJSONParser parser = new DefaultJSONParser("[1,null]");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68644);ArrayList list = new ArrayList();
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68645);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68646);parser.parseArray(String.class, list);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68647);Assert.assertEquals("1", list.get(0));
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68648);Assert.assertEquals(null, list.get(1));
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27eb9ix1gyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68649,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27eb9ix1gyx() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68649);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68650);DefaultJSONParser parser = new DefaultJSONParser("[[1]]");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68651);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68652);Object[] array = parser.parseArray(new Type[] { new TypeReference<List<Integer>>() {
        }.getType() });
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68653);Assert.assertEquals(new Integer(1), ((List<Integer>) (array[0])).get(0));
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2anb8be1gz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2anb8be1gz2() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68654);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68655);DefaultJSONParser parser = new DefaultJSONParser("[]");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68656);Object[] array = parser.parseArray(new Type[] { Integer[].class });
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68657);Integer[] values = (Integer[]) array[0];
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68658);Assert.assertEquals(0, values.length);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_18() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dwb73v1gz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_18",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68659,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dwb73v1gz7() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68659);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68660);DefaultJSONParser parser = new DefaultJSONParser("null");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68661);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68662);List<Integer> list = (List<Integer>) parser.parseArrayWithType(new TypeReference<List<Integer>>() {
        }.getType());
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68663);Assert.assertEquals(null, list);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_error_var() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bmoro61gzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_var",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68664,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bmoro61gzc() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68664);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68665);DefaultJSONParser parser = new DefaultJSONParser("[1,2,null }");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68666);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68667);Exception error = null;
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68668);try {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68669);Object[] array = parser.parseArray(new Type[] { Integer[].class });
        } catch (Exception ex) {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68670);error = ex;
        }
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68671);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1gzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68672,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1gzk() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68672);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68673);DefaultJSONParser parser = new DefaultJSONParser("[1,null }");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68674);ArrayList list = new ArrayList();
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68675);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68676);Exception error = null;
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68677);try {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68678);parser.parseArray(String.class, list);
        } catch (Exception ex) {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68679);error = ex;
        }
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68680);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1gzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68681,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1gzt() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68681);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68682);DefaultJSONParser parser = new DefaultJSONParser("[1,null }");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68683);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68684);Exception error = null;
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68685);try {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68686);parser.parseArray(new Type[] { String.class });
        } catch (Exception ex) {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68687);error = ex;
        }
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68688);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81h01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68689,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81h01() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68689);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68690);DefaultJSONParser parser = new DefaultJSONParser("[1,null }");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68691);ArrayList list = new ArrayList();
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68692);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68693);Exception error = null;
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68694);try {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68695);parser.parseArray(String.class, list);
        } catch (Exception ex) {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68696);error = ex;
        }
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68697);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1h0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68698,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1h0a() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68698);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68699);DefaultJSONParser parser = new DefaultJSONParser("{1,null }");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68700);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68701);Exception error = null;
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68702);try {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68703);parser.parseArray(new Type[] { String.class });
        } catch (Exception ex) {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68704);error = ex;
        }
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68705);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_error_7() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9rshy1h0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68706,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9rshy1h0i() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68706);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68707);DefaultJSONParser parser = new DefaultJSONParser("{1}");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68708);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68709);Exception error = null;
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68710);try {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68711);parser.parseArray(new Type[] {});
        } catch (Exception ex) {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68712);error = ex;
        }
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68713);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}

    public void test_error_8() throws Exception {__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceStart(getClass().getName(),68714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u0rtph1h0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gvv1gvvlusvnck6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gvv1gvvlusvnck6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68714,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u0rtph1h0q() throws Exception{try{__CLR4_5_21gvv1gvvlusvnck6.R.inc(68714);
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68715);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3 4]");
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68716);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68717);Exception error = null;
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68718);try {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68719);parser.parseArray(new Type[] { Integer.class });
        } catch (Exception ex) {
            __CLR4_5_21gvv1gvvlusvnck6.R.inc(68720);error = ex;
        }
        __CLR4_5_21gvv1gvvlusvnck6.R.inc(68721);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gvv1gvvlusvnck6.R.flushNeeded();}}
}
