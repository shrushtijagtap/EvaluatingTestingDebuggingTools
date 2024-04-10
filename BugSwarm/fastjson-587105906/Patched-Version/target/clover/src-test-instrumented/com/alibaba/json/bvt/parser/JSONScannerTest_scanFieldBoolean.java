/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class JSONScannerTest_scanFieldBoolean extends TestCase {static class __CLR4_5_21ho81ho8lusyjtq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,69686,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_true() throws Exception {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zgwum61ho8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_true",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zgwum61ho8() throws Exception{try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69560);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69561);String text = "{\"value\":true}";
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69562);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69563);Assert.assertEquals(true, obj.getValue());
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}

    public void test_false() throws Exception {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g0rozn1hoc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_false",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69564,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g0rozn1hoc() throws Exception{try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69564);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69565);String text = "{\"value\":false}";
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69566);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69567);Assert.assertEquals(false, obj.getValue());
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1hog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69568,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1hog() throws Exception{try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69568);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69569);String text = "{\"value\":\"true\"}";
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69570);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69571);Assert.assertEquals(true, obj.getValue());
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441hok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69572,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441hok() throws Exception{try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69572);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69573);String text = "{\"value\":\"false\"}";
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69574);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69575);Assert.assertEquals(false, obj.getValue());
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1hoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69576,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1hoo() throws Exception{try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69576);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69577);String text = "{\"value\":\"1\"}";
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69578);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69579);Assert.assertEquals(true, obj.getValue());
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}
    

    
    public void test_5() throws Exception {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1hos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69580,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1hos() throws Exception{try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69580);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69581);String text = "{\"value\":false}";
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69582);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69583);Assert.assertEquals(false, obj.getValue());
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}

    public void test_error_0() {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1how();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69584,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1how(){try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69584);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69585);Exception error = null;
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69586);try {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69587);String text = "{\"value\":true\\n\"";
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69588);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69589);error = ex;
        }
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69590);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}

    public void test_error_1() {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1hp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69591,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1hp3(){try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69591);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69592);Exception error = null;
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69593);try {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69594);String text = "{\"value\":a";
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69595);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69596);error = ex;
        }
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69597);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}

    public void test_error_2() {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1hpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69598,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1hpa(){try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69598);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69599);Exception error = null;
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69600);try {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69601);String text = "{\"value\":teue}";
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69602);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69603);error = ex;
        }
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69604);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}

    public void test_error_3() {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1hph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69605,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1hph(){try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69605);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69606);Exception error = null;
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69607);try {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69608);String text = "{\"value\":tree}";
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69609);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69610);error = ex;
        }
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69611);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}

    public void test_error_4() {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1hpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69612,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1hpo(){try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69612);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69613);Exception error = null;
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69614);try {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69615);String text = "{\"value\":truu}";
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69616);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69617);error = ex;
        }
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69618);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}

    public void test_error_5() {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81hpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69619,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81hpv(){try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69619);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69620);Exception error = null;
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69621);try {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69622);String text = "{\"value\":fflse}";
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69623);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69624);error = ex;
        }
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69625);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}
    
    public void test_error_6() {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1hq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1hq2(){try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69626);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69627);Exception error = null;
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69628);try {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69629);String text = "{\"value\":fasse}";
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69630);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69631);error = ex;
        }
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69632);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}
    
    public void test_error_7() {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9rshy1hq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69633,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9rshy1hq9(){try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69633);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69634);Exception error = null;
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69635);try {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69636);String text = "{\"value\":falee}";
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69637);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69638);error = ex;
        }
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69639);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}
    
    public void test_error_8() {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u0rtph1hqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69640,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u0rtph1hqg(){try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69640);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69641);Exception error = null;
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69642);try {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69643);String text = "{\"value\":falss}";
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69644);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69645);error = ex;
        }
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69646);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}
    
    public void test_error_9() {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qrrux01hqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69647,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qrrux01hqn(){try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69647);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69648);Exception error = null;
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69649);try {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69650);String text = "{\"value\":false]";
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69651);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69652);error = ex;
        }
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69653);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}
    
    public void test_error_10() {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3a9wq1hqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3a9wq1hqu(){try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69654);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69655);Exception error = null;
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69656);try {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69657);String text = "{\"value\":false}{";
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69658);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69659);error = ex;
        }
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69660);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}
    
    public void test_error_11() {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xott9x1hr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69661,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xott9x1hr1(){try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69661);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69662);Exception error = null;
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69663);try {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69664);String text = "{\"value\":false}}";
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69665);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69666);error = ex;
        }
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69667);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}
    
    public void test_error_12() {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uftuhg1hr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69668,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uftuhg1hr8(){try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69668);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69669);Exception error = null;
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69670);try {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69671);String text = "{\"value\":false}]";
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69672);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69673);error = ex;
        }
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69674);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}
    
    public void test_error_13() {__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceStart(getClass().getName(),69675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r6tvoz1hrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ho81ho8lusyjtq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ho81ho8lusyjtq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69675,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r6tvoz1hrf(){try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69675);
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69676);Exception error = null;
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69677);try {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69678);String text = "{\"value\":false},";
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69679);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69680);error = ex;
        }
        __CLR4_5_21ho81ho8lusyjtq6.R.inc(69681);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}

    public static class VO {

        private boolean value;

        public boolean getValue() {try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69682);
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69683);return value;
        }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}

        public void setValue(boolean value) {try{__CLR4_5_21ho81ho8lusyjtq6.R.inc(69684);
            __CLR4_5_21ho81ho8lusyjtq6.R.inc(69685);this.value = value;
        }finally{__CLR4_5_21ho81ho8lusyjtq6.R.flushNeeded();}}

    }
}
