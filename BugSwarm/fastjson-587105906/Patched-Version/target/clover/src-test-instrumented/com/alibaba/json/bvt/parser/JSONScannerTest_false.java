/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_false extends TestCase {static class __CLR4_5_21he01he0lusyjtpd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,69271,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_false_0() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vooshy1he0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69192,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vooshy1he0() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69192);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69193);JSONScanner lexer = new JSONScanner("false");
        __CLR4_5_21he01he0lusyjtpd.R.inc(69194);lexer.scanFalse();
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_1() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yxoraf1he3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69195,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yxoraf1he3() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69195);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69196);JSONException error = null;
        __CLR4_5_21he01he0lusyjtpd.R.inc(69197);try {
            __CLR4_5_21he01he0lusyjtpd.R.inc(69198);JSONScanner lexer = new JSONScanner("zalse");
            __CLR4_5_21he01he0lusyjtpd.R.inc(69199);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_5_21he01he0lusyjtpd.R.inc(69200);error = e;
        }
        __CLR4_5_21he01he0lusyjtpd.R.inc(69201);Assert.assertNotNull(error);
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_2() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wufbw81hea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69202,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wufbw81hea() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69202);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69203);JSONException error = null;
        __CLR4_5_21he01he0lusyjtpd.R.inc(69204);try {
            __CLR4_5_21he01he0lusyjtpd.R.inc(69205);JSONScanner lexer = new JSONScanner("fzlse");
            __CLR4_5_21he01he0lusyjtpd.R.inc(69206);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_5_21he01he0lusyjtpd.R.inc(69207);error = e;
        }
        __CLR4_5_21he01he0lusyjtpd.R.inc(69208);Assert.assertNotNull(error);
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_3() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tlfd3r1heh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69209,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tlfd3r1heh() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69209);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69210);JSONException error = null;
        __CLR4_5_21he01he0lusyjtpd.R.inc(69211);try {
            __CLR4_5_21he01he0lusyjtpd.R.inc(69212);JSONScanner lexer = new JSONScanner("fazse");
            __CLR4_5_21he01he0lusyjtpd.R.inc(69213);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_5_21he01he0lusyjtpd.R.inc(69214);error = e;
        }
        __CLR4_5_21he01he0lusyjtpd.R.inc(69215);Assert.assertNotNull(error);
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_4() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qcfeba1heo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69216,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qcfeba1heo() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69216);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69217);JSONException error = null;
        __CLR4_5_21he01he0lusyjtpd.R.inc(69218);try {
            __CLR4_5_21he01he0lusyjtpd.R.inc(69219);JSONScanner lexer = new JSONScanner("falze");
            __CLR4_5_21he01he0lusyjtpd.R.inc(69220);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_5_21he01he0lusyjtpd.R.inc(69221);error = e;
        }
        __CLR4_5_21he01he0lusyjtpd.R.inc(69222);Assert.assertNotNull(error);
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_5() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n3ffit1hev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69223,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n3ffit1hev() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69223);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69224);JSONException error = null;
        __CLR4_5_21he01he0lusyjtpd.R.inc(69225);try {
            __CLR4_5_21he01he0lusyjtpd.R.inc(69226);JSONScanner lexer = new JSONScanner("falsz");
            __CLR4_5_21he01he0lusyjtpd.R.inc(69227);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_5_21he01he0lusyjtpd.R.inc(69228);error = e;
        }
        __CLR4_5_21he01he0lusyjtpd.R.inc(69229);Assert.assertNotNull(error);
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_6_1() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2utun9e1hf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_6_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69230,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2utun9e1hf2() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69230);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69231);JSONException error = null;
        __CLR4_5_21he01he0lusyjtpd.R.inc(69232);try {
            __CLR4_5_21he01he0lusyjtpd.R.inc(69233);JSONScanner lexer = new JSONScanner("falsee");
            __CLR4_5_21he01he0lusyjtpd.R.inc(69234);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_5_21he01he0lusyjtpd.R.inc(69235);error = e;
        }
        __CLR4_5_21he01he0lusyjtpd.R.inc(69236);Assert.assertNotNull(error);
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_6() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jufgqc1hf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69237,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jufgqc1hf9() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69237);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69238);JSONException error = null;
        __CLR4_5_21he01he0lusyjtpd.R.inc(69239);try {
            __CLR4_5_21he01he0lusyjtpd.R.inc(69240);JSONScanner lexer = new JSONScanner("false\"");
            __CLR4_5_21he01he0lusyjtpd.R.inc(69241);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_5_21he01he0lusyjtpd.R.inc(69242);error = e;
        }
        __CLR4_5_21he01he0lusyjtpd.R.inc(69243);Assert.assertNotNull(error);
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_7() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2glfhxv1hfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69244,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2glfhxv1hfg() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69244);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69245);JSONScanner lexer = new JSONScanner("false a");
        __CLR4_5_21he01he0lusyjtpd.R.inc(69246);lexer.scanFalse();
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_8() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dcfj5e1hfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69247,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dcfj5e1hfj() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69247);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69248);JSONScanner lexer = new JSONScanner("false,");
        __CLR4_5_21he01he0lusyjtpd.R.inc(69249);lexer.scanFalse();
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_9() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a3fkcx1hfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69250,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a3fkcx1hfm() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69250);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69251);JSONScanner lexer = new JSONScanner("false\na");
        __CLR4_5_21he01he0lusyjtpd.R.inc(69252);lexer.scanFalse();
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_10() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h712ll1hfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69253,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h712ll1hfp() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69253);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69254);JSONScanner lexer = new JSONScanner("false\ra");
        __CLR4_5_21he01he0lusyjtpd.R.inc(69255);lexer.scanFalse();
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_11() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dy13t41hfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dy13t41hfs() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69256);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69257);JSONScanner lexer = new JSONScanner("false\ta");
        __CLR4_5_21he01he0lusyjtpd.R.inc(69258);lexer.scanFalse();
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_12() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ap150n1hfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69259,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ap150n1hfv() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69259);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69260);JSONScanner lexer = new JSONScanner("false\fa");
        __CLR4_5_21he01he0lusyjtpd.R.inc(69261);lexer.scanFalse();
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_13() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27g16861hfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69262,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27g16861hfy() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69262);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69263);JSONScanner lexer = new JSONScanner("false\ba");
        __CLR4_5_21he01he0lusyjtpd.R.inc(69264);lexer.scanFalse();
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_14() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24717fp1hg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69265,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24717fp1hg1() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69265);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69266);JSONScanner lexer = new JSONScanner("false}");
        __CLR4_5_21he01he0lusyjtpd.R.inc(69267);lexer.scanFalse();
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}

    public void test_scan_false_15() throws Exception {__CLR4_5_21he01he0lusyjtpd.R.globalSliceStart(getClass().getName(),69268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y18n81hg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21he01he0lusyjtpd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21he01he0lusyjtpd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y18n81hg4() throws Exception{try{__CLR4_5_21he01he0lusyjtpd.R.inc(69268);
        __CLR4_5_21he01he0lusyjtpd.R.inc(69269);JSONScanner lexer = new JSONScanner("false]");
        __CLR4_5_21he01he0lusyjtpd.R.inc(69270);lexer.scanFalse();
    }finally{__CLR4_5_21he01he0lusyjtpd.R.flushNeeded();}}
}
