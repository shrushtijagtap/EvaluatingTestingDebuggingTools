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

public class DateParserTest extends TestCase {static class __CLR4_5_21f9w1f9wlusyjtju{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,66517,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21f9w1f9wlusyjtju.R.inc(66452);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66453);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66454);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21f9w1f9wlusyjtju.R.flushNeeded();}}
    
    public void test_date_new() throws Exception {__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceStart(getClass().getName(),66455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aq5lcz1f9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f9w1f9wlusyjtju.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_new",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aq5lcz1f9z() throws Exception{try{__CLR4_5_21f9w1f9wlusyjtju.R.inc(66455);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66456);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)");

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66457);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66458);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66459);parser.close();
    }finally{__CLR4_5_21f9w1f9wlusyjtju.R.flushNeeded();}}
    
    public void test_date_new_1() throws Exception {__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceStart(getClass().getName(),66460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cwrj6d1fa4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f9w1f9wlusyjtju.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_new_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66460,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cwrj6d1fa4() throws Exception{try{__CLR4_5_21f9w1f9wlusyjtju.R.inc(66460);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66461);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)");

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66462);java.util.Date date = (java.util.Date) parser.parse();

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66463);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66464);parser.close();
    }finally{__CLR4_5_21f9w1f9wlusyjtju.R.flushNeeded();}}
    
    public void test_date_0() throws Exception {__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceStart(getClass().getName(),66465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mw8ah91fa9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f9w1f9wlusyjtju.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66465,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mw8ah91fa9() throws Exception{try{__CLR4_5_21f9w1f9wlusyjtju.R.inc(66465);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66466);DefaultJSONParser parser = new DefaultJSONParser("1294552193254");

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66467);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66468);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66469);parser.close();
    }finally{__CLR4_5_21f9w1f9wlusyjtju.R.flushNeeded();}}

    public void test_date_1() throws Exception {__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceStart(getClass().getName(),66470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jn8bos1fae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f9w1f9wlusyjtju.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66470,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jn8bos1fae() throws Exception{try{__CLR4_5_21f9w1f9wlusyjtju.R.inc(66470);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66471);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66472);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66473);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53.254\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66474);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66475);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66476);parser.close();
    }finally{__CLR4_5_21f9w1f9wlusyjtju.R.flushNeeded();}}

    public void test_date_2() throws Exception {__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceStart(getClass().getName(),66477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ge8cwb1fal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f9w1f9wlusyjtju.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66477,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ge8cwb1fal() throws Exception{try{__CLR4_5_21f9w1f9wlusyjtju.R.inc(66477);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66478);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66479);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66480);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66481);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66482);parser.close();
    }finally{__CLR4_5_21f9w1f9wlusyjtju.R.flushNeeded();}}

    public void test_date_3() throws Exception {__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceStart(getClass().getName(),66483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d58e3u1far();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f9w1f9wlusyjtju.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66483,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d58e3u1far() throws Exception{try{__CLR4_5_21f9w1f9wlusyjtju.R.inc(66483);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66484);java.util.Date date = JSON.parseObject("\"2011-01-09T13:49:53\"", java.util.Date.class, Feature.AllowISO8601DateFormat);

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66485);Assert.assertEquals(new java.util.Date(1294552193000L), date);
    }finally{__CLR4_5_21f9w1f9wlusyjtju.R.flushNeeded();}}

    public void test_date_4() throws Exception {__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceStart(getClass().getName(),66486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29w8fbd1fau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f9w1f9wlusyjtju.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29w8fbd1fau() throws Exception{try{__CLR4_5_21f9w1f9wlusyjtju.R.inc(66486);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66487);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66488);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66489);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66490);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66491);Assert.assertEquals(new java.util.Date(1294502400000L), date);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66492);parser.close();
    }finally{__CLR4_5_21f9w1f9wlusyjtju.R.flushNeeded();}}

    public void test_date_5() throws Exception {__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceStart(getClass().getName(),66493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26n8giw1fb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f9w1f9wlusyjtju.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66493,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26n8giw1fb1() throws Exception{try{__CLR4_5_21f9w1f9wlusyjtju.R.inc(66493);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66494);JSONObject object = JSON.parseObject("{d:'2011-01-09T13:49:53'}", Feature.AllowISO8601DateFormat);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66495);Assert.assertEquals(new java.util.Date(1294552193000L), object.get("d"));
    }finally{__CLR4_5_21f9w1f9wlusyjtju.R.flushNeeded();}}

    public void test_date_6() throws Exception {__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceStart(getClass().getName(),66496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23e8hqf1fb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f9w1f9wlusyjtju.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23e8hqf1fb4() throws Exception{try{__CLR4_5_21f9w1f9wlusyjtju.R.inc(66496);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66497);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66498);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66499);java.util.Date date = JSON.parseObject("{d:\"2011-01-09T13:49:53\"}", Entity.class, Feature.AllowISO8601DateFormat).getD();

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66500);Assert.assertEquals(new java.util.Date(1294552193000L), date);
    }finally{__CLR4_5_21f9w1f9wlusyjtju.R.flushNeeded();}}

    public void test_date_7() throws Exception {__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceStart(getClass().getName(),66501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_258ixy1fb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f9w1f9wlusyjtju.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66501,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_258ixy1fb9() throws Exception{try{__CLR4_5_21f9w1f9wlusyjtju.R.inc(66501);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66502);Entity entity = JSON.parseObject("{d:'2011-01-09T13:49:53'}", Entity.class, Feature.AllowISO8601DateFormat);
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66503);java.util.Date date = entity.getD();

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66504);Assert.assertEquals(new java.util.Date(1294552193000L), date);
    }finally{__CLR4_5_21f9w1f9wlusyjtju.R.flushNeeded();}}

    public void test_date_error_0() throws Exception {__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceStart(getClass().getName(),66505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2snhhno1fbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f9w1f9wlusyjtju.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f9w1f9wlusyjtju.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66505,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2snhhno1fbd() throws Exception{try{__CLR4_5_21f9w1f9wlusyjtju.R.inc(66505);

        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66506);JSONException error = null;
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66507);try {
            __CLR4_5_21f9w1f9wlusyjtju.R.inc(66508);DefaultJSONParser parser = new DefaultJSONParser("true");

            __CLR4_5_21f9w1f9wlusyjtju.R.inc(66509);parser.parseObject(java.util.Date.class);
            __CLR4_5_21f9w1f9wlusyjtju.R.inc(66510);parser.close();
        } catch (JSONException e) {
            __CLR4_5_21f9w1f9wlusyjtju.R.inc(66511);error = e;
        }
        __CLR4_5_21f9w1f9wlusyjtju.R.inc(66512);Assert.assertNotNull(error);
    }finally{__CLR4_5_21f9w1f9wlusyjtju.R.flushNeeded();}}

    public static class Entity {

        private Date d;

        public Date getD() {try{__CLR4_5_21f9w1f9wlusyjtju.R.inc(66513);
            __CLR4_5_21f9w1f9wlusyjtju.R.inc(66514);return d;
        }finally{__CLR4_5_21f9w1f9wlusyjtju.R.flushNeeded();}}

        public void setD(Date d) {try{__CLR4_5_21f9w1f9wlusyjtju.R.inc(66515);
            __CLR4_5_21f9w1f9wlusyjtju.R.inc(66516);this.d = d;
        }finally{__CLR4_5_21f9w1f9wlusyjtju.R.flushNeeded();}}

    }
}
