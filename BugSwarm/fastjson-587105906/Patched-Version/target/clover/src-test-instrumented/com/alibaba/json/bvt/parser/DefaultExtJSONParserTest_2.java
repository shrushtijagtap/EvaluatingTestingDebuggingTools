/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.User;

public class DefaultExtJSONParserTest_2 extends TestCase {static class __CLR4_5_21fq21fq2lusyjtkt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,67118,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceStart(getClass().getName(),67034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21fq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fq21fq2lusyjtkt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67034,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21fq2() throws Exception{try{__CLR4_5_21fq21fq2lusyjtkt.R.inc(67034);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67035);DefaultJSONParser parser = new DefaultJSONParser("{'a':3}");
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67036);parser.config(Feature.AllowSingleQuotes, true);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67037);A a = parser.parseObject(A.class);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67038);Assert.assertEquals(3, a.getA());
    }finally{__CLR4_5_21fq21fq2lusyjtkt.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceStart(getClass().getName(),67039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1fq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fq21fq2lusyjtkt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67039,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1fq7() throws Exception{try{__CLR4_5_21fq21fq2lusyjtkt.R.inc(67039);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67040);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67041);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67042);A a = parser.parseObject(A.class);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67043);Assert.assertEquals(3, a.getA());
    }finally{__CLR4_5_21fq21fq2lusyjtkt.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceStart(getClass().getName(),67044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441fqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fq21fq2lusyjtkt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67044,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441fqc() throws Exception{try{__CLR4_5_21fq21fq2lusyjtkt.R.inc(67044);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67045);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67046);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67047);Map a = parser.parseObject(Map.class);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67048);Assert.assertEquals(3, a.get("a"));
    }finally{__CLR4_5_21fq21fq2lusyjtkt.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceStart(getClass().getName(),67049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1fqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fq21fq2lusyjtkt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67049,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1fqh() throws Exception{try{__CLR4_5_21fq21fq2lusyjtkt.R.inc(67049);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67050);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67051);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67052);HashMap a = parser.parseObject(HashMap.class);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67053);Assert.assertEquals(3, a.get("a"));
    }finally{__CLR4_5_21fq21fq2lusyjtkt.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceStart(getClass().getName(),67054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61fqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fq21fq2lusyjtkt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67054,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61fqm() throws Exception{try{__CLR4_5_21fq21fq2lusyjtkt.R.inc(67054);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67055);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67056);parser.config(Feature.AllowUnQuotedFieldNames, true);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67057);LinkedHashMap a = parser.parseObject(LinkedHashMap.class);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67058);Assert.assertEquals(3, a.get("a"));
    }finally{__CLR4_5_21fq21fq2lusyjtkt.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceStart(getClass().getName(),67059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1fqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fq21fq2lusyjtkt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1fqr() throws Exception{try{__CLR4_5_21fq21fq2lusyjtkt.R.inc(67059);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67060);Exception error = null;
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67061);try {
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67062);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123]";
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67063);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67064);parser.parseArray(User.class);
        } catch (Exception ex) {
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67065);error = ex;
        }
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67066);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fq21fq2lusyjtkt.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceStart(getClass().getName(),67067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1fqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fq21fq2lusyjtkt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67067,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1fqz() throws Exception{try{__CLR4_5_21fq21fq2lusyjtkt.R.inc(67067);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67068);JSONException error = null;
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67069);try {
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67070);DefaultJSONParser parser = new DefaultJSONParser("{'a'3}");
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67071);parser.config(Feature.AllowSingleQuotes, true);
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67072);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67073);error = e;
        }
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67074);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fq21fq2lusyjtkt.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceStart(getClass().getName(),67075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1fr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fq21fq2lusyjtkt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67075,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1fr7() throws Exception{try{__CLR4_5_21fq21fq2lusyjtkt.R.inc(67075);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67076);JSONException error = null;
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67077);try {
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67078);DefaultJSONParser parser = new DefaultJSONParser("{a 3}");
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67079);parser.config(Feature.AllowUnQuotedFieldNames, true);
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67080);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67081);error = e;
        }
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67082);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fq21fq2lusyjtkt.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceStart(getClass().getName(),67083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1frf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fq21fq2lusyjtkt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67083,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1frf() throws Exception{try{__CLR4_5_21fq21fq2lusyjtkt.R.inc(67083);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67084);JSONException error = null;
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67085);try {
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67086);DefaultJSONParser parser = new DefaultJSONParser("{");
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67087);parser.config(Feature.AllowUnQuotedFieldNames, true);
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67088);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67089);error = e;
        }
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67090);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fq21fq2lusyjtkt.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceStart(getClass().getName(),67091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1frn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fq21fq2lusyjtkt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67091,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1frn() throws Exception{try{__CLR4_5_21fq21fq2lusyjtkt.R.inc(67091);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67092);JSONException error = null;
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67093);try {
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67094);DefaultJSONParser parser = new DefaultJSONParser("{\"a\"3}");
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67095);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67096);error = e;
        }
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67097);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fq21fq2lusyjtkt.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceStart(getClass().getName(),67098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81fru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fq21fq2lusyjtkt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67098,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81fru() throws Exception{try{__CLR4_5_21fq21fq2lusyjtkt.R.inc(67098);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67099);JSONException error = null;
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67100);try {
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67101);DefaultJSONParser parser = new DefaultJSONParser("{a:3}");
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67102);parser.config(Feature.AllowUnQuotedFieldNames, false);
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67103);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67104);error = e;
        }
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67105);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fq21fq2lusyjtkt.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceStart(getClass().getName(),67106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1fs2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fq21fq2lusyjtkt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fq21fq2lusyjtkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_2.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67106,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1fs2() throws Exception{try{__CLR4_5_21fq21fq2lusyjtkt.R.inc(67106);
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67107);JSONException error = null;
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67108);try {
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67109);DefaultJSONParser parser = new DefaultJSONParser("{'a':3}");
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67110);parser.config(Feature.AllowSingleQuotes, false);
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67111);parser.parseObject(A.class);
        } catch (JSONException e) {
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67112);error = e;
        }
        __CLR4_5_21fq21fq2lusyjtkt.R.inc(67113);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fq21fq2lusyjtkt.R.flushNeeded();}}

    public static class A {

        private int a;

        public int getA() {try{__CLR4_5_21fq21fq2lusyjtkt.R.inc(67114);
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67115);return a;
        }finally{__CLR4_5_21fq21fq2lusyjtkt.R.flushNeeded();}}

        public void setA(int a) {try{__CLR4_5_21fq21fq2lusyjtkt.R.inc(67116);
            __CLR4_5_21fq21fq2lusyjtkt.R.inc(67117);this.a = a;
        }finally{__CLR4_5_21fq21fq2lusyjtkt.R.flushNeeded();}}

    }

}
