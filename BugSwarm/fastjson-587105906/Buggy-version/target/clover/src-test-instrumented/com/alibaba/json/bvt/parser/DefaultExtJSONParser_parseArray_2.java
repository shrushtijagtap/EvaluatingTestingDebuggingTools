/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import junit.framework.TestCase;

import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

@SuppressWarnings("deprecation")
public class DefaultExtJSONParser_parseArray_2 extends TestCase {static class __CLR4_1_101g311g31lusqkd3u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,67569,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_0() throws Exception {__CLR4_1_101g311g31lusqkd3u.R.globalSliceStart(getClass().getName(),67501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21g31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g311g31lusqkd3u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g311g31lusqkd3u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67501,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21g31() throws Exception{try{__CLR4_1_101g311g31lusqkd3u.R.inc(67501);
        __CLR4_1_101g311g31lusqkd3u.R.inc(67502);DefaultJSONParser parser = new DefaultJSONParser("[['1']]");
        __CLR4_1_101g311g31lusqkd3u.R.inc(67503);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_1_101g311g31lusqkd3u.R.inc(67504);List<List<Integer>> list = (List<List<Integer>>) parser.parseArrayWithType(new TypeReference<List<List<Integer>>>() {
        }.getType());
        __CLR4_1_101g311g31lusqkd3u.R.inc(67505);Assert.assertEquals(new Integer(1), list.get(0).get(0));
    }finally{__CLR4_1_101g311g31lusqkd3u.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101g311g31lusqkd3u.R.globalSliceStart(getClass().getName(),67506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1g36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g311g31lusqkd3u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g311g31lusqkd3u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67506,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1g36() throws Exception{try{__CLR4_1_101g311g31lusqkd3u.R.inc(67506);
        __CLR4_1_101g311g31lusqkd3u.R.inc(67507);DefaultJSONParser parser = new DefaultJSONParser("['1','2']");
        __CLR4_1_101g311g31lusqkd3u.R.inc(67508);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_1_101g311g31lusqkd3u.R.inc(67509);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101g311g31lusqkd3u.R.inc(67510);parser.parseArray(Integer.class, list);
        __CLR4_1_101g311g31lusqkd3u.R.inc(67511);Assert.assertEquals(new Integer(1), list.get(0));
        __CLR4_1_101g311g31lusqkd3u.R.inc(67512);Assert.assertEquals(new Integer(2), list.get(1));
    }finally{__CLR4_1_101g311g31lusqkd3u.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_1_101g311g31lusqkd3u.R.globalSliceStart(getClass().getName(),67513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1g3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g311g31lusqkd3u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g311g31lusqkd3u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67513,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1g3d() throws Exception{try{__CLR4_1_101g311g31lusqkd3u.R.inc(67513);
        __CLR4_1_101g311g31lusqkd3u.R.inc(67514);DefaultJSONParser parser = new DefaultJSONParser("['1','2'}");
        __CLR4_1_101g311g31lusqkd3u.R.inc(67515);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101g311g31lusqkd3u.R.inc(67516);Exception error = null;
        __CLR4_1_101g311g31lusqkd3u.R.inc(67517);try {
            __CLR4_1_101g311g31lusqkd3u.R.inc(67518);List<Object> list = new ArrayList<Object>();
            __CLR4_1_101g311g31lusqkd3u.R.inc(67519);parser.parseArray(Integer.class, list);
        } catch (Exception ex) {
            __CLR4_1_101g311g31lusqkd3u.R.inc(67520);error = ex;
        }
        __CLR4_1_101g311g31lusqkd3u.R.inc(67521);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g311g31lusqkd3u.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101g311g31lusqkd3u.R.globalSliceStart(getClass().getName(),67522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1g3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g311g31lusqkd3u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g311g31lusqkd3u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67522,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1g3m() throws Exception{try{__CLR4_1_101g311g31lusqkd3u.R.inc(67522);
        __CLR4_1_101g311g31lusqkd3u.R.inc(67523);DefaultJSONParser parser = new DefaultJSONParser("[['1']]");
        __CLR4_1_101g311g31lusqkd3u.R.inc(67524);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101g311g31lusqkd3u.R.inc(67525);Exception error = null;
        __CLR4_1_101g311g31lusqkd3u.R.inc(67526);try {
            __CLR4_1_101g311g31lusqkd3u.R.inc(67527);parser.parseArrayWithType(new TypeReference<Map<?, ?>>() {
            }.getType());
        } catch (Exception ex) {
            __CLR4_1_101g311g31lusqkd3u.R.inc(67528);error = ex;
        }
        __CLR4_1_101g311g31lusqkd3u.R.inc(67529);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g311g31lusqkd3u.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101g311g31lusqkd3u.R.globalSliceStart(getClass().getName(),67530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1g3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g311g31lusqkd3u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g311g31lusqkd3u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67530,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1g3u() throws Exception{try{__CLR4_1_101g311g31lusqkd3u.R.inc(67530);
        __CLR4_1_101g311g31lusqkd3u.R.inc(67531);DefaultJSONParser parser = new DefaultJSONParser("[new X()]");
        __CLR4_1_101g311g31lusqkd3u.R.inc(67532);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101g311g31lusqkd3u.R.inc(67533);List list = new ArrayList();
        __CLR4_1_101g311g31lusqkd3u.R.inc(67534);Exception error = null;
        __CLR4_1_101g311g31lusqkd3u.R.inc(67535);try {
            __CLR4_1_101g311g31lusqkd3u.R.inc(67536);parser.parseArray(list);
        } catch (Exception ex) {
            __CLR4_1_101g311g31lusqkd3u.R.inc(67537);error = ex;
        }
        __CLR4_1_101g311g31lusqkd3u.R.inc(67538);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g311g31lusqkd3u.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101g311g31lusqkd3u.R.globalSliceStart(getClass().getName(),67539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1g43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g311g31lusqkd3u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g311g31lusqkd3u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67539,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1g43() throws Exception{try{__CLR4_1_101g311g31lusqkd3u.R.inc(67539);
        __CLR4_1_101g311g31lusqkd3u.R.inc(67540);DefaultJSONParser parser = new DefaultJSONParser("[] a");
        __CLR4_1_101g311g31lusqkd3u.R.inc(67541);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101g311g31lusqkd3u.R.inc(67542);List list = new ArrayList();
        __CLR4_1_101g311g31lusqkd3u.R.inc(67543);Exception error = null;
        __CLR4_1_101g311g31lusqkd3u.R.inc(67544);try {
            __CLR4_1_101g311g31lusqkd3u.R.inc(67545);parser.parseArray(list);
            __CLR4_1_101g311g31lusqkd3u.R.inc(67546);parser.close();
        } catch (Exception ex) {
            __CLR4_1_101g311g31lusqkd3u.R.inc(67547);error = ex;
        }
        __CLR4_1_101g311g31lusqkd3u.R.inc(67548);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g311g31lusqkd3u.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101g311g31lusqkd3u.R.globalSliceStart(getClass().getName(),67549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1g4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g311g31lusqkd3u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g311g31lusqkd3u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67549,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1g4d() throws Exception{try{__CLR4_1_101g311g31lusqkd3u.R.inc(67549);
        __CLR4_1_101g311g31lusqkd3u.R.inc(67550);DefaultJSONParser parser = new DefaultJSONParser("['1','2'}");
        __CLR4_1_101g311g31lusqkd3u.R.inc(67551);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101g311g31lusqkd3u.R.inc(67552);Exception error = null;
        __CLR4_1_101g311g31lusqkd3u.R.inc(67553);try {
            __CLR4_1_101g311g31lusqkd3u.R.inc(67554);parser.parseArray(new Type[] {});
        } catch (Exception ex) {
            __CLR4_1_101g311g31lusqkd3u.R.inc(67555);error = ex;
        }
        __CLR4_1_101g311g31lusqkd3u.R.inc(67556);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g311g31lusqkd3u.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_1_101g311g31lusqkd3u.R.globalSliceStart(getClass().getName(),67557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81g4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g311g31lusqkd3u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g311g31lusqkd3u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67557,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81g4l() throws Exception{try{__CLR4_1_101g311g31lusqkd3u.R.inc(67557);
        __CLR4_1_101g311g31lusqkd3u.R.inc(67558);DefaultJSONParser parser = new DefaultJSONParser("[]");
        __CLR4_1_101g311g31lusqkd3u.R.inc(67559);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101g311g31lusqkd3u.R.inc(67560);Assert.assertEquals(1, parser.parseArray(new Type[] { Integer[].class }).length);
    }finally{__CLR4_1_101g311g31lusqkd3u.R.flushNeeded();}}
    
    public void test_error_6() throws Exception {__CLR4_1_101g311g31lusqkd3u.R.globalSliceStart(getClass().getName(),67561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaop1g4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g311g31lusqkd3u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g311g31lusqkd3u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67561,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaop1g4p() throws Exception{try{__CLR4_1_101g311g31lusqkd3u.R.inc(67561);
        __CLR4_1_101g311g31lusqkd3u.R.inc(67562);DefaultJSONParser parser = new DefaultJSONParser("['1' 1 '2'}");
        __CLR4_1_101g311g31lusqkd3u.R.inc(67563);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101g311g31lusqkd3u.R.inc(67564);Exception error = null;
        __CLR4_1_101g311g31lusqkd3u.R.inc(67565);try {
            __CLR4_1_101g311g31lusqkd3u.R.inc(67566);parser.parseArray(new Type[] {Integer.class});
        } catch (Exception ex) {
            __CLR4_1_101g311g31lusqkd3u.R.inc(67567);error = ex;
        }
        __CLR4_1_101g311g31lusqkd3u.R.inc(67568);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g311g31lusqkd3u.R.flushNeeded();}}
}
