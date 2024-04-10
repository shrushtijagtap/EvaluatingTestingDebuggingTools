/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

public class DateParserTest extends TestCase {static class __CLR4_1_101g8f1g8fluszwc8e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,67760,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101g8f1g8fluszwc8e.R.inc(67695);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67696);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67697);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_101g8f1g8fluszwc8e.R.flushNeeded();}}
    
    public void test_date_new() throws Exception {__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceStart(getClass().getName(),67698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aq5lcz1g8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g8f1g8fluszwc8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_new",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67698,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aq5lcz1g8i() throws Exception{try{__CLR4_1_101g8f1g8fluszwc8e.R.inc(67698);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67699);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)");

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67700);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67701);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67702);parser.close();
    }finally{__CLR4_1_101g8f1g8fluszwc8e.R.flushNeeded();}}
    
    public void test_date_new_1() throws Exception {__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceStart(getClass().getName(),67703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cwrj6d1g8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g8f1g8fluszwc8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_new_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67703,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cwrj6d1g8n() throws Exception{try{__CLR4_1_101g8f1g8fluszwc8e.R.inc(67703);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67704);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)");

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67705);java.util.Date date = (java.util.Date) parser.parse();

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67706);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67707);parser.close();
    }finally{__CLR4_1_101g8f1g8fluszwc8e.R.flushNeeded();}}
    
    public void test_date_0() throws Exception {__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceStart(getClass().getName(),67708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mw8ah91g8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g8f1g8fluszwc8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67708,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mw8ah91g8s() throws Exception{try{__CLR4_1_101g8f1g8fluszwc8e.R.inc(67708);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67709);DefaultJSONParser parser = new DefaultJSONParser("1294552193254");

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67710);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67711);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67712);parser.close();
    }finally{__CLR4_1_101g8f1g8fluszwc8e.R.flushNeeded();}}

    public void test_date_1() throws Exception {__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceStart(getClass().getName(),67713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jn8bos1g8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g8f1g8fluszwc8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67713,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jn8bos1g8x() throws Exception{try{__CLR4_1_101g8f1g8fluszwc8e.R.inc(67713);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67714);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67715);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67716);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53.254\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67717);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67718);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67719);parser.close();
    }finally{__CLR4_1_101g8f1g8fluszwc8e.R.flushNeeded();}}

    public void test_date_2() throws Exception {__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceStart(getClass().getName(),67720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ge8cwb1g94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g8f1g8fluszwc8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67720,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ge8cwb1g94() throws Exception{try{__CLR4_1_101g8f1g8fluszwc8e.R.inc(67720);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67721);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67722);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67723);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67724);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67725);parser.close();
    }finally{__CLR4_1_101g8f1g8fluszwc8e.R.flushNeeded();}}

    public void test_date_3() throws Exception {__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceStart(getClass().getName(),67726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d58e3u1g9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g8f1g8fluszwc8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67726,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d58e3u1g9a() throws Exception{try{__CLR4_1_101g8f1g8fluszwc8e.R.inc(67726);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67727);java.util.Date date = JSON.parseObject("\"2011-01-09T13:49:53\"", java.util.Date.class, Feature.AllowISO8601DateFormat);

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67728);Assert.assertEquals(new java.util.Date(1294552193000L), date);
    }finally{__CLR4_1_101g8f1g8fluszwc8e.R.flushNeeded();}}

    public void test_date_4() throws Exception {__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceStart(getClass().getName(),67729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109w8fbd1g9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g8f1g8fluszwc8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67729,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109w8fbd1g9d() throws Exception{try{__CLR4_1_101g8f1g8fluszwc8e.R.inc(67729);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67730);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67731);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67732);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67733);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67734);Assert.assertEquals(new java.util.Date(1294502400000L), date);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67735);parser.close();
    }finally{__CLR4_1_101g8f1g8fluszwc8e.R.flushNeeded();}}

    public void test_date_5() throws Exception {__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceStart(getClass().getName(),67736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106n8giw1g9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g8f1g8fluszwc8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67736,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106n8giw1g9k() throws Exception{try{__CLR4_1_101g8f1g8fluszwc8e.R.inc(67736);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67737);JSONObject object = JSON.parseObject("{d:'2011-01-09T13:49:53'}", Feature.AllowISO8601DateFormat);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67738);Assert.assertEquals(new java.util.Date(1294552193000L), object.get("d"));
    }finally{__CLR4_1_101g8f1g8fluszwc8e.R.flushNeeded();}}

    public void test_date_6() throws Exception {__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceStart(getClass().getName(),67739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103e8hqf1g9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g8f1g8fluszwc8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67739,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103e8hqf1g9n() throws Exception{try{__CLR4_1_101g8f1g8fluszwc8e.R.inc(67739);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67740);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67741);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67742);java.util.Date date = JSON.parseObject("{d:\"2011-01-09T13:49:53\"}", Entity.class, Feature.AllowISO8601DateFormat).getD();

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67743);Assert.assertEquals(new java.util.Date(1294552193000L), date);
    }finally{__CLR4_1_101g8f1g8fluszwc8e.R.flushNeeded();}}

    public void test_date_7() throws Exception {__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceStart(getClass().getName(),67744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1058ixy1g9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g8f1g8fluszwc8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67744,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1058ixy1g9s() throws Exception{try{__CLR4_1_101g8f1g8fluszwc8e.R.inc(67744);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67745);Entity entity = JSON.parseObject("{d:'2011-01-09T13:49:53'}", Entity.class, Feature.AllowISO8601DateFormat);
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67746);java.util.Date date = entity.getD();

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67747);Assert.assertEquals(new java.util.Date(1294552193000L), date);
    }finally{__CLR4_1_101g8f1g8fluszwc8e.R.flushNeeded();}}

    public void test_date_error_0() throws Exception {__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceStart(getClass().getName(),67748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10snhhno1g9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g8f1g8fluszwc8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g8f1g8fluszwc8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67748,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10snhhno1g9w() throws Exception{try{__CLR4_1_101g8f1g8fluszwc8e.R.inc(67748);

        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67749);JSONException error = null;
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67750);try {
            __CLR4_1_101g8f1g8fluszwc8e.R.inc(67751);DefaultJSONParser parser = new DefaultJSONParser("true");

            __CLR4_1_101g8f1g8fluszwc8e.R.inc(67752);parser.parseObject(java.util.Date.class);
            __CLR4_1_101g8f1g8fluszwc8e.R.inc(67753);parser.close();
        } catch (JSONException e) {
            __CLR4_1_101g8f1g8fluszwc8e.R.inc(67754);error = e;
        }
        __CLR4_1_101g8f1g8fluszwc8e.R.inc(67755);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g8f1g8fluszwc8e.R.flushNeeded();}}

    public static class Entity {

        private Date d;

        public Date getD() {try{__CLR4_1_101g8f1g8fluszwc8e.R.inc(67756);
            __CLR4_1_101g8f1g8fluszwc8e.R.inc(67757);return d;
        }finally{__CLR4_1_101g8f1g8fluszwc8e.R.flushNeeded();}}

        public void setD(Date d) {try{__CLR4_1_101g8f1g8fluszwc8e.R.inc(67758);
            __CLR4_1_101g8f1g8fluszwc8e.R.inc(67759);this.d = d;
        }finally{__CLR4_1_101g8f1g8fluszwc8e.R.flushNeeded();}}

    }
}
