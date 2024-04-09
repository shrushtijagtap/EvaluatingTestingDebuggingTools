/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

public class FeatureParserTest extends TestCase {static class __CLR4_1_101g9w1g9wlusqkd65{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,67790,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_AllowSingleQuotes_0() throws Exception {__CLR4_1_101g9w1g9wlusqkd65.R.globalSliceStart(getClass().getName(),67748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10am416b1g9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g9w1g9wlusqkd65.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g9w1g9wlusqkd65.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_AllowSingleQuotes_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67748,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10am416b1g9w() throws Exception{try{__CLR4_1_101g9w1g9wlusqkd65.R.inc(67748);
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67749);DefaultJSONParser parser = new DefaultJSONParser("{'a':3}");
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67750);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67751);JSONObject json = (JSONObject) parser.parse();
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67752);Assert.assertEquals(1, json.size());
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67753);Assert.assertEquals(new Integer(3), (Integer) json.getInteger("a"));
    }finally{__CLR4_1_101g9w1g9wlusqkd65.R.flushNeeded();}}

    public void test_AllowSingleQuotes_1() throws Exception {__CLR4_1_101g9w1g9wlusqkd65.R.globalSliceStart(getClass().getName(),67754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dv3zys1ga2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g9w1g9wlusqkd65.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g9w1g9wlusqkd65.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_AllowSingleQuotes_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67754,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dv3zys1ga2() throws Exception{try{__CLR4_1_101g9w1g9wlusqkd65.R.inc(67754);
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67755);DefaultJSONParser parser = new DefaultJSONParser("{'a':'3'}");
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67756);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67757);JSONObject json = (JSONObject) parser.parse();
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67758);Assert.assertEquals(1, json.size());
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67759);Assert.assertEquals("3", (String) json.get("a"));
    }finally{__CLR4_1_101g9w1g9wlusqkd65.R.flushNeeded();}}

    public void test_AllowUnQuotedFieldNames_0() throws Exception {__CLR4_1_101g9w1g9wlusqkd65.R.globalSliceStart(getClass().getName(),67760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yn89x91ga8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g9w1g9wlusqkd65.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g9w1g9wlusqkd65.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_AllowUnQuotedFieldNames_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67760,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yn89x91ga8() throws Exception{try{__CLR4_1_101g9w1g9wlusqkd65.R.inc(67760);
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67761);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67762);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67763);JSONObject json = (JSONObject) parser.parse();
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67764);Assert.assertEquals(1, json.size());
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67765);Assert.assertEquals(new Integer(3), (Integer) json.getInteger("a"));
    }finally{__CLR4_1_101g9w1g9wlusqkd65.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_1_101g9w1g9wlusqkd65.R.globalSliceStart(getClass().getName(),67766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1gae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g9w1g9wlusqkd65.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g9w1g9wlusqkd65.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67766,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1gae() throws Exception{try{__CLR4_1_101g9w1g9wlusqkd65.R.inc(67766);
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67767);JSONException error = null;
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67768);try {
            __CLR4_1_101g9w1g9wlusqkd65.R.inc(67769);DefaultJSONParser parser = new DefaultJSONParser("{'a':3}");
            __CLR4_1_101g9w1g9wlusqkd65.R.inc(67770);parser.config(Feature.AllowSingleQuotes, false);
            __CLR4_1_101g9w1g9wlusqkd65.R.inc(67771);parser.parse();
        } catch (JSONException e) {
            __CLR4_1_101g9w1g9wlusqkd65.R.inc(67772);error = e;
        }
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67773);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g9w1g9wlusqkd65.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101g9w1g9wlusqkd65.R.globalSliceStart(getClass().getName(),67774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1gam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g9w1g9wlusqkd65.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g9w1g9wlusqkd65.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67774,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1gam() throws Exception{try{__CLR4_1_101g9w1g9wlusqkd65.R.inc(67774);
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67775);JSONException error = null;
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67776);try {
            __CLR4_1_101g9w1g9wlusqkd65.R.inc(67777);DefaultJSONParser parser = new DefaultJSONParser("{\"a\":'3'}");
            __CLR4_1_101g9w1g9wlusqkd65.R.inc(67778);parser.config(Feature.AllowSingleQuotes, false);
            __CLR4_1_101g9w1g9wlusqkd65.R.inc(67779);parser.parse();
        } catch (JSONException e) {
            __CLR4_1_101g9w1g9wlusqkd65.R.inc(67780);error = e;
        }
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67781);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g9w1g9wlusqkd65.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101g9w1g9wlusqkd65.R.globalSliceStart(getClass().getName(),67782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1gau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g9w1g9wlusqkd65.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g9w1g9wlusqkd65.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67782,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1gau() throws Exception{try{__CLR4_1_101g9w1g9wlusqkd65.R.inc(67782);
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67783);JSONException error = null;
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67784);try {
            __CLR4_1_101g9w1g9wlusqkd65.R.inc(67785);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
            __CLR4_1_101g9w1g9wlusqkd65.R.inc(67786);parser.config(Feature.AllowUnQuotedFieldNames, false);
            __CLR4_1_101g9w1g9wlusqkd65.R.inc(67787);parser.parse();
        } catch (JSONException e) {
            __CLR4_1_101g9w1g9wlusqkd65.R.inc(67788);error = e;
        }
        __CLR4_1_101g9w1g9wlusqkd65.R.inc(67789);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g9w1g9wlusqkd65.R.flushNeeded();}}
}
