/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.User;

public class DefaultExtJSONParserTest_2 extends TestCase {static class __CLR4_1_101fqd1fqdlusqkd1c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,67129,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceStart(getClass().getName(),67045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21fqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqd1fqdlusqkd1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67045,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21fqd() throws Exception{try{__CLR4_1_101fqd1fqdlusqkd1c.R.inc(67045);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67046);DefaultJSONParser parser = new DefaultJSONParser("{'a':3}");
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67047);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67048);A a = parser.parseObject(A.class);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67049);Assert.assertEquals(3, a.getA());
    }finally{__CLR4_1_101fqd1fqdlusqkd1c.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceStart(getClass().getName(),67050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1fqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqd1fqdlusqkd1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67050,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1fqi() throws Exception{try{__CLR4_1_101fqd1fqdlusqkd1c.R.inc(67050);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67051);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67052);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67053);A a = parser.parseObject(A.class);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67054);Assert.assertEquals(3, a.getA());
    }finally{__CLR4_1_101fqd1fqdlusqkd1c.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceStart(getClass().getName(),67055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441fqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqd1fqdlusqkd1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67055,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441fqn() throws Exception{try{__CLR4_1_101fqd1fqdlusqkd1c.R.inc(67055);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67056);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67057);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67058);Map a = parser.parseObject(Map.class);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67059);Assert.assertEquals(3, a.get("a"));
    }finally{__CLR4_1_101fqd1fqdlusqkd1c.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceStart(getClass().getName(),67060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1fqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqd1fqdlusqkd1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67060,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1fqs() throws Exception{try{__CLR4_1_101fqd1fqdlusqkd1c.R.inc(67060);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67061);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67062);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67063);HashMap a = parser.parseObject(HashMap.class);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67064);Assert.assertEquals(3, a.get("a"));
    }finally{__CLR4_1_101fqd1fqdlusqkd1c.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceStart(getClass().getName(),67065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61fqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqd1fqdlusqkd1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67065,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61fqx() throws Exception{try{__CLR4_1_101fqd1fqdlusqkd1c.R.inc(67065);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67066);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67067);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67068);LinkedHashMap a = parser.parseObject(LinkedHashMap.class);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67069);Assert.assertEquals(3, a.get("a"));
    }finally{__CLR4_1_101fqd1fqdlusqkd1c.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceStart(getClass().getName(),67070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1fr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqd1fqdlusqkd1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67070,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1fr2() throws Exception{try{__CLR4_1_101fqd1fqdlusqkd1c.R.inc(67070);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67071);Exception error = null;
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67072);try {
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67073);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123]";
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67074);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67075);parser.parseArray(User.class);
        } catch (Exception ex) {
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67076);error = ex;
        }
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67077);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fqd1fqdlusqkd1c.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceStart(getClass().getName(),67078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1fra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqd1fqdlusqkd1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67078,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1fra() throws Exception{try{__CLR4_1_101fqd1fqdlusqkd1c.R.inc(67078);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67079);JSONException error = null;
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67080);try {
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67081);DefaultJSONParser parser = new DefaultJSONParser("{'a'3}");
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67082);parser.config(Feature.AllowSingleQuotes, true);
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67083);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67084);error = e;
        }
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67085);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fqd1fqdlusqkd1c.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceStart(getClass().getName(),67086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1fri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqd1fqdlusqkd1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67086,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1fri() throws Exception{try{__CLR4_1_101fqd1fqdlusqkd1c.R.inc(67086);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67087);JSONException error = null;
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67088);try {
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67089);DefaultJSONParser parser = new DefaultJSONParser("{a 3}");
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67090);parser.config(Feature.AllowUnQuotedFieldNames, true);
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67091);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67092);error = e;
        }
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67093);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fqd1fqdlusqkd1c.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceStart(getClass().getName(),67094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1frq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqd1fqdlusqkd1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67094,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1frq() throws Exception{try{__CLR4_1_101fqd1fqdlusqkd1c.R.inc(67094);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67095);JSONException error = null;
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67096);try {
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67097);DefaultJSONParser parser = new DefaultJSONParser("{");
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67098);parser.config(Feature.AllowUnQuotedFieldNames, true);
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67099);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67100);error = e;
        }
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67101);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fqd1fqdlusqkd1c.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceStart(getClass().getName(),67102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1fry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqd1fqdlusqkd1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67102,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1fry() throws Exception{try{__CLR4_1_101fqd1fqdlusqkd1c.R.inc(67102);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67103);JSONException error = null;
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67104);try {
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67105);DefaultJSONParser parser = new DefaultJSONParser("{\"a\"3}");
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67106);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67107);error = e;
        }
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67108);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fqd1fqdlusqkd1c.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceStart(getClass().getName(),67109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81fs5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqd1fqdlusqkd1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67109,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81fs5() throws Exception{try{__CLR4_1_101fqd1fqdlusqkd1c.R.inc(67109);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67110);JSONException error = null;
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67111);try {
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67112);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67113);parser.config(Feature.AllowUnQuotedFieldNames, false);
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67114);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67115);error = e;
        }
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67116);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fqd1fqdlusqkd1c.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceStart(getClass().getName(),67117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaop1fsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqd1fqdlusqkd1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqd1fqdlusqkd1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67117,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaop1fsd() throws Exception{try{__CLR4_1_101fqd1fqdlusqkd1c.R.inc(67117);
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67118);JSONException error = null;
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67119);try {
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67120);DefaultJSONParser parser = new DefaultJSONParser("{'a':3}");
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67121);parser.config(Feature.AllowSingleQuotes, false);
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67122);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67123);error = e;
        }
        __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67124);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fqd1fqdlusqkd1c.R.flushNeeded();}}

    public static class A {

        private int a;

        public int getA() {try{__CLR4_1_101fqd1fqdlusqkd1c.R.inc(67125);
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67126);return a;
        }finally{__CLR4_1_101fqd1fqdlusqkd1c.R.flushNeeded();}}

        public void setA(int a) {try{__CLR4_1_101fqd1fqdlusqkd1c.R.inc(67127);
            __CLR4_1_101fqd1fqdlusqkd1c.R.inc(67128);this.a = a;
        }finally{__CLR4_1_101fqd1fqdlusqkd1c.R.flushNeeded();}}

    }

}
