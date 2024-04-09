/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_false extends TestCase {static class __CLR4_1_101heb1heblusqkdnl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,69282,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_false_0() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vooshy1heb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69203,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vooshy1heb() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69203);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69204);JSONScanner lexer = new JSONScanner("false");
        __CLR4_1_101heb1heblusqkdnl.R.inc(69205);lexer.scanFalse();
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_1() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yxoraf1hee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69206,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yxoraf1hee() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69206);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69207);JSONException error = null;
        __CLR4_1_101heb1heblusqkdnl.R.inc(69208);try {
            __CLR4_1_101heb1heblusqkdnl.R.inc(69209);JSONScanner lexer = new JSONScanner("zalse");
            __CLR4_1_101heb1heblusqkdnl.R.inc(69210);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_1_101heb1heblusqkdnl.R.inc(69211);error = e;
        }
        __CLR4_1_101heb1heblusqkdnl.R.inc(69212);Assert.assertNotNull(error);
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_2() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wufbw81hel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69213,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wufbw81hel() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69213);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69214);JSONException error = null;
        __CLR4_1_101heb1heblusqkdnl.R.inc(69215);try {
            __CLR4_1_101heb1heblusqkdnl.R.inc(69216);JSONScanner lexer = new JSONScanner("fzlse");
            __CLR4_1_101heb1heblusqkdnl.R.inc(69217);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_1_101heb1heblusqkdnl.R.inc(69218);error = e;
        }
        __CLR4_1_101heb1heblusqkdnl.R.inc(69219);Assert.assertNotNull(error);
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_3() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tlfd3r1hes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69220,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tlfd3r1hes() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69220);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69221);JSONException error = null;
        __CLR4_1_101heb1heblusqkdnl.R.inc(69222);try {
            __CLR4_1_101heb1heblusqkdnl.R.inc(69223);JSONScanner lexer = new JSONScanner("fazse");
            __CLR4_1_101heb1heblusqkdnl.R.inc(69224);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_1_101heb1heblusqkdnl.R.inc(69225);error = e;
        }
        __CLR4_1_101heb1heblusqkdnl.R.inc(69226);Assert.assertNotNull(error);
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_4() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qcfeba1hez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69227,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qcfeba1hez() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69227);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69228);JSONException error = null;
        __CLR4_1_101heb1heblusqkdnl.R.inc(69229);try {
            __CLR4_1_101heb1heblusqkdnl.R.inc(69230);JSONScanner lexer = new JSONScanner("falze");
            __CLR4_1_101heb1heblusqkdnl.R.inc(69231);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_1_101heb1heblusqkdnl.R.inc(69232);error = e;
        }
        __CLR4_1_101heb1heblusqkdnl.R.inc(69233);Assert.assertNotNull(error);
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_5() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n3ffit1hf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69234,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n3ffit1hf6() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69234);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69235);JSONException error = null;
        __CLR4_1_101heb1heblusqkdnl.R.inc(69236);try {
            __CLR4_1_101heb1heblusqkdnl.R.inc(69237);JSONScanner lexer = new JSONScanner("falsz");
            __CLR4_1_101heb1heblusqkdnl.R.inc(69238);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_1_101heb1heblusqkdnl.R.inc(69239);error = e;
        }
        __CLR4_1_101heb1heblusqkdnl.R.inc(69240);Assert.assertNotNull(error);
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_6_1() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10utun9e1hfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_6_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69241,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10utun9e1hfd() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69241);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69242);JSONException error = null;
        __CLR4_1_101heb1heblusqkdnl.R.inc(69243);try {
            __CLR4_1_101heb1heblusqkdnl.R.inc(69244);JSONScanner lexer = new JSONScanner("falsee");
            __CLR4_1_101heb1heblusqkdnl.R.inc(69245);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_1_101heb1heblusqkdnl.R.inc(69246);error = e;
        }
        __CLR4_1_101heb1heblusqkdnl.R.inc(69247);Assert.assertNotNull(error);
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_6() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jufgqc1hfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69248,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jufgqc1hfk() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69248);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69249);JSONException error = null;
        __CLR4_1_101heb1heblusqkdnl.R.inc(69250);try {
            __CLR4_1_101heb1heblusqkdnl.R.inc(69251);JSONScanner lexer = new JSONScanner("false\"");
            __CLR4_1_101heb1heblusqkdnl.R.inc(69252);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_1_101heb1heblusqkdnl.R.inc(69253);error = e;
        }
        __CLR4_1_101heb1heblusqkdnl.R.inc(69254);Assert.assertNotNull(error);
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_7() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10glfhxv1hfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69255,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10glfhxv1hfr() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69255);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69256);JSONScanner lexer = new JSONScanner("false a");
        __CLR4_1_101heb1heblusqkdnl.R.inc(69257);lexer.scanFalse();
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_8() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dcfj5e1hfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69258,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dcfj5e1hfu() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69258);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69259);JSONScanner lexer = new JSONScanner("false,");
        __CLR4_1_101heb1heblusqkdnl.R.inc(69260);lexer.scanFalse();
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_9() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a3fkcx1hfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69261,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a3fkcx1hfx() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69261);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69262);JSONScanner lexer = new JSONScanner("false\na");
        __CLR4_1_101heb1heblusqkdnl.R.inc(69263);lexer.scanFalse();
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_10() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10h712ll1hg0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69264,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10h712ll1hg0() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69264);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69265);JSONScanner lexer = new JSONScanner("false\ra");
        __CLR4_1_101heb1heblusqkdnl.R.inc(69266);lexer.scanFalse();
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_11() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dy13t41hg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69267,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dy13t41hg3() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69267);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69268);JSONScanner lexer = new JSONScanner("false\ta");
        __CLR4_1_101heb1heblusqkdnl.R.inc(69269);lexer.scanFalse();
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_12() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ap150n1hg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69270,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ap150n1hg6() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69270);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69271);JSONScanner lexer = new JSONScanner("false\fa");
        __CLR4_1_101heb1heblusqkdnl.R.inc(69272);lexer.scanFalse();
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_13() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107g16861hg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69273,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107g16861hg9() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69273);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69274);JSONScanner lexer = new JSONScanner("false\ba");
        __CLR4_1_101heb1heblusqkdnl.R.inc(69275);lexer.scanFalse();
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_14() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104717fp1hgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69276,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104717fp1hgc() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69276);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69277);JSONScanner lexer = new JSONScanner("false}");
        __CLR4_1_101heb1heblusqkdnl.R.inc(69278);lexer.scanFalse();
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}

    public void test_scan_false_15() throws Exception {__CLR4_1_101heb1heblusqkdnl.R.globalSliceStart(getClass().getName(),69279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y18n81hgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101heb1heblusqkdnl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101heb1heblusqkdnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69279,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y18n81hgf() throws Exception{try{__CLR4_1_101heb1heblusqkdnl.R.inc(69279);
        __CLR4_1_101heb1heblusqkdnl.R.inc(69280);JSONScanner lexer = new JSONScanner("false]");
        __CLR4_1_101heb1heblusqkdnl.R.inc(69281);lexer.scanFalse();
    }finally{__CLR4_1_101heb1heblusqkdnl.R.flushNeeded();}}
}
