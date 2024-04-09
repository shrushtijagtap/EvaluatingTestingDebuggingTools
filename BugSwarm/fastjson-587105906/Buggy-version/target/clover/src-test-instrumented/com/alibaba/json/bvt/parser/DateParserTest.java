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

public class DateParserTest extends TestCase {static class __CLR4_1_101fa71fa7lusqkcxz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,66528,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101fa71fa7lusqkcxz.R.inc(66463);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66464);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66465);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_101fa71fa7lusqkcxz.R.flushNeeded();}}
    
    public void test_date_new() throws Exception {__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceStart(getClass().getName(),66466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aq5lcz1faa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fa71fa7lusqkcxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_new",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66466,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aq5lcz1faa() throws Exception{try{__CLR4_1_101fa71fa7lusqkcxz.R.inc(66466);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66467);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)");

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66468);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66469);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66470);parser.close();
    }finally{__CLR4_1_101fa71fa7lusqkcxz.R.flushNeeded();}}
    
    public void test_date_new_1() throws Exception {__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceStart(getClass().getName(),66471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cwrj6d1faf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fa71fa7lusqkcxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_new_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66471,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cwrj6d1faf() throws Exception{try{__CLR4_1_101fa71fa7lusqkcxz.R.inc(66471);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66472);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)");

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66473);java.util.Date date = (java.util.Date) parser.parse();

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66474);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66475);parser.close();
    }finally{__CLR4_1_101fa71fa7lusqkcxz.R.flushNeeded();}}
    
    public void test_date_0() throws Exception {__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceStart(getClass().getName(),66476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mw8ah91fak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fa71fa7lusqkcxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66476,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mw8ah91fak() throws Exception{try{__CLR4_1_101fa71fa7lusqkcxz.R.inc(66476);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66477);DefaultJSONParser parser = new DefaultJSONParser("1294552193254");

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66478);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66479);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66480);parser.close();
    }finally{__CLR4_1_101fa71fa7lusqkcxz.R.flushNeeded();}}

    public void test_date_1() throws Exception {__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceStart(getClass().getName(),66481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jn8bos1fap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fa71fa7lusqkcxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66481,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jn8bos1fap() throws Exception{try{__CLR4_1_101fa71fa7lusqkcxz.R.inc(66481);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66482);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66483);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66484);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09T13:49:53.254\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66485);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66486);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66487);parser.close();
    }finally{__CLR4_1_101fa71fa7lusqkcxz.R.flushNeeded();}}

    public void test_date_2() throws Exception {__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceStart(getClass().getName(),66488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ge8cwb1faw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fa71fa7lusqkcxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66488,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ge8cwb1faw() throws Exception{try{__CLR4_1_101fa71fa7lusqkcxz.R.inc(66488);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66489);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66490);DefaultJSONParser parser = new DefaultJSONParser("new Date(1294552193254)", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66491);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66492);Assert.assertEquals(new java.util.Date(1294552193254L), date);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66493);parser.close();
    }finally{__CLR4_1_101fa71fa7lusqkcxz.R.flushNeeded();}}

    public void test_date_3() throws Exception {__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceStart(getClass().getName(),66494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d58e3u1fb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fa71fa7lusqkcxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66494,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d58e3u1fb2() throws Exception{try{__CLR4_1_101fa71fa7lusqkcxz.R.inc(66494);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66495);java.util.Date date = JSON.parseObject("\"2011-01-09T13:49:53\"", java.util.Date.class, Feature.AllowISO8601DateFormat);

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66496);Assert.assertEquals(new java.util.Date(1294552193000L), date);
    }finally{__CLR4_1_101fa71fa7lusqkcxz.R.flushNeeded();}}

    public void test_date_4() throws Exception {__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceStart(getClass().getName(),66497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109w8fbd1fb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fa71fa7lusqkcxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66497,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109w8fbd1fb5() throws Exception{try{__CLR4_1_101fa71fa7lusqkcxz.R.inc(66497);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66498);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66499);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66500);DefaultJSONParser parser = new DefaultJSONParser("\"2011-01-09\"", ParserConfig.getGlobalInstance(), features);

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66501);java.util.Date date = parser.parseObject(java.util.Date.class);

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66502);Assert.assertEquals(new java.util.Date(1294502400000L), date);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66503);parser.close();
    }finally{__CLR4_1_101fa71fa7lusqkcxz.R.flushNeeded();}}

    public void test_date_5() throws Exception {__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceStart(getClass().getName(),66504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106n8giw1fbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fa71fa7lusqkcxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66504,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106n8giw1fbc() throws Exception{try{__CLR4_1_101fa71fa7lusqkcxz.R.inc(66504);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66505);JSONObject object = JSON.parseObject("{d:'2011-01-09T13:49:53'}", Feature.AllowISO8601DateFormat);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66506);Assert.assertEquals(new java.util.Date(1294552193000L), object.get("d"));
    }finally{__CLR4_1_101fa71fa7lusqkcxz.R.flushNeeded();}}

    public void test_date_6() throws Exception {__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceStart(getClass().getName(),66507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103e8hqf1fbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fa71fa7lusqkcxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66507,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103e8hqf1fbf() throws Exception{try{__CLR4_1_101fa71fa7lusqkcxz.R.inc(66507);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66508);int features = JSON.DEFAULT_PARSER_FEATURE;
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66509);features = Feature.config(features, Feature.AllowISO8601DateFormat, true);

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66510);java.util.Date date = JSON.parseObject("{d:\"2011-01-09T13:49:53\"}", Entity.class, Feature.AllowISO8601DateFormat).getD();

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66511);Assert.assertEquals(new java.util.Date(1294552193000L), date);
    }finally{__CLR4_1_101fa71fa7lusqkcxz.R.flushNeeded();}}

    public void test_date_7() throws Exception {__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceStart(getClass().getName(),66512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1058ixy1fbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fa71fa7lusqkcxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66512,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1058ixy1fbk() throws Exception{try{__CLR4_1_101fa71fa7lusqkcxz.R.inc(66512);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66513);Entity entity = JSON.parseObject("{d:'2011-01-09T13:49:53'}", Entity.class, Feature.AllowISO8601DateFormat);
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66514);java.util.Date date = entity.getD();

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66515);Assert.assertEquals(new java.util.Date(1294552193000L), date);
    }finally{__CLR4_1_101fa71fa7lusqkcxz.R.flushNeeded();}}

    public void test_date_error_0() throws Exception {__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceStart(getClass().getName(),66516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10snhhno1fbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fa71fa7lusqkcxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fa71fa7lusqkcxz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DateParserTest.test_date_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66516,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10snhhno1fbo() throws Exception{try{__CLR4_1_101fa71fa7lusqkcxz.R.inc(66516);

        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66517);JSONException error = null;
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66518);try {
            __CLR4_1_101fa71fa7lusqkcxz.R.inc(66519);DefaultJSONParser parser = new DefaultJSONParser("true");

            __CLR4_1_101fa71fa7lusqkcxz.R.inc(66520);parser.parseObject(java.util.Date.class);
            __CLR4_1_101fa71fa7lusqkcxz.R.inc(66521);parser.close();
        } catch (JSONException e) {
            __CLR4_1_101fa71fa7lusqkcxz.R.inc(66522);error = e;
        }
        __CLR4_1_101fa71fa7lusqkcxz.R.inc(66523);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fa71fa7lusqkcxz.R.flushNeeded();}}

    public static class Entity {

        private Date d;

        public Date getD() {try{__CLR4_1_101fa71fa7lusqkcxz.R.inc(66524);
            __CLR4_1_101fa71fa7lusqkcxz.R.inc(66525);return d;
        }finally{__CLR4_1_101fa71fa7lusqkcxz.R.flushNeeded();}}

        public void setD(Date d) {try{__CLR4_1_101fa71fa7lusqkcxz.R.inc(66526);
            __CLR4_1_101fa71fa7lusqkcxz.R.inc(66527);this.d = d;
        }finally{__CLR4_1_101fa71fa7lusqkcxz.R.flushNeeded();}}

    }
}
