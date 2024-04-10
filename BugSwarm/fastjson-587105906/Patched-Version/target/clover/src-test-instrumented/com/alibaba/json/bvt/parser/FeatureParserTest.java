/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

public class FeatureParserTest extends TestCase {static class __CLR4_5_21g9l1g9llusyjtm0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,67779,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_AllowSingleQuotes_0() throws Exception {__CLR4_5_21g9l1g9llusyjtm0.R.globalSliceStart(getClass().getName(),67737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2am416b1g9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g9l1g9llusyjtm0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g9l1g9llusyjtm0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_AllowSingleQuotes_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67737,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2am416b1g9l() throws Exception{try{__CLR4_5_21g9l1g9llusyjtm0.R.inc(67737);
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67738);DefaultJSONParser parser = new DefaultJSONParser("{'a':3}");
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67739);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67740);JSONObject json = (JSONObject) parser.parse();
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67741);Assert.assertEquals(1, json.size());
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67742);Assert.assertEquals(new Integer(3), (Integer) json.getInteger("a"));
    }finally{__CLR4_5_21g9l1g9llusyjtm0.R.flushNeeded();}}

    public void test_AllowSingleQuotes_1() throws Exception {__CLR4_5_21g9l1g9llusyjtm0.R.globalSliceStart(getClass().getName(),67743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dv3zys1g9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g9l1g9llusyjtm0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g9l1g9llusyjtm0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_AllowSingleQuotes_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67743,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dv3zys1g9r() throws Exception{try{__CLR4_5_21g9l1g9llusyjtm0.R.inc(67743);
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67744);DefaultJSONParser parser = new DefaultJSONParser("{'a':'3'}");
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67745);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67746);JSONObject json = (JSONObject) parser.parse();
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67747);Assert.assertEquals(1, json.size());
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67748);Assert.assertEquals("3", (String) json.get("a"));
    }finally{__CLR4_5_21g9l1g9llusyjtm0.R.flushNeeded();}}

    public void test_AllowUnQuotedFieldNames_0() throws Exception {__CLR4_5_21g9l1g9llusyjtm0.R.globalSliceStart(getClass().getName(),67749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yn89x91g9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g9l1g9llusyjtm0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g9l1g9llusyjtm0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_AllowUnQuotedFieldNames_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67749,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yn89x91g9x() throws Exception{try{__CLR4_5_21g9l1g9llusyjtm0.R.inc(67749);
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67750);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67751);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67752);JSONObject json = (JSONObject) parser.parse();
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67753);Assert.assertEquals(1, json.size());
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67754);Assert.assertEquals(new Integer(3), (Integer) json.getInteger("a"));
    }finally{__CLR4_5_21g9l1g9llusyjtm0.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_5_21g9l1g9llusyjtm0.R.globalSliceStart(getClass().getName(),67755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1ga3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g9l1g9llusyjtm0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g9l1g9llusyjtm0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67755,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1ga3() throws Exception{try{__CLR4_5_21g9l1g9llusyjtm0.R.inc(67755);
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67756);JSONException error = null;
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67757);try {
            __CLR4_5_21g9l1g9llusyjtm0.R.inc(67758);DefaultJSONParser parser = new DefaultJSONParser("{'a':3}");
            __CLR4_5_21g9l1g9llusyjtm0.R.inc(67759);parser.config(Feature.AllowSingleQuotes, false);
            __CLR4_5_21g9l1g9llusyjtm0.R.inc(67760);parser.parse();
        } catch (JSONException e) {
            __CLR4_5_21g9l1g9llusyjtm0.R.inc(67761);error = e;
        }
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67762);Assert.assertNotNull(error);
    }finally{__CLR4_5_21g9l1g9llusyjtm0.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21g9l1g9llusyjtm0.R.globalSliceStart(getClass().getName(),67763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1gab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g9l1g9llusyjtm0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g9l1g9llusyjtm0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67763,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1gab() throws Exception{try{__CLR4_5_21g9l1g9llusyjtm0.R.inc(67763);
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67764);JSONException error = null;
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67765);try {
            __CLR4_5_21g9l1g9llusyjtm0.R.inc(67766);DefaultJSONParser parser = new DefaultJSONParser("{\"a\":'3'}");
            __CLR4_5_21g9l1g9llusyjtm0.R.inc(67767);parser.config(Feature.AllowSingleQuotes, false);
            __CLR4_5_21g9l1g9llusyjtm0.R.inc(67768);parser.parse();
        } catch (JSONException e) {
            __CLR4_5_21g9l1g9llusyjtm0.R.inc(67769);error = e;
        }
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67770);Assert.assertNotNull(error);
    }finally{__CLR4_5_21g9l1g9llusyjtm0.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21g9l1g9llusyjtm0.R.globalSliceStart(getClass().getName(),67771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1gaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g9l1g9llusyjtm0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g9l1g9llusyjtm0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67771,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1gaj() throws Exception{try{__CLR4_5_21g9l1g9llusyjtm0.R.inc(67771);
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67772);JSONException error = null;
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67773);try {
            __CLR4_5_21g9l1g9llusyjtm0.R.inc(67774);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
            __CLR4_5_21g9l1g9llusyjtm0.R.inc(67775);parser.config(Feature.AllowUnQuotedFieldNames, false);
            __CLR4_5_21g9l1g9llusyjtm0.R.inc(67776);parser.parse();
        } catch (JSONException e) {
            __CLR4_5_21g9l1g9llusyjtm0.R.inc(67777);error = e;
        }
        __CLR4_5_21g9l1g9llusyjtm0.R.inc(67778);Assert.assertNotNull(error);
    }finally{__CLR4_5_21g9l1g9llusyjtm0.R.flushNeeded();}}
}
