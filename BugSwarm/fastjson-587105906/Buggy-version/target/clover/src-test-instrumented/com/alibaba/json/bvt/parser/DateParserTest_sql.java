/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

@SuppressWarnings("deprecation")
public class DateParserTest_sql extends TestCase {static class __CLR4_1_101ga81ga8luszwc8m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,67792,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void f_test_date_0() throws Exception {try{__CLR4_1_101ga81ga8luszwc8m.R.inc(67760);
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67761);DefaultJSONParser parser = new DefaultJSONParser("1294552193254");

        __CLR4_1_101ga81ga8luszwc8m.R.inc(67762);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_1_101ga81ga8luszwc8m.R.inc(67763);Assert.assertEquals(new java.sql.Date(1294552193254L), date);
        
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67764);parser.close();
    }finally{__CLR4_1_101ga81ga8luszwc8m.R.flushNeeded();}}

    public void test_date_1() throws Exception {__CLR4_1_101ga81ga8luszwc8m.R.globalSliceStart(getClass().getName(),67765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jn8bos1gad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ga81ga8luszwc8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ga81ga8luszwc8m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql.test_date_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67765,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jn8bos1gad() throws Exception{try{__CLR4_1_101ga81ga8luszwc8m.R.inc(67765);
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67766);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67767);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67768);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53.254\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101ga81ga8luszwc8m.R.inc(67769);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_1_101ga81ga8luszwc8m.R.inc(67770);Assert.assertEquals(new java.sql.Date(1294552193254L), date);
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67771);parser.close();
    }finally{__CLR4_1_101ga81ga8luszwc8m.R.flushNeeded();}}

    public void test_date_2() throws Exception {__CLR4_1_101ga81ga8luszwc8m.R.globalSliceStart(getClass().getName(),67772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ge8cwb1gak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ga81ga8luszwc8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ga81ga8luszwc8m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql.test_date_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67772,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ge8cwb1gak() throws Exception{try{__CLR4_1_101ga81ga8luszwc8m.R.inc(67772);
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67773);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67774);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101ga81ga8luszwc8m.R.inc(67775);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_1_101ga81ga8luszwc8m.R.inc(67776);Assert.assertEquals(new java.sql.Date(1294552193254L), date);
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67777);parser.close();
    }finally{__CLR4_1_101ga81ga8luszwc8m.R.flushNeeded();}}

    public void test_date_3() throws Exception {__CLR4_1_101ga81ga8luszwc8m.R.globalSliceStart(getClass().getName(),67778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d58e3u1gaq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ga81ga8luszwc8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ga81ga8luszwc8m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql.test_date_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67778,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d58e3u1gaq() throws Exception{try{__CLR4_1_101ga81ga8luszwc8m.R.inc(67778);
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67779);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67780);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67781);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101ga81ga8luszwc8m.R.inc(67782);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_1_101ga81ga8luszwc8m.R.inc(67783);Assert.assertEquals(new java.sql.Date(1294552193000L), date);
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67784);parser.close();
    }finally{__CLR4_1_101ga81ga8luszwc8m.R.flushNeeded();}}

    public void test_date_4() throws Exception {__CLR4_1_101ga81ga8luszwc8m.R.globalSliceStart(getClass().getName(),67785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109w8fbd1gax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ga81ga8luszwc8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ga81ga8luszwc8m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest_sql.test_date_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67785,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109w8fbd1gax() throws Exception{try{__CLR4_1_101ga81ga8luszwc8m.R.inc(67785);
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67786);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67787);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67788);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101ga81ga8luszwc8m.R.inc(67789);java.sql.Date date = parser.parseObject(java.sql.Date.class);

        __CLR4_1_101ga81ga8luszwc8m.R.inc(67790);Assert.assertEquals(new java.sql.Date(1294502400000L), date);
        __CLR4_1_101ga81ga8luszwc8m.R.inc(67791);parser.close();
    }finally{__CLR4_1_101ga81ga8luszwc8m.R.flushNeeded();}}
}
