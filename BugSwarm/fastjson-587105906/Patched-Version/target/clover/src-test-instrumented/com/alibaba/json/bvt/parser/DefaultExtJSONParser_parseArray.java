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

public class DefaultExtJSONParser_parseArray extends TestCase {static class __CLR4_5_21fxn1fxnlusyjtlh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,67490,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21fxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67307,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21fxn() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67307);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67308);DefaultJSONParser parser = new DefaultJSONParser("[1,2,,,3]");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67309);List list = new ArrayList();
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67310);parser.parseArray(int.class, list);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67311);Assert.assertEquals("[1, 2, 3]", list.toString());
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1fxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67312,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1fxs() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67312);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67313);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3]");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67314);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67315);List list = new ArrayList();
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67316);parser.parseArray(int.class, list);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67317);Assert.assertEquals("[1, 2, 3]", list.toString());
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441fxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67318,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441fxy() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67318);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67319);DefaultJSONParser parser = new DefaultJSONParser("['1','2','3']");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67320);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67321);List list = new ArrayList();
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67322);parser.parseArray(String.class, list);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67323);Assert.assertEquals("[1, 2, 3]", list.toString());
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67324);Assert.assertEquals("1", list.get(0));
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1fy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67325,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1fy5() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67325);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67326);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3]");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67327);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67328);List list = new ArrayList();
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67329);parser.parseArray(BigDecimal.class, list);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67330);Assert.assertEquals("[1, 2, 3]", list.toString());
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67331);Assert.assertEquals(new BigDecimal("1"), list.get(0));
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61fyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67332,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61fyc() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67332);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67333);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3,null]");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67334);parser.config(Feature.AllowArbitraryCommas, true);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67335);List list = new ArrayList();
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67336);parser.parseArray(BigDecimal.class, list);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67337);Assert.assertEquals("[1, 2, 3, null]", list.toString());
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67338);Assert.assertEquals(new BigDecimal("1"), list.get(0));
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1fyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67339,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1fyj() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67339);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67340);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3,null]");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67341);Object[] array = parser.parseArray(new Type[] { Integer.class, BigDecimal.class, Long.class, String.class });
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67342);Assert.assertEquals(new Integer(1), array[0]);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67343);Assert.assertEquals(new BigDecimal("2"), array[1]);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67344);Assert.assertEquals(new Long(3), array[2]);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67345);Assert.assertEquals(null, array[3]);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1fyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67346,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1fyq() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67346);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67347);DefaultJSONParser parser = new DefaultJSONParser("{}");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67348);Exception error = null;
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67349);try {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67350);parser.parseArray(new ArrayList());
        } catch (Exception ex) {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67351);error = ex;
        }
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67352);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81fyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81fyx() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67353);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67354);DefaultJSONParser parser = new DefaultJSONParser("[1.2]");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67355);parser.config(Feature.UseBigDecimal, false);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67356);ArrayList list = new ArrayList();
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67357);parser.parseArray(list);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67358);Assert.assertEquals(Double.valueOf(1.2), list.get(0));
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1fz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67359,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1fz3() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67359);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67360);DefaultJSONParser parser = new DefaultJSONParser("[\"2011-01-09T13:49:53.254\", \"xxx\", true, false, null, {}]");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67361);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67362);ArrayList list = new ArrayList();
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67363);parser.parseArray(list);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67364);Assert.assertEquals(new Date(1294552193254L), list.get(0));
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67365);Assert.assertEquals("xxx", list.get(1));
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67366);Assert.assertEquals(Boolean.TRUE, list.get(2));
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67367);Assert.assertEquals(Boolean.FALSE, list.get(3));
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67368);Assert.assertEquals(null, list.get(4));
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67369);Assert.assertEquals(new JSONObject(), list.get(5));
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1fze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67370,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1fze() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67370);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67371);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53.254\"");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67372);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67373);Object value = parser.parse();
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67374);Assert.assertEquals(new Date(1294552193254L), value);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71fzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67375,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71fzj() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67375);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67376);DefaultJSONParser parser = new DefaultJSONParser("");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67377);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67378);Object value = parser.parse();
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67379);Assert.assertEquals(null, value);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1fzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67380,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1fzo() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67380);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67381);DefaultJSONParser parser = new DefaultJSONParser("{}");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67382);Exception error = null;
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67383);try {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67384);parser.accept(JSONToken.NULL);
        } catch (Exception ex) {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67385);error = ex;
        }
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67386);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1fzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67387,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1fzv() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67387);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67388);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3]");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67389);Object[] array = parser.parseArray(new Type[] { Integer[].class });
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67390);Integer[] values = (Integer[]) array[0];
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67391);Assert.assertEquals(new Integer(1), values[0]);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67392);Assert.assertEquals(new Integer(2), values[1]);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67393);Assert.assertEquals(new Integer(3), values[2]);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1g02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67394,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1g02() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67394);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67395);DefaultJSONParser parser = new DefaultJSONParser("[1]");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67396);Object[] array = parser.parseArray(new Type[] { String.class });
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67397);Assert.assertEquals("1", array[0]);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1g06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1g06() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67398);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67399);DefaultJSONParser parser = new DefaultJSONParser("['1']");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67400);Object[] array = parser.parseArray(new Type[] { int.class });
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67401);Assert.assertEquals(new Integer(1), array[0]);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22comui1g0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67402,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22comui1g0a() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67402);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67403);DefaultJSONParser parser = new DefaultJSONParser("['1']");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67404);Object[] array = parser.parseArray(new Type[] { Integer.class });
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67405);Assert.assertEquals(new Integer(1), array[0]);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbbxz1g0e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67406,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbbxz1g0e() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67406);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67407);DefaultJSONParser parser = new DefaultJSONParser("[]");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67408);Object[] array = parser.parseArray(new Type[] {});
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67409);Assert.assertEquals(0, array.length);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_245baqg1g0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67410,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_245baqg1g0i() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67410);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67411);DefaultJSONParser parser = new DefaultJSONParser("[1,null]");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67412);ArrayList list = new ArrayList();
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67413);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67414);parser.parseArray(String.class, list);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67415);Assert.assertEquals("1", list.get(0));
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67416);Assert.assertEquals(null, list.get(1));
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27eb9ix1g0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67417,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27eb9ix1g0p() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67417);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67418);DefaultJSONParser parser = new DefaultJSONParser("[[1]]");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67419);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67420);Object[] array = parser.parseArray(new Type[] { new TypeReference<List<Integer>>() {
        }.getType() });
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67421);Assert.assertEquals(new Integer(1), ((List<Integer>) (array[0])).get(0));
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2anb8be1g0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67422,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2anb8be1g0u() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67422);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67423);DefaultJSONParser parser = new DefaultJSONParser("[]");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67424);Object[] array = parser.parseArray(new Type[] { Integer[].class });
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67425);Integer[] values = (Integer[]) array[0];
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67426);Assert.assertEquals(0, values.length);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_18() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dwb73v1g0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_18",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dwb73v1g0z() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67427);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67428);DefaultJSONParser parser = new DefaultJSONParser("null");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67429);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67430);List<Integer> list = (List<Integer>) parser.parseArrayWithType(new TypeReference<List<Integer>>() {
        }.getType());
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67431);Assert.assertEquals(null, list);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_error_var() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bmoro61g14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_var",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67432,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bmoro61g14() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67432);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67433);DefaultJSONParser parser = new DefaultJSONParser("[1,2,null }");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67434);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67435);Exception error = null;
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67436);try {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67437);Object[] array = parser.parseArray(new Type[] { Integer[].class });
        } catch (Exception ex) {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67438);error = ex;
        }
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67439);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1g1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67440,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1g1c() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67440);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67441);DefaultJSONParser parser = new DefaultJSONParser("[1,null }");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67442);ArrayList list = new ArrayList();
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67443);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67444);Exception error = null;
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67445);try {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67446);parser.parseArray(String.class, list);
        } catch (Exception ex) {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67447);error = ex;
        }
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67448);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1g1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67449,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1g1l() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67449);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67450);DefaultJSONParser parser = new DefaultJSONParser("[1,null }");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67451);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67452);Exception error = null;
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67453);try {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67454);parser.parseArray(new Type[] { String.class });
        } catch (Exception ex) {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67455);error = ex;
        }
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67456);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81g1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81g1t() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67457);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67458);DefaultJSONParser parser = new DefaultJSONParser("[1,null }");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67459);ArrayList list = new ArrayList();
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67460);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67461);Exception error = null;
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67462);try {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67463);parser.parseArray(String.class, list);
        } catch (Exception ex) {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67464);error = ex;
        }
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67465);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1g22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67466,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1g22() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67466);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67467);DefaultJSONParser parser = new DefaultJSONParser("{1,null }");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67468);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67469);Exception error = null;
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67470);try {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67471);parser.parseArray(new Type[] { String.class });
        } catch (Exception ex) {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67472);error = ex;
        }
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67473);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_error_7() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9rshy1g2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67474,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9rshy1g2a() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67474);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67475);DefaultJSONParser parser = new DefaultJSONParser("{1}");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67476);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67477);Exception error = null;
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67478);try {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67479);parser.parseArray(new Type[] {});
        } catch (Exception ex) {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67480);error = ex;
        }
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67481);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}

    public void test_error_8() throws Exception {__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceStart(getClass().getName(),67482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u0rtph1g2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fxn1fxnlusyjtlh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fxn1fxnlusyjtlh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray.test_error_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u0rtph1g2i() throws Exception{try{__CLR4_5_21fxn1fxnlusyjtlh.R.inc(67482);
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67483);DefaultJSONParser parser = new DefaultJSONParser("[1,2,3 4]");
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67484);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67485);Exception error = null;
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67486);try {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67487);parser.parseArray(new Type[] { Integer.class });
        } catch (Exception ex) {
            __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67488);error = ex;
        }
        __CLR4_5_21fxn1fxnlusyjtlh.R.inc(67489);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fxn1fxnlusyjtlh.R.flushNeeded();}}
}
