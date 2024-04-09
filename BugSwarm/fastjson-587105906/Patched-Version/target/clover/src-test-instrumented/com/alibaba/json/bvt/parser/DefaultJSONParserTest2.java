/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

public class DefaultJSONParserTest2 extends TestCase {static class __CLR4_5_21h2u1h2ulusvncky{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,68830,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21h2u1h2ulusvncky.R.globalSliceStart(getClass().getName(),68790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21h2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h2u1h2ulusvncky.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h2u1h2ulusvncky.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68790,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21h2u() throws Exception{try{__CLR4_5_21h2u1h2ulusvncky.R.inc(68790);
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68791);String text = "{}";
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68792);Map map = (Map) JSON.parse(text);
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68793);Assert.assertEquals(0, map.size());
    }finally{__CLR4_5_21h2u1h2ulusvncky.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21h2u1h2ulusvncky.R.globalSliceStart(getClass().getName(),68794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1h2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h2u1h2ulusvncky.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h2u1h2ulusvncky.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest2.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68794,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1h2y() throws Exception{try{__CLR4_5_21h2u1h2ulusvncky.R.inc(68794);
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68795);JSONException error = null;
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68796);try {
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68797);String text = "{}a";
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68798);Map map = (Map) JSON.parse(text);
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68799);Assert.assertEquals(0, map.size());
        } catch (JSONException e) {
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68800);error = e;
        }
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68801);Assert.assertNotNull(error);
    }finally{__CLR4_5_21h2u1h2ulusvncky.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21h2u1h2ulusvncky.R.globalSliceStart(getClass().getName(),68802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441h36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h2u1h2ulusvncky.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h2u1h2ulusvncky.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest2.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68802,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441h36() throws Exception{try{__CLR4_5_21h2u1h2ulusvncky.R.inc(68802);
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68803);JSONException error = null;
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68804);try {
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68805);DefaultJSONParser parser = new DefaultJSONParser("{'a'3}");
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68806);parser.config(Feature.AllowSingleQuotes, true);
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68807);parser.parse();
        } catch (JSONException e) {
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68808);error = e;
        }
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68809);Assert.assertNotNull(error);
    }finally{__CLR4_5_21h2u1h2ulusvncky.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21h2u1h2ulusvncky.R.globalSliceStart(getClass().getName(),68810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1h3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h2u1h2ulusvncky.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h2u1h2ulusvncky.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest2.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1h3e() throws Exception{try{__CLR4_5_21h2u1h2ulusvncky.R.inc(68810);
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68811);JSONException error = null;
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68812);try {
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68813);DefaultJSONParser parser = new DefaultJSONParser("{a 3}");
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68814);parser.config(Feature.AllowUnQuotedFieldNames, true);
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68815);parser.parse();
        } catch (JSONException e) {
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68816);error = e;
        }
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68817);Assert.assertNotNull(error);
    }finally{__CLR4_5_21h2u1h2ulusvncky.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21h2u1h2ulusvncky.R.globalSliceStart(getClass().getName(),68818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61h3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h2u1h2ulusvncky.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h2u1h2ulusvncky.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest2.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68818,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61h3m() throws Exception{try{__CLR4_5_21h2u1h2ulusvncky.R.inc(68818);
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68819);JSONException error = null;
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68820);try {
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68821);DefaultJSONParser parser = new DefaultJSONParser("{");
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68822);parser.config(Feature.AllowUnQuotedFieldNames, true);
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68823);parser.parse();
        } catch (JSONException e) {
            __CLR4_5_21h2u1h2ulusvncky.R.inc(68824);error = e;
        }
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68825);Assert.assertNotNull(error);
    }finally{__CLR4_5_21h2u1h2ulusvncky.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21h2u1h2ulusvncky.R.globalSliceStart(getClass().getName(),68826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1h3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h2u1h2ulusvncky.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h2u1h2ulusvncky.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest2.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68826,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1h3u() throws Exception{try{__CLR4_5_21h2u1h2ulusvncky.R.inc(68826);
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68827);DefaultJSONParser parser = new DefaultJSONParser("{}");
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68828);Map map = parser.parseObject();
        __CLR4_5_21h2u1h2ulusvncky.R.inc(68829);Assert.assertEquals(0, map.size());
    }finally{__CLR4_5_21h2u1h2ulusvncky.R.flushNeeded();}}
}
