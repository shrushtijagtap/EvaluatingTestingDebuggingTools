/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

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
public class DefaultExtJSONParser_parseArray_2 extends TestCase {static class __CLR4_5_21g2q1g2qlusyjtll{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,67558,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_0() throws Exception {__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceStart(getClass().getName(),67490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21g2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g2q1g2qlusyjtll.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21g2q() throws Exception{try{__CLR4_5_21g2q1g2qlusyjtll.R.inc(67490);
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67491);DefaultJSONParser parser = new DefaultJSONParser("[['1']]");
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67492);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67493);List<List<Integer>> list = (List<List<Integer>>) parser.parseArrayWithType(new TypeReference<List<List<Integer>>>() {
        }.getType());
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67494);Assert.assertEquals(new Integer(1), list.get(0).get(0));
    }finally{__CLR4_5_21g2q1g2qlusyjtll.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceStart(getClass().getName(),67495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1g2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g2q1g2qlusyjtll.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67495,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1g2v() throws Exception{try{__CLR4_5_21g2q1g2qlusyjtll.R.inc(67495);
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67496);DefaultJSONParser parser = new DefaultJSONParser("['1','2']");
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67497);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67498);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67499);parser.parseArray(Integer.class, list);
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67500);Assert.assertEquals(new Integer(1), list.get(0));
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67501);Assert.assertEquals(new Integer(2), list.get(1));
    }finally{__CLR4_5_21g2q1g2qlusyjtll.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceStart(getClass().getName(),67502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1g32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g2q1g2qlusyjtll.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67502,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1g32() throws Exception{try{__CLR4_5_21g2q1g2qlusyjtll.R.inc(67502);
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67503);DefaultJSONParser parser = new DefaultJSONParser("['1','2'}");
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67504);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67505);Exception error = null;
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67506);try {
            __CLR4_5_21g2q1g2qlusyjtll.R.inc(67507);List<Object> list = new ArrayList<Object>();
            __CLR4_5_21g2q1g2qlusyjtll.R.inc(67508);parser.parseArray(Integer.class, list);
        } catch (Exception ex) {
            __CLR4_5_21g2q1g2qlusyjtll.R.inc(67509);error = ex;
        }
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67510);Assert.assertNotNull(error);
    }finally{__CLR4_5_21g2q1g2qlusyjtll.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceStart(getClass().getName(),67511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1g3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g2q1g2qlusyjtll.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67511,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1g3b() throws Exception{try{__CLR4_5_21g2q1g2qlusyjtll.R.inc(67511);
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67512);DefaultJSONParser parser = new DefaultJSONParser("[['1']]");
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67513);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67514);Exception error = null;
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67515);try {
            __CLR4_5_21g2q1g2qlusyjtll.R.inc(67516);parser.parseArrayWithType(new TypeReference<Map<?, ?>>() {
            }.getType());
        } catch (Exception ex) {
            __CLR4_5_21g2q1g2qlusyjtll.R.inc(67517);error = ex;
        }
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67518);Assert.assertNotNull(error);
    }finally{__CLR4_5_21g2q1g2qlusyjtll.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceStart(getClass().getName(),67519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1g3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g2q1g2qlusyjtll.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67519,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1g3j() throws Exception{try{__CLR4_5_21g2q1g2qlusyjtll.R.inc(67519);
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67520);DefaultJSONParser parser = new DefaultJSONParser("[new X()]");
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67521);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67522);List list = new ArrayList();
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67523);Exception error = null;
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67524);try {
            __CLR4_5_21g2q1g2qlusyjtll.R.inc(67525);parser.parseArray(list);
        } catch (Exception ex) {
            __CLR4_5_21g2q1g2qlusyjtll.R.inc(67526);error = ex;
        }
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67527);Assert.assertNotNull(error);
    }finally{__CLR4_5_21g2q1g2qlusyjtll.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceStart(getClass().getName(),67528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1g3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g2q1g2qlusyjtll.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67528,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1g3s() throws Exception{try{__CLR4_5_21g2q1g2qlusyjtll.R.inc(67528);
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67529);DefaultJSONParser parser = new DefaultJSONParser("[] a");
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67530);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67531);List list = new ArrayList();
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67532);Exception error = null;
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67533);try {
            __CLR4_5_21g2q1g2qlusyjtll.R.inc(67534);parser.parseArray(list);
            __CLR4_5_21g2q1g2qlusyjtll.R.inc(67535);parser.close();
        } catch (Exception ex) {
            __CLR4_5_21g2q1g2qlusyjtll.R.inc(67536);error = ex;
        }
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67537);Assert.assertNotNull(error);
    }finally{__CLR4_5_21g2q1g2qlusyjtll.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceStart(getClass().getName(),67538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1g42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g2q1g2qlusyjtll.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67538,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1g42() throws Exception{try{__CLR4_5_21g2q1g2qlusyjtll.R.inc(67538);
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67539);DefaultJSONParser parser = new DefaultJSONParser("['1','2'}");
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67540);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67541);Exception error = null;
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67542);try {
            __CLR4_5_21g2q1g2qlusyjtll.R.inc(67543);parser.parseArray(new Type[] {});
        } catch (Exception ex) {
            __CLR4_5_21g2q1g2qlusyjtll.R.inc(67544);error = ex;
        }
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67545);Assert.assertNotNull(error);
    }finally{__CLR4_5_21g2q1g2qlusyjtll.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceStart(getClass().getName(),67546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81g4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g2q1g2qlusyjtll.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81g4a() throws Exception{try{__CLR4_5_21g2q1g2qlusyjtll.R.inc(67546);
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67547);DefaultJSONParser parser = new DefaultJSONParser("[]");
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67548);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67549);Assert.assertEquals(1, parser.parseArray(new Type[] { Integer[].class }).length);
    }finally{__CLR4_5_21g2q1g2qlusyjtll.R.flushNeeded();}}
    
    public void test_error_6() throws Exception {__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceStart(getClass().getName(),67550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1g4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21g2q1g2qlusyjtll.R.rethrow($CLV_t2$);}finally{__CLR4_5_21g2q1g2qlusyjtll.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67550,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1g4e() throws Exception{try{__CLR4_5_21g2q1g2qlusyjtll.R.inc(67550);
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67551);DefaultJSONParser parser = new DefaultJSONParser("['1' 1 '2'}");
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67552);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67553);Exception error = null;
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67554);try {
            __CLR4_5_21g2q1g2qlusyjtll.R.inc(67555);parser.parseArray(new Type[] {Integer.class});
        } catch (Exception ex) {
            __CLR4_5_21g2q1g2qlusyjtll.R.inc(67556);error = ex;
        }
        __CLR4_5_21g2q1g2qlusyjtll.R.inc(67557);Assert.assertNotNull(error);
    }finally{__CLR4_5_21g2q1g2qlusyjtll.R.flushNeeded();}}
}
