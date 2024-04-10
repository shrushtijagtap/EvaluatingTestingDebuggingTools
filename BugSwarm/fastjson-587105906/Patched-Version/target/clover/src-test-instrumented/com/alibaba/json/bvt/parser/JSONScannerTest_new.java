/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_new extends TestCase {static class __CLR4_5_21hk81hk8lusyjtps{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,69488,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_new_0() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rz54rh1hk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69416,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rz54rh1hk8() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69416);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69417);JSONScanner lexer = new JSONScanner("new");
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69418);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_1() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oq55z01hkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69419,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oq55z01hkb() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69419);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69420);JSONException error = null;
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69421);try {
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69422);JSONScanner lexer = new JSONScanner("nww");
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69423);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69424);error = e;
        }
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69425);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_2() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lh576j1hki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69426,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lh576j1hki() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69426);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69427);JSONException error = null;
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69428);try {
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69429);JSONScanner lexer = new JSONScanner("nee");
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69430);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69431);error = e;
        }
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69432);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_3() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i858e21hkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69433,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i858e21hkp() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69433);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69434);JSONException error = null;
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69435);try {
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69436);JSONScanner lexer = new JSONScanner("neel");
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69437);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69438);error = e;
        }
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69439);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_4() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ez59ll1hkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69440,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ez59ll1hkw() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69440);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69441);JSONException error = null;
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69442);try {
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69443);JSONScanner lexer = new JSONScanner("neww");
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69444);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69445);error = e;
        }
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69446);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_5() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bq5at41hl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69447,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bq5at41hl3() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69447);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69448);JSONException error = null;
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69449);try {
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69450);JSONScanner lexer = new JSONScanner("newe");
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69451);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69452);error = e;
        }
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69453);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_6() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28h5c0n1hla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69454,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28h5c0n1hla() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69454);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69455);JSONException error = null;
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69456);try {
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69457);JSONScanner lexer = new JSONScanner("new\"");
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69458);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21hk81hk8lusyjtps.R.inc(69459);error = e;
        }
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69460);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_7() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2585d861hlh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69461,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2585d861hlh() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69461);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69462);JSONScanner lexer = new JSONScanner("new a");
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69463);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_8() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21z5efp1hlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69464,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21z5efp1hlk() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69464);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69465);JSONScanner lexer = new JSONScanner("new,");
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69466);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_9() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_219ukcs1hln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69467,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_219ukcs1hln() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69467);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69468);JSONScanner lexer = new JSONScanner("new\na");
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69469);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_10() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jwvacm1hlq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69470,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jwvacm1hlq() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69470);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69471);JSONScanner lexer = new JSONScanner("new\ra");
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69472);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_11() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gnvbk51hlt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69473,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gnvbk51hlt() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69473);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69474);JSONScanner lexer = new JSONScanner("new\ta");
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69475);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_12() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2devcro1hlw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69476,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2devcro1hlw() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69476);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69477);JSONScanner lexer = new JSONScanner("new\fa");
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69478);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_13() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a5vdz71hlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69479,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a5vdz71hlz() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69479);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69480);JSONScanner lexer = new JSONScanner("new\ba");
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69481);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_14() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26wvf6q1hm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26wvf6q1hm2() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69482);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69483);JSONScanner lexer = new JSONScanner("new}");
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69484);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}

    public void test_scan_new_15() throws Exception {__CLR4_5_21hk81hk8lusyjtps.R.globalSliceStart(getClass().getName(),69485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23nvge91hm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hk81hk8lusyjtps.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hk81hk8lusyjtps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69485,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23nvge91hm5() throws Exception{try{__CLR4_5_21hk81hk8lusyjtps.R.inc(69485);
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69486);JSONScanner lexer = new JSONScanner("new]");
        __CLR4_5_21hk81hk8lusyjtps.R.inc(69487);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hk81hk8lusyjtps.R.flushNeeded();}}
}
