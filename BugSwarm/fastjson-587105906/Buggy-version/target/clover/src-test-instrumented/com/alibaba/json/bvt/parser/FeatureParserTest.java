/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

public class FeatureParserTest extends TestCase {static class __CLR4_1_101h841h84luszwcei{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,69022,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_AllowSingleQuotes_0() throws Exception {__CLR4_1_101h841h84luszwcei.R.globalSliceStart(getClass().getName(),68980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10am416b1h84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h841h84luszwcei.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h841h84luszwcei.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_AllowSingleQuotes_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68980,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10am416b1h84() throws Exception{try{__CLR4_1_101h841h84luszwcei.R.inc(68980);
        __CLR4_1_101h841h84luszwcei.R.inc(68981);DefaultJSONParser parser = new DefaultJSONParser("{'a':3}");
        __CLR4_1_101h841h84luszwcei.R.inc(68982);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101h841h84luszwcei.R.inc(68983);JSONObject json = (JSONObject) parser.parse();
        __CLR4_1_101h841h84luszwcei.R.inc(68984);Assert.assertEquals(1, json.size());
        __CLR4_1_101h841h84luszwcei.R.inc(68985);Assert.assertEquals(new Integer(3), (Integer) json.getInteger("a"));
    }finally{__CLR4_1_101h841h84luszwcei.R.flushNeeded();}}

    public void test_AllowSingleQuotes_1() throws Exception {__CLR4_1_101h841h84luszwcei.R.globalSliceStart(getClass().getName(),68986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dv3zys1h8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h841h84luszwcei.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h841h84luszwcei.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_AllowSingleQuotes_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68986,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dv3zys1h8a() throws Exception{try{__CLR4_1_101h841h84luszwcei.R.inc(68986);
        __CLR4_1_101h841h84luszwcei.R.inc(68987);DefaultJSONParser parser = new DefaultJSONParser("{'a':'3'}");
        __CLR4_1_101h841h84luszwcei.R.inc(68988);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101h841h84luszwcei.R.inc(68989);JSONObject json = (JSONObject) parser.parse();
        __CLR4_1_101h841h84luszwcei.R.inc(68990);Assert.assertEquals(1, json.size());
        __CLR4_1_101h841h84luszwcei.R.inc(68991);Assert.assertEquals("3", (String) json.get("a"));
    }finally{__CLR4_1_101h841h84luszwcei.R.flushNeeded();}}

    public void test_AllowUnQuotedFieldNames_0() throws Exception {__CLR4_1_101h841h84luszwcei.R.globalSliceStart(getClass().getName(),68992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yn89x91h8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h841h84luszwcei.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h841h84luszwcei.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_AllowUnQuotedFieldNames_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68992,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yn89x91h8g() throws Exception{try{__CLR4_1_101h841h84luszwcei.R.inc(68992);
        __CLR4_1_101h841h84luszwcei.R.inc(68993);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_1_101h841h84luszwcei.R.inc(68994);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101h841h84luszwcei.R.inc(68995);JSONObject json = (JSONObject) parser.parse();
        __CLR4_1_101h841h84luszwcei.R.inc(68996);Assert.assertEquals(1, json.size());
        __CLR4_1_101h841h84luszwcei.R.inc(68997);Assert.assertEquals(new Integer(3), (Integer) json.getInteger("a"));
    }finally{__CLR4_1_101h841h84luszwcei.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_1_101h841h84luszwcei.R.globalSliceStart(getClass().getName(),68998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1h8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h841h84luszwcei.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h841h84luszwcei.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68998,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1h8m() throws Exception{try{__CLR4_1_101h841h84luszwcei.R.inc(68998);
        __CLR4_1_101h841h84luszwcei.R.inc(68999);JSONException error = null;
        __CLR4_1_101h841h84luszwcei.R.inc(69000);try {
            __CLR4_1_101h841h84luszwcei.R.inc(69001);DefaultJSONParser parser = new DefaultJSONParser("{'a':3}");
            __CLR4_1_101h841h84luszwcei.R.inc(69002);parser.config(Feature.AllowSingleQuotes, false);
            __CLR4_1_101h841h84luszwcei.R.inc(69003);parser.parse();
        } catch (JSONException e) {
            __CLR4_1_101h841h84luszwcei.R.inc(69004);error = e;
        }
        __CLR4_1_101h841h84luszwcei.R.inc(69005);Assert.assertNotNull(error);
    }finally{__CLR4_1_101h841h84luszwcei.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101h841h84luszwcei.R.globalSliceStart(getClass().getName(),69006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1h8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h841h84luszwcei.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h841h84luszwcei.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69006,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1h8u() throws Exception{try{__CLR4_1_101h841h84luszwcei.R.inc(69006);
        __CLR4_1_101h841h84luszwcei.R.inc(69007);JSONException error = null;
        __CLR4_1_101h841h84luszwcei.R.inc(69008);try {
            __CLR4_1_101h841h84luszwcei.R.inc(69009);DefaultJSONParser parser = new DefaultJSONParser("{\"a\":'3'}");
            __CLR4_1_101h841h84luszwcei.R.inc(69010);parser.config(Feature.AllowSingleQuotes, false);
            __CLR4_1_101h841h84luszwcei.R.inc(69011);parser.parse();
        } catch (JSONException e) {
            __CLR4_1_101h841h84luszwcei.R.inc(69012);error = e;
        }
        __CLR4_1_101h841h84luszwcei.R.inc(69013);Assert.assertNotNull(error);
    }finally{__CLR4_1_101h841h84luszwcei.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101h841h84luszwcei.R.globalSliceStart(getClass().getName(),69014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1h92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h841h84luszwcei.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h841h84luszwcei.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.FeatureParserTest.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69014,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1h92() throws Exception{try{__CLR4_1_101h841h84luszwcei.R.inc(69014);
        __CLR4_1_101h841h84luszwcei.R.inc(69015);JSONException error = null;
        __CLR4_1_101h841h84luszwcei.R.inc(69016);try {
            __CLR4_1_101h841h84luszwcei.R.inc(69017);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
            __CLR4_1_101h841h84luszwcei.R.inc(69018);parser.config(Feature.AllowUnQuotedFieldNames, false);
            __CLR4_1_101h841h84luszwcei.R.inc(69019);parser.parse();
        } catch (JSONException e) {
            __CLR4_1_101h841h84luszwcei.R.inc(69020);error = e;
        }
        __CLR4_1_101h841h84luszwcei.R.inc(69021);Assert.assertNotNull(error);
    }finally{__CLR4_1_101h841h84luszwcei.R.flushNeeded();}}
}
