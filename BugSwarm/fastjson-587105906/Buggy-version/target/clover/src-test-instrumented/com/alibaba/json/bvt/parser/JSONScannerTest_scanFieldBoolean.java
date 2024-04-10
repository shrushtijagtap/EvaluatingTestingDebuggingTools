/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class JSONScannerTest_scanFieldBoolean extends TestCase {static class __CLR4_1_101imr1imrluszwcln{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,70929,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_true() throws Exception {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zgwum61imr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_true",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70803,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zgwum61imr() throws Exception{try{__CLR4_1_101imr1imrluszwcln.R.inc(70803);
        __CLR4_1_101imr1imrluszwcln.R.inc(70804);String text = "{\"value\":true}";
        __CLR4_1_101imr1imrluszwcln.R.inc(70805);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101imr1imrluszwcln.R.inc(70806);Assert.assertEquals(true, obj.getValue());
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}

    public void test_false() throws Exception {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g0rozn1imv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_false",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70807,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g0rozn1imv() throws Exception{try{__CLR4_1_101imr1imrluszwcln.R.inc(70807);
        __CLR4_1_101imr1imrluszwcln.R.inc(70808);String text = "{\"value\":false}";
        __CLR4_1_101imr1imrluszwcln.R.inc(70809);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101imr1imrluszwcln.R.inc(70810);Assert.assertEquals(false, obj.getValue());
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1imz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70811,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1imz() throws Exception{try{__CLR4_1_101imr1imrluszwcln.R.inc(70811);
        __CLR4_1_101imr1imrluszwcln.R.inc(70812);String text = "{\"value\":\"true\"}";
        __CLR4_1_101imr1imrluszwcln.R.inc(70813);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101imr1imrluszwcln.R.inc(70814);Assert.assertEquals(true, obj.getValue());
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441in3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70815,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441in3() throws Exception{try{__CLR4_1_101imr1imrluszwcln.R.inc(70815);
        __CLR4_1_101imr1imrluszwcln.R.inc(70816);String text = "{\"value\":\"false\"}";
        __CLR4_1_101imr1imrluszwcln.R.inc(70817);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101imr1imrluszwcln.R.inc(70818);Assert.assertEquals(false, obj.getValue());
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1in7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70819,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1in7() throws Exception{try{__CLR4_1_101imr1imrluszwcln.R.inc(70819);
        __CLR4_1_101imr1imrluszwcln.R.inc(70820);String text = "{\"value\":\"1\"}";
        __CLR4_1_101imr1imrluszwcln.R.inc(70821);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101imr1imrluszwcln.R.inc(70822);Assert.assertEquals(true, obj.getValue());
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}
    

    
    public void test_5() throws Exception {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1inb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70823,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1inb() throws Exception{try{__CLR4_1_101imr1imrluszwcln.R.inc(70823);
        __CLR4_1_101imr1imrluszwcln.R.inc(70824);String text = "{\"value\":false}";
        __CLR4_1_101imr1imrluszwcln.R.inc(70825);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101imr1imrluszwcln.R.inc(70826);Assert.assertEquals(false, obj.getValue());
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}

    public void test_error_0() {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1inf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70827,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1inf(){try{__CLR4_1_101imr1imrluszwcln.R.inc(70827);
        __CLR4_1_101imr1imrluszwcln.R.inc(70828);Exception error = null;
        __CLR4_1_101imr1imrluszwcln.R.inc(70829);try {
            __CLR4_1_101imr1imrluszwcln.R.inc(70830);String text = "{\"value\":true\\n\"";
            __CLR4_1_101imr1imrluszwcln.R.inc(70831);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101imr1imrluszwcln.R.inc(70832);error = ex;
        }
        __CLR4_1_101imr1imrluszwcln.R.inc(70833);Assert.assertNotNull(error);
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}

    public void test_error_1() {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1inm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70834,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1inm(){try{__CLR4_1_101imr1imrluszwcln.R.inc(70834);
        __CLR4_1_101imr1imrluszwcln.R.inc(70835);Exception error = null;
        __CLR4_1_101imr1imrluszwcln.R.inc(70836);try {
            __CLR4_1_101imr1imrluszwcln.R.inc(70837);String text = "{\"value\":a";
            __CLR4_1_101imr1imrluszwcln.R.inc(70838);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101imr1imrluszwcln.R.inc(70839);error = ex;
        }
        __CLR4_1_101imr1imrluszwcln.R.inc(70840);Assert.assertNotNull(error);
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}

    public void test_error_2() {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1int();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70841,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1int(){try{__CLR4_1_101imr1imrluszwcln.R.inc(70841);
        __CLR4_1_101imr1imrluszwcln.R.inc(70842);Exception error = null;
        __CLR4_1_101imr1imrluszwcln.R.inc(70843);try {
            __CLR4_1_101imr1imrluszwcln.R.inc(70844);String text = "{\"value\":teue}";
            __CLR4_1_101imr1imrluszwcln.R.inc(70845);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101imr1imrluszwcln.R.inc(70846);error = ex;
        }
        __CLR4_1_101imr1imrluszwcln.R.inc(70847);Assert.assertNotNull(error);
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}

    public void test_error_3() {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1io0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70848,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1io0(){try{__CLR4_1_101imr1imrluszwcln.R.inc(70848);
        __CLR4_1_101imr1imrluszwcln.R.inc(70849);Exception error = null;
        __CLR4_1_101imr1imrluszwcln.R.inc(70850);try {
            __CLR4_1_101imr1imrluszwcln.R.inc(70851);String text = "{\"value\":tree}";
            __CLR4_1_101imr1imrluszwcln.R.inc(70852);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101imr1imrluszwcln.R.inc(70853);error = ex;
        }
        __CLR4_1_101imr1imrluszwcln.R.inc(70854);Assert.assertNotNull(error);
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}

    public void test_error_4() {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1io7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70855,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1io7(){try{__CLR4_1_101imr1imrluszwcln.R.inc(70855);
        __CLR4_1_101imr1imrluszwcln.R.inc(70856);Exception error = null;
        __CLR4_1_101imr1imrluszwcln.R.inc(70857);try {
            __CLR4_1_101imr1imrluszwcln.R.inc(70858);String text = "{\"value\":truu}";
            __CLR4_1_101imr1imrluszwcln.R.inc(70859);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101imr1imrluszwcln.R.inc(70860);error = ex;
        }
        __CLR4_1_101imr1imrluszwcln.R.inc(70861);Assert.assertNotNull(error);
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}

    public void test_error_5() {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81ioe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70862,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81ioe(){try{__CLR4_1_101imr1imrluszwcln.R.inc(70862);
        __CLR4_1_101imr1imrluszwcln.R.inc(70863);Exception error = null;
        __CLR4_1_101imr1imrluszwcln.R.inc(70864);try {
            __CLR4_1_101imr1imrluszwcln.R.inc(70865);String text = "{\"value\":fflse}";
            __CLR4_1_101imr1imrluszwcln.R.inc(70866);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101imr1imrluszwcln.R.inc(70867);error = ex;
        }
        __CLR4_1_101imr1imrluszwcln.R.inc(70868);Assert.assertNotNull(error);
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}
    
    public void test_error_6() {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaop1iol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70869,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaop1iol(){try{__CLR4_1_101imr1imrluszwcln.R.inc(70869);
        __CLR4_1_101imr1imrluszwcln.R.inc(70870);Exception error = null;
        __CLR4_1_101imr1imrluszwcln.R.inc(70871);try {
            __CLR4_1_101imr1imrluszwcln.R.inc(70872);String text = "{\"value\":fasse}";
            __CLR4_1_101imr1imrluszwcln.R.inc(70873);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101imr1imrluszwcln.R.inc(70874);error = ex;
        }
        __CLR4_1_101imr1imrluszwcln.R.inc(70875);Assert.assertNotNull(error);
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}
    
    public void test_error_7() {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9rshy1ios();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70876,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9rshy1ios(){try{__CLR4_1_101imr1imrluszwcln.R.inc(70876);
        __CLR4_1_101imr1imrluszwcln.R.inc(70877);Exception error = null;
        __CLR4_1_101imr1imrluszwcln.R.inc(70878);try {
            __CLR4_1_101imr1imrluszwcln.R.inc(70879);String text = "{\"value\":falee}";
            __CLR4_1_101imr1imrluszwcln.R.inc(70880);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101imr1imrluszwcln.R.inc(70881);error = ex;
        }
        __CLR4_1_101imr1imrluszwcln.R.inc(70882);Assert.assertNotNull(error);
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}
    
    public void test_error_8() {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u0rtph1ioz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70883,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u0rtph1ioz(){try{__CLR4_1_101imr1imrluszwcln.R.inc(70883);
        __CLR4_1_101imr1imrluszwcln.R.inc(70884);Exception error = null;
        __CLR4_1_101imr1imrluszwcln.R.inc(70885);try {
            __CLR4_1_101imr1imrluszwcln.R.inc(70886);String text = "{\"value\":falss}";
            __CLR4_1_101imr1imrluszwcln.R.inc(70887);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101imr1imrluszwcln.R.inc(70888);error = ex;
        }
        __CLR4_1_101imr1imrluszwcln.R.inc(70889);Assert.assertNotNull(error);
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}
    
    public void test_error_9() {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qrrux01ip6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70890,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qrrux01ip6(){try{__CLR4_1_101imr1imrluszwcln.R.inc(70890);
        __CLR4_1_101imr1imrluszwcln.R.inc(70891);Exception error = null;
        __CLR4_1_101imr1imrluszwcln.R.inc(70892);try {
            __CLR4_1_101imr1imrluszwcln.R.inc(70893);String text = "{\"value\":false]";
            __CLR4_1_101imr1imrluszwcln.R.inc(70894);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101imr1imrluszwcln.R.inc(70895);error = ex;
        }
        __CLR4_1_101imr1imrluszwcln.R.inc(70896);Assert.assertNotNull(error);
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}
    
    public void test_error_10() {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y3a9wq1ipd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70897,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y3a9wq1ipd(){try{__CLR4_1_101imr1imrluszwcln.R.inc(70897);
        __CLR4_1_101imr1imrluszwcln.R.inc(70898);Exception error = null;
        __CLR4_1_101imr1imrluszwcln.R.inc(70899);try {
            __CLR4_1_101imr1imrluszwcln.R.inc(70900);String text = "{\"value\":false}{";
            __CLR4_1_101imr1imrluszwcln.R.inc(70901);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101imr1imrluszwcln.R.inc(70902);error = ex;
        }
        __CLR4_1_101imr1imrluszwcln.R.inc(70903);Assert.assertNotNull(error);
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}
    
    public void test_error_11() {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xott9x1ipk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70904,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xott9x1ipk(){try{__CLR4_1_101imr1imrluszwcln.R.inc(70904);
        __CLR4_1_101imr1imrluszwcln.R.inc(70905);Exception error = null;
        __CLR4_1_101imr1imrluszwcln.R.inc(70906);try {
            __CLR4_1_101imr1imrluszwcln.R.inc(70907);String text = "{\"value\":false}}";
            __CLR4_1_101imr1imrluszwcln.R.inc(70908);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101imr1imrluszwcln.R.inc(70909);error = ex;
        }
        __CLR4_1_101imr1imrluszwcln.R.inc(70910);Assert.assertNotNull(error);
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}
    
    public void test_error_12() {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uftuhg1ipr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70911,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uftuhg1ipr(){try{__CLR4_1_101imr1imrluszwcln.R.inc(70911);
        __CLR4_1_101imr1imrluszwcln.R.inc(70912);Exception error = null;
        __CLR4_1_101imr1imrluszwcln.R.inc(70913);try {
            __CLR4_1_101imr1imrluszwcln.R.inc(70914);String text = "{\"value\":false}]";
            __CLR4_1_101imr1imrluszwcln.R.inc(70915);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101imr1imrluszwcln.R.inc(70916);error = ex;
        }
        __CLR4_1_101imr1imrluszwcln.R.inc(70917);Assert.assertNotNull(error);
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}
    
    public void test_error_13() {__CLR4_1_101imr1imrluszwcln.R.globalSliceStart(getClass().getName(),70918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r6tvoz1ipy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101imr1imrluszwcln.R.rethrow($CLV_t2$);}finally{__CLR4_1_101imr1imrluszwcln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70918,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r6tvoz1ipy(){try{__CLR4_1_101imr1imrluszwcln.R.inc(70918);
        __CLR4_1_101imr1imrluszwcln.R.inc(70919);Exception error = null;
        __CLR4_1_101imr1imrluszwcln.R.inc(70920);try {
            __CLR4_1_101imr1imrluszwcln.R.inc(70921);String text = "{\"value\":false},";
            __CLR4_1_101imr1imrluszwcln.R.inc(70922);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101imr1imrluszwcln.R.inc(70923);error = ex;
        }
        __CLR4_1_101imr1imrluszwcln.R.inc(70924);Assert.assertNotNull(error);
    }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}

    public static class VO {

        private boolean value;

        public boolean getValue() {try{__CLR4_1_101imr1imrluszwcln.R.inc(70925);
            __CLR4_1_101imr1imrluszwcln.R.inc(70926);return value;
        }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}

        public void setValue(boolean value) {try{__CLR4_1_101imr1imrluszwcln.R.inc(70927);
            __CLR4_1_101imr1imrluszwcln.R.inc(70928);this.value = value;
        }finally{__CLR4_1_101imr1imrluszwcln.R.flushNeeded();}}

    }
}
