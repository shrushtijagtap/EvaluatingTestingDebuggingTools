/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_new extends TestCase {static class __CLR4_1_101hkj1hkjlusqkdok{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,69499,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_new_0() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rz54rh1hkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69427,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rz54rh1hkj() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69427);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69428);JSONScanner lexer = new JSONScanner("new");
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69429);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_1() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oq55z01hkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69430,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oq55z01hkm() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69430);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69431);JSONException error = null;
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69432);try {
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69433);JSONScanner lexer = new JSONScanner("nww");
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69434);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69435);error = e;
        }
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69436);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_2() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lh576j1hkt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69437,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lh576j1hkt() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69437);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69438);JSONException error = null;
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69439);try {
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69440);JSONScanner lexer = new JSONScanner("nee");
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69441);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69442);error = e;
        }
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69443);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_3() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i858e21hl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69444,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i858e21hl0() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69444);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69445);JSONException error = null;
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69446);try {
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69447);JSONScanner lexer = new JSONScanner("neel");
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69448);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69449);error = e;
        }
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69450);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_4() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ez59ll1hl7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69451,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ez59ll1hl7() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69451);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69452);JSONException error = null;
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69453);try {
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69454);JSONScanner lexer = new JSONScanner("neww");
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69455);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69456);error = e;
        }
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69457);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_5() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bq5at41hle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69458,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bq5at41hle() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69458);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69459);JSONException error = null;
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69460);try {
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69461);JSONScanner lexer = new JSONScanner("newe");
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69462);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69463);error = e;
        }
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69464);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_6() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108h5c0n1hll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69465,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108h5c0n1hll() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69465);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69466);JSONException error = null;
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69467);try {
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69468);JSONScanner lexer = new JSONScanner("new\"");
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69469);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101hkj1hkjlusqkdok.R.inc(69470);error = e;
        }
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69471);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_7() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10585d861hls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69472,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10585d861hls() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69472);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69473);JSONScanner lexer = new JSONScanner("new a");
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69474);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_8() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101z5efp1hlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69475,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101z5efp1hlv() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69475);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69476);JSONScanner lexer = new JSONScanner("new,");
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69477);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_9() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1019ukcs1hly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69478,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1019ukcs1hly() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69478);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69479);JSONScanner lexer = new JSONScanner("new\na");
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69480);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_10() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jwvacm1hm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69481,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jwvacm1hm1() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69481);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69482);JSONScanner lexer = new JSONScanner("new\ra");
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69483);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_11() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gnvbk51hm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69484,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gnvbk51hm4() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69484);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69485);JSONScanner lexer = new JSONScanner("new\ta");
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69486);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_12() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10devcro1hm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69487,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10devcro1hm7() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69487);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69488);JSONScanner lexer = new JSONScanner("new\fa");
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69489);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_13() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a5vdz71hma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69490,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a5vdz71hma() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69490);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69491);JSONScanner lexer = new JSONScanner("new\ba");
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69492);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_14() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106wvf6q1hmd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69493,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106wvf6q1hmd() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69493);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69494);JSONScanner lexer = new JSONScanner("new}");
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69495);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}

    public void test_scan_new_15() throws Exception {__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceStart(getClass().getName(),69496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103nvge91hmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hkj1hkjlusqkdok.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hkj1hkjlusqkdok.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69496,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103nvge91hmg() throws Exception{try{__CLR4_1_101hkj1hkjlusqkdok.R.inc(69496);
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69497);JSONScanner lexer = new JSONScanner("new]");
        __CLR4_1_101hkj1hkjlusqkdok.R.inc(69498);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hkj1hkjlusqkdok.R.flushNeeded();}}
}
