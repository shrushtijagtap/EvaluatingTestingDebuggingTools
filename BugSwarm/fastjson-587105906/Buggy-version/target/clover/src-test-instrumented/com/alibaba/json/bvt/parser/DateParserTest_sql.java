/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

@SuppressWarnings("deprecation")
public class DateParserTest_sql extends TestCase {static class __CLR4_1_101fc01fc0lusqkcy9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,66560,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void f_test_date_0() throws Exception {try{__CLR4_1_101fc01fc0lusqkcy9.R.inc(66528);
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66529);DefaultJSONParser parser = new DefaultJSONParser("1294552193254");

        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66530);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66531);Assert.assertEquals(new java.sql.Date(1294552193254L), date);
        
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66532);parser.close();
    }finally{__CLR4_1_101fc01fc0lusqkcy9.R.flushNeeded();}}

    public void test_date_1() throws Exception {__CLR4_1_101fc01fc0lusqkcy9.R.globalSliceStart(getClass().getName(),66533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jn8bos1fc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fc01fc0lusqkcy9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fc01fc0lusqkcy9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql.test_date_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66533,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jn8bos1fc5() throws Exception{try{__CLR4_1_101fc01fc0lusqkcy9.R.inc(66533);
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66534);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66535);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66536);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53.254\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66537);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66538);Assert.assertEquals(new java.sql.Date(1294552193254L), date);
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66539);parser.close();
    }finally{__CLR4_1_101fc01fc0lusqkcy9.R.flushNeeded();}}

    public void test_date_2() throws Exception {__CLR4_1_101fc01fc0lusqkcy9.R.globalSliceStart(getClass().getName(),66540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ge8cwb1fcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fc01fc0lusqkcy9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fc01fc0lusqkcy9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql.test_date_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66540,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ge8cwb1fcc() throws Exception{try{__CLR4_1_101fc01fc0lusqkcy9.R.inc(66540);
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66541);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66542);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66543);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66544);Assert.assertEquals(new java.sql.Date(1294552193254L), date);
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66545);parser.close();
    }finally{__CLR4_1_101fc01fc0lusqkcy9.R.flushNeeded();}}

    public void test_date_3() throws Exception {__CLR4_1_101fc01fc0lusqkcy9.R.globalSliceStart(getClass().getName(),66546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d58e3u1fci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fc01fc0lusqkcy9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fc01fc0lusqkcy9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql.test_date_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66546,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d58e3u1fci() throws Exception{try{__CLR4_1_101fc01fc0lusqkcy9.R.inc(66546);
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66547);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66548);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66549);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66550);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66551);Assert.assertEquals(new java.sql.Date(1294552193000L), date);
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66552);parser.close();
    }finally{__CLR4_1_101fc01fc0lusqkcy9.R.flushNeeded();}}

    public void test_date_4() throws Exception {__CLR4_1_101fc01fc0lusqkcy9.R.globalSliceStart(getClass().getName(),66553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109w8fbd1fcp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fc01fc0lusqkcy9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fc01fc0lusqkcy9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql.test_date_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66553,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109w8fbd1fcp() throws Exception{try{__CLR4_1_101fc01fc0lusqkcy9.R.inc(66553);
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66554);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66555);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66556);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66557);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66558);Assert.assertEquals(new java.sql.Date(1294502400000L), date);
        __CLR4_1_101fc01fc0lusqkcy9.R.inc(66559);parser.close();
    }finally{__CLR4_1_101fc01fc0lusqkcy9.R.flushNeeded();}}
}
