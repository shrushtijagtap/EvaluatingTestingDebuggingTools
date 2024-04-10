/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.stream;

import java.math.BigDecimal;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;

public class JSONReaderScannerTest_negative extends TestCase {static class __CLR4_5_21o1e1o1elusyjug9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,77834,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_double() throws Exception {__CLR4_5_21o1e1o1elusyjug9.R.globalSliceStart(getClass().getName(),77810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oq25yd1o1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o1e1o1elusyjug9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o1e1o1elusyjug9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReaderScannerTest_negative.test_double",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oq25yd1o1e() throws Exception{try{__CLR4_5_21o1e1o1elusyjug9.R.inc(77810);
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77811);char[] chars = "{\"value\":-3.5D}".toCharArray();
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77812);DefaultJSONParser parser = new DefaultJSONParser(new JSONReaderScanner(chars, chars.length));
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77813);JSONObject json = parser.parseObject();
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77814);Assert.assertTrue(-3.5D == ((Double) json.get("value")).doubleValue());
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77815);parser.close();
    }finally{__CLR4_5_21o1e1o1elusyjug9.R.flushNeeded();}}

    public void test_float() throws Exception {__CLR4_5_21o1e1o1elusyjug9.R.globalSliceStart(getClass().getName(),77816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t1l4bu1o1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o1e1o1elusyjug9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o1e1o1elusyjug9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReaderScannerTest_negative.test_float",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77816,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t1l4bu1o1k() throws Exception{try{__CLR4_5_21o1e1o1elusyjug9.R.inc(77816);
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77817);char[] chars = "{\"value\":-3.5F}".toCharArray();
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77818);DefaultJSONParser parser = new DefaultJSONParser(new JSONReaderScanner(chars, chars.length));
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77819);JSONObject json = parser.parseObject();
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77820);Assert.assertTrue(-3.5F == ((Float) json.get("value")).doubleValue());
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77821);parser.close();
    }finally{__CLR4_5_21o1e1o1elusyjug9.R.flushNeeded();}}

    public void test_decimal() throws Exception {__CLR4_5_21o1e1o1elusyjug9.R.globalSliceStart(getClass().getName(),77822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f2trhn1o1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o1e1o1elusyjug9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o1e1o1elusyjug9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReaderScannerTest_negative.test_decimal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77822,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f2trhn1o1q() throws Exception{try{__CLR4_5_21o1e1o1elusyjug9.R.inc(77822);
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77823);char[] chars = "{\"value\":-3.5}".toCharArray();
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77824);DefaultJSONParser parser = new DefaultJSONParser(new JSONReaderScanner(chars, chars.length));
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77825);JSONObject json = parser.parseObject();
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77826);Assert.assertEquals(new BigDecimal("-3.5"), json.get("value"));
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77827);parser.close();
    }finally{__CLR4_5_21o1e1o1elusyjug9.R.flushNeeded();}}
    
    public void test_long() throws Exception {__CLR4_5_21o1e1o1elusyjug9.R.globalSliceStart(getClass().getName(),77828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eplvzk1o1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o1e1o1elusyjug9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o1e1o1elusyjug9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReaderScannerTest_negative.test_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77828,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eplvzk1o1w() throws Exception{try{__CLR4_5_21o1e1o1elusyjug9.R.inc(77828);
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77829);char[] chars = "{\"value\":-3L}".toCharArray();
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77830);DefaultJSONParser parser = new DefaultJSONParser(new JSONReaderScanner(chars, chars.length));
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77831);JSONObject json = parser.parseObject();
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77832);Assert.assertTrue(-3L == ((Long) json.get("value")).longValue());
        __CLR4_5_21o1e1o1elusyjug9.R.inc(77833);parser.close();
    }finally{__CLR4_5_21o1e1o1elusyjug9.R.flushNeeded();}}
}
