/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class JSONScannerTest_scanFieldBoolean extends TestCase {static class __CLR4_1_101hoj1hojlusqkdpe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,69697,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_true() throws Exception {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zgwum61hoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_true",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69571,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zgwum61hoj() throws Exception{try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69571);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69572);String text = "{\"value\":true}";
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69573);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69574);Assert.assertEquals(true, obj.getValue());
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}

    public void test_false() throws Exception {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g0rozn1hon();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_false",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69575,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g0rozn1hon() throws Exception{try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69575);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69576);String text = "{\"value\":false}";
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69577);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69578);Assert.assertEquals(false, obj.getValue());
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1hor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69579,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1hor() throws Exception{try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69579);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69580);String text = "{\"value\":\"true\"}";
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69581);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69582);Assert.assertEquals(true, obj.getValue());
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441hov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69583,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441hov() throws Exception{try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69583);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69584);String text = "{\"value\":\"false\"}";
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69585);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69586);Assert.assertEquals(false, obj.getValue());
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1hoz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69587,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1hoz() throws Exception{try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69587);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69588);String text = "{\"value\":\"1\"}";
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69589);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69590);Assert.assertEquals(true, obj.getValue());
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}
    

    
    public void test_5() throws Exception {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1hp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69591,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1hp3() throws Exception{try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69591);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69592);String text = "{\"value\":false}";
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69593);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69594);Assert.assertEquals(false, obj.getValue());
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}

    public void test_error_0() {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1hp7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69595,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1hp7(){try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69595);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69596);Exception error = null;
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69597);try {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69598);String text = "{\"value\":true\\n\"";
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69599);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69600);error = ex;
        }
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69601);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}

    public void test_error_1() {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1hpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69602,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1hpe(){try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69602);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69603);Exception error = null;
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69604);try {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69605);String text = "{\"value\":a";
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69606);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69607);error = ex;
        }
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69608);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}

    public void test_error_2() {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1hpl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69609,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1hpl(){try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69609);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69610);Exception error = null;
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69611);try {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69612);String text = "{\"value\":teue}";
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69613);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69614);error = ex;
        }
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69615);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}

    public void test_error_3() {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1hps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69616,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1hps(){try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69616);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69617);Exception error = null;
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69618);try {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69619);String text = "{\"value\":tree}";
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69620);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69621);error = ex;
        }
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69622);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}

    public void test_error_4() {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1hpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69623,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1hpz(){try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69623);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69624);Exception error = null;
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69625);try {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69626);String text = "{\"value\":truu}";
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69627);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69628);error = ex;
        }
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69629);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}

    public void test_error_5() {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81hq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69630,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81hq6(){try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69630);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69631);Exception error = null;
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69632);try {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69633);String text = "{\"value\":fflse}";
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69634);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69635);error = ex;
        }
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69636);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}
    
    public void test_error_6() {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaop1hqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69637,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaop1hqd(){try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69637);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69638);Exception error = null;
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69639);try {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69640);String text = "{\"value\":fasse}";
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69641);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69642);error = ex;
        }
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69643);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}
    
    public void test_error_7() {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9rshy1hqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69644,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9rshy1hqk(){try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69644);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69645);Exception error = null;
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69646);try {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69647);String text = "{\"value\":falee}";
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69648);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69649);error = ex;
        }
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69650);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}
    
    public void test_error_8() {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u0rtph1hqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69651,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u0rtph1hqr(){try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69651);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69652);Exception error = null;
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69653);try {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69654);String text = "{\"value\":falss}";
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69655);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69656);error = ex;
        }
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69657);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}
    
    public void test_error_9() {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qrrux01hqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69658,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qrrux01hqy(){try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69658);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69659);Exception error = null;
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69660);try {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69661);String text = "{\"value\":false]";
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69662);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69663);error = ex;
        }
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69664);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}
    
    public void test_error_10() {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y3a9wq1hr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69665,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y3a9wq1hr5(){try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69665);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69666);Exception error = null;
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69667);try {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69668);String text = "{\"value\":false}{";
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69669);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69670);error = ex;
        }
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69671);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}
    
    public void test_error_11() {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xott9x1hrc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69672,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xott9x1hrc(){try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69672);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69673);Exception error = null;
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69674);try {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69675);String text = "{\"value\":false}}";
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69676);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69677);error = ex;
        }
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69678);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}
    
    public void test_error_12() {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uftuhg1hrj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69679,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uftuhg1hrj(){try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69679);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69680);Exception error = null;
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69681);try {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69682);String text = "{\"value\":false}]";
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69683);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69684);error = ex;
        }
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69685);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}
    
    public void test_error_13() {__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceStart(getClass().getName(),69686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r6tvoz1hrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hoj1hojlusqkdpe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hoj1hojlusqkdpe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69686,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r6tvoz1hrq(){try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69686);
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69687);Exception error = null;
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69688);try {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69689);String text = "{\"value\":false},";
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69690);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69691);error = ex;
        }
        __CLR4_1_101hoj1hojlusqkdpe.R.inc(69692);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}

    public static class VO {

        private boolean value;

        public boolean getValue() {try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69693);
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69694);return value;
        }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}

        public void setValue(boolean value) {try{__CLR4_1_101hoj1hojlusqkdpe.R.inc(69695);
            __CLR4_1_101hoj1hojlusqkdpe.R.inc(69696);this.value = value;
        }finally{__CLR4_1_101hoj1hojlusqkdpe.R.flushNeeded();}}

    }
}
