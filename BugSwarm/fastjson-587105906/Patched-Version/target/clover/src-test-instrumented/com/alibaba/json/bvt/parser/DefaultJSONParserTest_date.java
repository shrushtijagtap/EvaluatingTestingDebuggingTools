/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

public class DefaultJSONParserTest_date extends TestCase {static class __CLR4_5_21g641g64lusyjtls{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,67653,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21g641g64lusyjtls.R.inc(67612);
        __CLR4_5_21g641g64lusyjtls.R.inc(67613);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21g641g64lusyjtls.R.inc(67614);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21g641g64lusyjtls.R.flushNeeded();}}
    
    public void test_date() {__CLR4_5_21g641g64lusyjtls.R.globalSliceStart(getClass().getName(),67615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zi49um1g67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g641g64lusyjtls.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g641g64lusyjtls.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest_date.test_date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67615,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zi49um1g67(){try{__CLR4_5_21g641g64lusyjtls.R.inc(67615);
        __CLR4_5_21g641g64lusyjtls.R.inc(67616);String text = "{\"date\":\"2011-01-09T13:49:53.254\"}";
        __CLR4_5_21g641g64lusyjtls.R.inc(67617);char[] chars = text.toCharArray();
        __CLR4_5_21g641g64lusyjtls.R.inc(67618);DefaultJSONParser parser = new DefaultJSONParser(chars, chars.length, ParserConfig.getGlobalInstance(), 0);
        __CLR4_5_21g641g64lusyjtls.R.inc(67619);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21g641g64lusyjtls.R.inc(67620);JSONObject json = parser.parseObject();
        __CLR4_5_21g641g64lusyjtls.R.inc(67621);Assert.assertEquals(new Date(1294552193254L), json.get("date"));
    }finally{__CLR4_5_21g641g64lusyjtls.R.flushNeeded();}}
    
    
    public void test_date2() {__CLR4_5_21g641g64lusyjtls.R.globalSliceStart(getClass().getName(),67622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ngkvy1g6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g641g64lusyjtls.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g641g64lusyjtls.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest_date.test_date2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67622,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ngkvy1g6e(){try{__CLR4_5_21g641g64lusyjtls.R.inc(67622);
        __CLR4_5_21g641g64lusyjtls.R.inc(67623);String text = "{\"date\":\"xxxxx\"}";
        __CLR4_5_21g641g64lusyjtls.R.inc(67624);char[] chars = text.toCharArray();
        __CLR4_5_21g641g64lusyjtls.R.inc(67625);DefaultJSONParser parser = new DefaultJSONParser(chars, chars.length, ParserConfig.getGlobalInstance(), 0);
        __CLR4_5_21g641g64lusyjtls.R.inc(67626);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21g641g64lusyjtls.R.inc(67627);JSONObject json = parser.parseObject();
        __CLR4_5_21g641g64lusyjtls.R.inc(67628);Assert.assertEquals("xxxxx", json.get("date"));
    }finally{__CLR4_5_21g641g64lusyjtls.R.flushNeeded();}}
    
    public void test_date3() {__CLR4_5_21g641g64lusyjtls.R.globalSliceStart(getClass().getName(),67629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2awgjof1g6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g641g64lusyjtls.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g641g64lusyjtls.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest_date.test_date3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67629,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2awgjof1g6l(){try{__CLR4_5_21g641g64lusyjtls.R.inc(67629);
        __CLR4_5_21g641g64lusyjtls.R.inc(67630);String text = "{\"1234567890abcdefghijklmnopqrst1234567890abcdefghijklmnopqrst1234567890abcdefghijklmnopqrst\\t\":\"xxxxx\"}";
        __CLR4_5_21g641g64lusyjtls.R.inc(67631);char[] chars = text.toCharArray();
        __CLR4_5_21g641g64lusyjtls.R.inc(67632);DefaultJSONParser parser = new DefaultJSONParser(chars, chars.length, ParserConfig.getGlobalInstance(), 0);
        __CLR4_5_21g641g64lusyjtls.R.inc(67633);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21g641g64lusyjtls.R.inc(67634);JSONObject json = parser.parseObject();
        __CLR4_5_21g641g64lusyjtls.R.inc(67635);Assert.assertEquals("xxxxx", json.get("1234567890abcdefghijklmnopqrst1234567890abcdefghijklmnopqrst1234567890abcdefghijklmnopqrst\t"));
    }finally{__CLR4_5_21g641g64lusyjtls.R.flushNeeded();}}
    
    public void test_date4() {__CLR4_5_21g641g64lusyjtls.R.globalSliceStart(getClass().getName(),67636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e5gigw1g6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g641g64lusyjtls.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g641g64lusyjtls.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest_date.test_date4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67636,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e5gigw1g6s(){try{__CLR4_5_21g641g64lusyjtls.R.inc(67636);
        __CLR4_5_21g641g64lusyjtls.R.inc(67637);String text = "{\"1234567890abcdefghijklmnopqrst1234567890abcdefghijklmnopqrst1234567890abcdefghijklmnopqrst1234567890abcdefghijklmnopqrst1234567890abcdefghijklmnopqrst1234567890abcdefghijklmnopqrst\\t\":\"xxxxx\"}";
        __CLR4_5_21g641g64lusyjtls.R.inc(67638);char[] chars = text.toCharArray();
        __CLR4_5_21g641g64lusyjtls.R.inc(67639);DefaultJSONParser parser = new DefaultJSONParser(chars, chars.length, ParserConfig.getGlobalInstance(), 0);
        __CLR4_5_21g641g64lusyjtls.R.inc(67640);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21g641g64lusyjtls.R.inc(67641);JSONObject json = parser.parseObject();
        __CLR4_5_21g641g64lusyjtls.R.inc(67642);Assert.assertEquals("xxxxx", json.get("1234567890abcdefghijklmnopqrst1234567890abcdefghijklmnopqrst1234567890abcdefghijklmnopqrst1234567890abcdefghijklmnopqrst1234567890abcdefghijklmnopqrst1234567890abcdefghijklmnopqrst\t"));
    }finally{__CLR4_5_21g641g64lusyjtls.R.flushNeeded();}}
    
    public void test_dateFormat() throws Exception {__CLR4_5_21g641g64lusyjtls.R.globalSliceStart(getClass().getName(),67643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2br75zt1g6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g641g64lusyjtls.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g641g64lusyjtls.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest_date.test_dateFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67643,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2br75zt1g6z() throws Exception{try{__CLR4_5_21g641g64lusyjtls.R.inc(67643);
        __CLR4_5_21g641g64lusyjtls.R.inc(67644);DefaultJSONParser parser = new DefaultJSONParser("{}");
        __CLR4_5_21g641g64lusyjtls.R.inc(67645);parser.setDateFormat("yyyy-DD-mm");
        
        __CLR4_5_21g641g64lusyjtls.R.inc(67646);SimpleDateFormat format = new SimpleDateFormat("yyyy-DD-mm", JSON.defaultLocale);
        __CLR4_5_21g641g64lusyjtls.R.inc(67647);format.setTimeZone(JSON.defaultTimeZone);
        
        __CLR4_5_21g641g64lusyjtls.R.inc(67648);parser.setDateFomrat(format);
        __CLR4_5_21g641g64lusyjtls.R.inc(67649);parser.getDateFomartPattern();
        __CLR4_5_21g641g64lusyjtls.R.inc(67650);parser.getDateFormat();
        __CLR4_5_21g641g64lusyjtls.R.inc(67651);parser.parse();
        __CLR4_5_21g641g64lusyjtls.R.inc(67652);parser.close();
    }finally{__CLR4_5_21g641g64lusyjtls.R.flushNeeded();}}
}
