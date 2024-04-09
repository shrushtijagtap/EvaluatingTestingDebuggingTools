/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

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

public class DateParserTest extends TestCase {static class __CLR4_5_21g841g84lusvncef{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,67749,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21g841g84lusvncef.R.inc(67684);
        __CLR4_5_21g841g84lusvncef.R.inc(67685);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21g841g84lusvncef.R.inc(67686);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21g841g84lusvncef.R.flushNeeded();}}
    
    public void test_date_new() throws Exception {__CLR4_5_21g841g84lusvncef.R.globalSliceStart(getClass().getName(),67687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aq5lcz1g87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g841g84lusvncef.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g841g84lusvncef.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_new",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67687,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aq5lcz1g87() throws Exception{try{__CLR4_5_21g841g84lusvncef.R.inc(67687);
        __CLR4_5_21g841g84lusvncef.R.inc(67688);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)");

        __CLR4_5_21g841g84lusvncef.R.inc(67689);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_5_21g841g84lusvncef.R.inc(67690);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_5_21g841g84lusvncef.R.inc(67691);parser.close();
    }finally{__CLR4_5_21g841g84lusvncef.R.flushNeeded();}}
    
    public void test_date_new_1() throws Exception {__CLR4_5_21g841g84lusvncef.R.globalSliceStart(getClass().getName(),67692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cwrj6d1g8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g841g84lusvncef.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g841g84lusvncef.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_new_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67692,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cwrj6d1g8c() throws Exception{try{__CLR4_5_21g841g84lusvncef.R.inc(67692);
        __CLR4_5_21g841g84lusvncef.R.inc(67693);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)");

        __CLR4_5_21g841g84lusvncef.R.inc(67694);java.util.Date date = (java.util.Date) parser.parse();

        __CLR4_5_21g841g84lusvncef.R.inc(67695);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_5_21g841g84lusvncef.R.inc(67696);parser.close();
    }finally{__CLR4_5_21g841g84lusvncef.R.flushNeeded();}}
    
    public void test_date_0() throws Exception {__CLR4_5_21g841g84lusvncef.R.globalSliceStart(getClass().getName(),67697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mw8ah91g8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g841g84lusvncef.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g841g84lusvncef.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67697,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mw8ah91g8h() throws Exception{try{__CLR4_5_21g841g84lusvncef.R.inc(67697);
        __CLR4_5_21g841g84lusvncef.R.inc(67698);DefaultJSONParser parser = new DefaultJSONParser("1294552193254");

        __CLR4_5_21g841g84lusvncef.R.inc(67699);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_5_21g841g84lusvncef.R.inc(67700);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_5_21g841g84lusvncef.R.inc(67701);parser.close();
    }finally{__CLR4_5_21g841g84lusvncef.R.flushNeeded();}}

    public void test_date_1() throws Exception {__CLR4_5_21g841g84lusvncef.R.globalSliceStart(getClass().getName(),67702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jn8bos1g8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g841g84lusvncef.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g841g84lusvncef.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67702,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jn8bos1g8m() throws Exception{try{__CLR4_5_21g841g84lusvncef.R.inc(67702);
        __CLR4_5_21g841g84lusvncef.R.inc(67703);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21g841g84lusvncef.R.inc(67704);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21g841g84lusvncef.R.inc(67705);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53.254\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21g841g84lusvncef.R.inc(67706);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_5_21g841g84lusvncef.R.inc(67707);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_5_21g841g84lusvncef.R.inc(67708);parser.close();
    }finally{__CLR4_5_21g841g84lusvncef.R.flushNeeded();}}

    public void test_date_2() throws Exception {__CLR4_5_21g841g84lusvncef.R.globalSliceStart(getClass().getName(),67709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ge8cwb1g8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g841g84lusvncef.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g841g84lusvncef.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67709,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ge8cwb1g8t() throws Exception{try{__CLR4_5_21g841g84lusvncef.R.inc(67709);
        __CLR4_5_21g841g84lusvncef.R.inc(67710);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21g841g84lusvncef.R.inc(67711);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21g841g84lusvncef.R.inc(67712);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_5_21g841g84lusvncef.R.inc(67713);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_5_21g841g84lusvncef.R.inc(67714);parser.close();
    }finally{__CLR4_5_21g841g84lusvncef.R.flushNeeded();}}

    public void test_date_3() throws Exception {__CLR4_5_21g841g84lusvncef.R.globalSliceStart(getClass().getName(),67715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d58e3u1g8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g841g84lusvncef.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g841g84lusvncef.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67715,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d58e3u1g8z() throws Exception{try{__CLR4_5_21g841g84lusvncef.R.inc(67715);
        __CLR4_5_21g841g84lusvncef.R.inc(67716);java.util.Date date = JSON.parseObject("\"2011-01-09T13:49:53\"", java.util.Date.class, Feature.AllowISO8601DateFormat);

        __CLR4_5_21g841g84lusvncef.R.inc(67717);Assert.assertEquals(new java.util.Date(1294552193000L), date);
    }finally{__CLR4_5_21g841g84lusvncef.R.flushNeeded();}}

    public void test_date_4() throws Exception {__CLR4_5_21g841g84lusvncef.R.globalSliceStart(getClass().getName(),67718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29w8fbd1g92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g841g84lusvncef.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g841g84lusvncef.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29w8fbd1g92() throws Exception{try{__CLR4_5_21g841g84lusvncef.R.inc(67718);
        __CLR4_5_21g841g84lusvncef.R.inc(67719);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21g841g84lusvncef.R.inc(67720);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21g841g84lusvncef.R.inc(67721);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21g841g84lusvncef.R.inc(67722);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_5_21g841g84lusvncef.R.inc(67723);Assert.assertEquals(new java.util.Date(1294502400000L), date);
        __CLR4_5_21g841g84lusvncef.R.inc(67724);parser.close();
    }finally{__CLR4_5_21g841g84lusvncef.R.flushNeeded();}}

    public void test_date_5() throws Exception {__CLR4_5_21g841g84lusvncef.R.globalSliceStart(getClass().getName(),67725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26n8giw1g99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g841g84lusvncef.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g841g84lusvncef.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67725,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26n8giw1g99() throws Exception{try{__CLR4_5_21g841g84lusvncef.R.inc(67725);
        __CLR4_5_21g841g84lusvncef.R.inc(67726);JSONObject object = JSON.parseObject("{d:'2011-01-09T13:49:53'}", Feature.AllowISO8601DateFormat);
        __CLR4_5_21g841g84lusvncef.R.inc(67727);Assert.assertEquals(new java.util.Date(1294552193000L), object.get("d"));
    }finally{__CLR4_5_21g841g84lusvncef.R.flushNeeded();}}

    public void test_date_6() throws Exception {__CLR4_5_21g841g84lusvncef.R.globalSliceStart(getClass().getName(),67728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23e8hqf1g9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g841g84lusvncef.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g841g84lusvncef.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23e8hqf1g9c() throws Exception{try{__CLR4_5_21g841g84lusvncef.R.inc(67728);
        __CLR4_5_21g841g84lusvncef.R.inc(67729);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21g841g84lusvncef.R.inc(67730);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);

        __CLR4_5_21g841g84lusvncef.R.inc(67731);java.util.Date date = JSON.parseObject("{d:\"2011-01-09T13:49:53\"}", Entity.class, Feature.AllowISO8601DateFormat).getD();

        __CLR4_5_21g841g84lusvncef.R.inc(67732);Assert.assertEquals(new java.util.Date(1294552193000L), date);
    }finally{__CLR4_5_21g841g84lusvncef.R.flushNeeded();}}

    public void test_date_7() throws Exception {__CLR4_5_21g841g84lusvncef.R.globalSliceStart(getClass().getName(),67733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_258ixy1g9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g841g84lusvncef.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g841g84lusvncef.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67733,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_258ixy1g9h() throws Exception{try{__CLR4_5_21g841g84lusvncef.R.inc(67733);
        __CLR4_5_21g841g84lusvncef.R.inc(67734);Entity entity = JSON.parseObject("{d:'2011-01-09T13:49:53'}", Entity.class, Feature.AllowISO8601DateFormat);
        __CLR4_5_21g841g84lusvncef.R.inc(67735);java.util.Date date = entity.getD();

        __CLR4_5_21g841g84lusvncef.R.inc(67736);Assert.assertEquals(new java.util.Date(1294552193000L), date);
    }finally{__CLR4_5_21g841g84lusvncef.R.flushNeeded();}}

    public void test_date_error_0() throws Exception {__CLR4_5_21g841g84lusvncef.R.globalSliceStart(getClass().getName(),67737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2snhhno1g9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g841g84lusvncef.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g841g84lusvncef.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67737,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2snhhno1g9l() throws Exception{try{__CLR4_5_21g841g84lusvncef.R.inc(67737);

        __CLR4_5_21g841g84lusvncef.R.inc(67738);JSONException error = null;
        __CLR4_5_21g841g84lusvncef.R.inc(67739);try {
            __CLR4_5_21g841g84lusvncef.R.inc(67740);DefaultJSONParser parser = new DefaultJSONParser("true");

            __CLR4_5_21g841g84lusvncef.R.inc(67741);parser.parseObject(java.util.Date.class);
            __CLR4_5_21g841g84lusvncef.R.inc(67742);parser.close();
        } catch (JSONException e) {
            __CLR4_5_21g841g84lusvncef.R.inc(67743);error = e;
        }
        __CLR4_5_21g841g84lusvncef.R.inc(67744);Assert.assertNotNull(error);
    }finally{__CLR4_5_21g841g84lusvncef.R.flushNeeded();}}

    public static class Entity {

        private Date d;

        public Date getD() {try{__CLR4_5_21g841g84lusvncef.R.inc(67745);
            __CLR4_5_21g841g84lusvncef.R.inc(67746);return d;
        }finally{__CLR4_5_21g841g84lusvncef.R.flushNeeded();}}

        public void setD(Date d) {try{__CLR4_5_21g841g84lusvncef.R.inc(67747);
            __CLR4_5_21g841g84lusvncef.R.inc(67748);this.d = d;
        }finally{__CLR4_5_21g841g84lusvncef.R.flushNeeded();}}

    }
}
