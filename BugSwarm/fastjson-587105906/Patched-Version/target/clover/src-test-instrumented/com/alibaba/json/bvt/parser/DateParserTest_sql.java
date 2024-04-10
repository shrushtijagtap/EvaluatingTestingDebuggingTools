/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

@SuppressWarnings("deprecation")
public class DateParserTest_sql extends TestCase {static class __CLR4_5_21fbp1fbplusyjtjx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,66549,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void f_test_date_0() throws Exception {try{__CLR4_5_21fbp1fbplusyjtjx.R.inc(66517);
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66518);DefaultJSONParser parser = new DefaultJSONParser("1294552193254");

        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66519);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66520);Assert.assertEquals(new java.sql.Date(1294552193254L), date);
        
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66521);parser.close();
    }finally{__CLR4_5_21fbp1fbplusyjtjx.R.flushNeeded();}}

    public void test_date_1() throws Exception {__CLR4_5_21fbp1fbplusyjtjx.R.globalSliceStart(getClass().getName(),66522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jn8bos1fbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fbp1fbplusyjtjx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fbp1fbplusyjtjx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql.test_date_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jn8bos1fbu() throws Exception{try{__CLR4_5_21fbp1fbplusyjtjx.R.inc(66522);
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66523);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66524);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66525);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53.254\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66526);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66527);Assert.assertEquals(new java.sql.Date(1294552193254L), date);
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66528);parser.close();
    }finally{__CLR4_5_21fbp1fbplusyjtjx.R.flushNeeded();}}

    public void test_date_2() throws Exception {__CLR4_5_21fbp1fbplusyjtjx.R.globalSliceStart(getClass().getName(),66529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ge8cwb1fc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fbp1fbplusyjtjx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fbp1fbplusyjtjx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql.test_date_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66529,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ge8cwb1fc1() throws Exception{try{__CLR4_5_21fbp1fbplusyjtjx.R.inc(66529);
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66530);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66531);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66532);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66533);Assert.assertEquals(new java.sql.Date(1294552193254L), date);
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66534);parser.close();
    }finally{__CLR4_5_21fbp1fbplusyjtjx.R.flushNeeded();}}

    public void test_date_3() throws Exception {__CLR4_5_21fbp1fbplusyjtjx.R.globalSliceStart(getClass().getName(),66535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d58e3u1fc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fbp1fbplusyjtjx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fbp1fbplusyjtjx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql.test_date_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66535,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d58e3u1fc7() throws Exception{try{__CLR4_5_21fbp1fbplusyjtjx.R.inc(66535);
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66536);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66537);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66538);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66539);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66540);Assert.assertEquals(new java.sql.Date(1294552193000L), date);
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66541);parser.close();
    }finally{__CLR4_5_21fbp1fbplusyjtjx.R.flushNeeded();}}

    public void test_date_4() throws Exception {__CLR4_5_21fbp1fbplusyjtjx.R.globalSliceStart(getClass().getName(),66542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29w8fbd1fce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fbp1fbplusyjtjx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fbp1fbplusyjtjx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql.test_date_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66542,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29w8fbd1fce() throws Exception{try{__CLR4_5_21fbp1fbplusyjtjx.R.inc(66542);
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66543);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66544);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66545);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66546);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66547);Assert.assertEquals(new java.sql.Date(1294502400000L), date);
        __CLR4_5_21fbp1fbplusyjtjx.R.inc(66548);parser.close();
    }finally{__CLR4_5_21fbp1fbplusyjtjx.R.flushNeeded();}}
}
