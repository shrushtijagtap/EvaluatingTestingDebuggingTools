/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

public class DefaultJSONParserTest2 extends TestCase {static class __CLR4_1_101g4x1g4xlusqkd40{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,67609,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101g4x1g4xlusqkd40.R.globalSliceStart(getClass().getName(),67569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21g4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g4x1g4xlusqkd40.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g4x1g4xlusqkd40.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67569,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21g4x() throws Exception{try{__CLR4_1_101g4x1g4xlusqkd40.R.inc(67569);
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67570);String text = "{}";
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67571);Map map = (Map) JSON.parse(text);
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67572);Assert.assertEquals(0, map.size());
    }finally{__CLR4_1_101g4x1g4xlusqkd40.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101g4x1g4xlusqkd40.R.globalSliceStart(getClass().getName(),67573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1g51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g4x1g4xlusqkd40.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g4x1g4xlusqkd40.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67573,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1g51() throws Exception{try{__CLR4_1_101g4x1g4xlusqkd40.R.inc(67573);
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67574);JSONException error = null;
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67575);try {
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67576);String text = "{}a";
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67577);Map map = (Map) JSON.parse(text);
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67578);Assert.assertEquals(0, map.size());
        } catch (JSONException e) {
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67579);error = e;
        }
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67580);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g4x1g4xlusqkd40.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101g4x1g4xlusqkd40.R.globalSliceStart(getClass().getName(),67581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441g59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g4x1g4xlusqkd40.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g4x1g4xlusqkd40.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest2.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67581,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441g59() throws Exception{try{__CLR4_1_101g4x1g4xlusqkd40.R.inc(67581);
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67582);JSONException error = null;
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67583);try {
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67584);DefaultJSONParser parser = new DefaultJSONParser("{'a'3}");
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67585);parser.config(Feature.AllowSingleQuotes, true);
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67586);parser.parse();
        } catch (JSONException e) {
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67587);error = e;
        }
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67588);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g4x1g4xlusqkd40.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101g4x1g4xlusqkd40.R.globalSliceStart(getClass().getName(),67589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1g5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g4x1g4xlusqkd40.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g4x1g4xlusqkd40.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest2.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67589,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1g5h() throws Exception{try{__CLR4_1_101g4x1g4xlusqkd40.R.inc(67589);
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67590);JSONException error = null;
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67591);try {
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67592);DefaultJSONParser parser = new DefaultJSONParser("{a 3}");
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67593);parser.config(Feature.AllowUnQuotedFieldNames, true);
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67594);parser.parse();
        } catch (JSONException e) {
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67595);error = e;
        }
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67596);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g4x1g4xlusqkd40.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101g4x1g4xlusqkd40.R.globalSliceStart(getClass().getName(),67597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61g5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g4x1g4xlusqkd40.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g4x1g4xlusqkd40.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest2.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67597,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61g5p() throws Exception{try{__CLR4_1_101g4x1g4xlusqkd40.R.inc(67597);
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67598);JSONException error = null;
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67599);try {
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67600);DefaultJSONParser parser = new DefaultJSONParser("{");
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67601);parser.config(Feature.AllowUnQuotedFieldNames, true);
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67602);parser.parse();
        } catch (JSONException e) {
            __CLR4_1_101g4x1g4xlusqkd40.R.inc(67603);error = e;
        }
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67604);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g4x1g4xlusqkd40.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101g4x1g4xlusqkd40.R.globalSliceStart(getClass().getName(),67605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1g5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g4x1g4xlusqkd40.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g4x1g4xlusqkd40.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest2.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67605,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1g5x() throws Exception{try{__CLR4_1_101g4x1g4xlusqkd40.R.inc(67605);
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67606);DefaultJSONParser parser = new DefaultJSONParser("{}");
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67607);Map map = parser.parseObject();
        __CLR4_1_101g4x1g4xlusqkd40.R.inc(67608);Assert.assertEquals(0, map.size());
    }finally{__CLR4_1_101g4x1g4xlusqkd40.R.flushNeeded();}}
}
