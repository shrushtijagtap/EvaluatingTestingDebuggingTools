/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

@SuppressWarnings("deprecation")
public class DateParserTest_sql_timestamp extends TestCase {static class __CLR4_5_21fcl1fcllusyjtjz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,66584,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21fcl1fcllusyjtjz.R.inc(66549);
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66550);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66551);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21fcl1fcllusyjtjz.R.flushNeeded();}}
    
    public void f_test_date_0() throws Exception {try{__CLR4_5_21fcl1fcllusyjtjz.R.inc(66552);
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66553);DefaultJSONParser parser = new DefaultJSONParser("1294552193254");

        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66554);java.sql.Timestamp date = parser.parseObject(java.sql.Timestamp.class);

        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66555);Assert.assertEquals(new java.sql.Timestamp(1294552193254L), date);
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66556);parser.close();
    }finally{__CLR4_5_21fcl1fcllusyjtjz.R.flushNeeded();}}

    public void test_date_1() throws Exception {__CLR4_5_21fcl1fcllusyjtjz.R.globalSliceStart(getClass().getName(),66557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jn8bos1fct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fcl1fcllusyjtjz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fcl1fcllusyjtjz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql_timestamp.test_date_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66557,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jn8bos1fct() throws Exception{try{__CLR4_5_21fcl1fcllusyjtjz.R.inc(66557);
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66558);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66559);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66560);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53.254\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66561);java.sql.Timestamp date = parser.parseObject(java.sql.Timestamp.class);

        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66562);Assert.assertEquals(new java.sql.Timestamp(1294552193254L), date);
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66563);parser.close();
    }finally{__CLR4_5_21fcl1fcllusyjtjz.R.flushNeeded();}}

    public void test_date_2() throws Exception {__CLR4_5_21fcl1fcllusyjtjz.R.globalSliceStart(getClass().getName(),66564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ge8cwb1fd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fcl1fcllusyjtjz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fcl1fcllusyjtjz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql_timestamp.test_date_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66564,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ge8cwb1fd0() throws Exception{try{__CLR4_5_21fcl1fcllusyjtjz.R.inc(66564);
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66565);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66566);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66567);java.sql.Timestamp date = parser.parseObject(java.sql.Timestamp.class);

        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66568);Assert.assertEquals(new java.sql.Timestamp(1294552193254L), date);
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66569);parser.close();
    }finally{__CLR4_5_21fcl1fcllusyjtjz.R.flushNeeded();}}

    public void test_date_3() throws Exception {__CLR4_5_21fcl1fcllusyjtjz.R.globalSliceStart(getClass().getName(),66570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d58e3u1fd6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fcl1fcllusyjtjz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fcl1fcllusyjtjz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql_timestamp.test_date_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66570,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d58e3u1fd6() throws Exception{try{__CLR4_5_21fcl1fcllusyjtjz.R.inc(66570);
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66571);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66572);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66573);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66574);java.sql.Timestamp date = parser.parseObject(java.sql.Timestamp.class);

        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66575);Assert.assertEquals(new java.sql.Timestamp(1294552193000L), date);
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66576);parser.close();
    }finally{__CLR4_5_21fcl1fcllusyjtjz.R.flushNeeded();}}

    public void test_date_4() throws Exception {__CLR4_5_21fcl1fcllusyjtjz.R.globalSliceStart(getClass().getName(),66577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29w8fbd1fdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fcl1fcllusyjtjz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fcl1fcllusyjtjz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql_timestamp.test_date_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66577,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29w8fbd1fdd() throws Exception{try{__CLR4_5_21fcl1fcllusyjtjz.R.inc(66577);
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66578);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66579);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66580);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66581);java.sql.Timestamp date = parser.parseObject(java.sql.Timestamp.class);

        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66582);Assert.assertEquals(new java.sql.Timestamp(1294502400000L), date);
        __CLR4_5_21fcl1fcllusyjtjz.R.inc(66583);parser.close();
    }finally{__CLR4_5_21fcl1fcllusyjtjz.R.flushNeeded();}}
}
