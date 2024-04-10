/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;

/**
 * \u6d4b\u8bd5\u5b57\u7b26':'\u7684\u5904\u7406
 * 
 * @author wenshao[szujobs@hotmail.com]
 */
public class JSONScannerTest_colon extends TestCase {static class __CLR4_5_21hct1hctlusyjtpb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,69192,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21hct1hctlusyjtpb.R.globalSliceStart(getClass().getName(),69149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21hct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hct1hctlusyjtpb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hct1hctlusyjtpb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69149,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21hct() throws Exception{try{__CLR4_5_21hct1hctlusyjtpb.R.inc(69149);
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69150);JSONScanner lexer = new JSONScanner(":true");
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69151);lexer.nextTokenWithColon();
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69152);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_5_21hct1hctlusyjtpb.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21hct1hctlusyjtpb.R.globalSliceStart(getClass().getName(),69153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1hcx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hct1hctlusyjtpb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hct1hctlusyjtpb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1hcx() throws Exception{try{__CLR4_5_21hct1hctlusyjtpb.R.inc(69153);
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69154);JSONScanner lexer = new JSONScanner(" : true");
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69155);lexer.nextTokenWithColon();
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69156);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_5_21hct1hctlusyjtpb.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21hct1hctlusyjtpb.R.globalSliceStart(getClass().getName(),69157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441hd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hct1hctlusyjtpb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hct1hctlusyjtpb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69157,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441hd1() throws Exception{try{__CLR4_5_21hct1hctlusyjtpb.R.inc(69157);
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69158);JSONScanner lexer = new JSONScanner("\n:\ntrue");
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69159);lexer.nextTokenWithColon();
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69160);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_5_21hct1hctlusyjtpb.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21hct1hctlusyjtpb.R.globalSliceStart(getClass().getName(),69161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1hd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hct1hctlusyjtpb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hct1hctlusyjtpb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69161,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1hd5() throws Exception{try{__CLR4_5_21hct1hctlusyjtpb.R.inc(69161);
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69162);JSONScanner lexer = new JSONScanner("\r:\rtrue");
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69163);lexer.nextTokenWithColon();
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69164);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_5_21hct1hctlusyjtpb.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21hct1hctlusyjtpb.R.globalSliceStart(getClass().getName(),69165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61hd9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hct1hctlusyjtpb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hct1hctlusyjtpb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69165,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61hd9() throws Exception{try{__CLR4_5_21hct1hctlusyjtpb.R.inc(69165);
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69166);JSONScanner lexer = new JSONScanner("\t:\ttrue");
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69167);lexer.nextTokenWithColon();
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69168);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_5_21hct1hctlusyjtpb.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21hct1hctlusyjtpb.R.globalSliceStart(getClass().getName(),69169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1hdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hct1hctlusyjtpb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hct1hctlusyjtpb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1hdd() throws Exception{try{__CLR4_5_21hct1hctlusyjtpb.R.inc(69169);
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69170);JSONScanner lexer = new JSONScanner("\t:\ftrue");
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69171);lexer.nextTokenWithColon();
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69172);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_5_21hct1hctlusyjtpb.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21hct1hctlusyjtpb.R.globalSliceStart(getClass().getName(),69173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81hdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hct1hctlusyjtpb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hct1hctlusyjtpb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69173,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81hdh() throws Exception{try{__CLR4_5_21hct1hctlusyjtpb.R.inc(69173);
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69174);JSONScanner lexer = new JSONScanner("\b:\btrue");
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69175);lexer.nextTokenWithColon();
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69176);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_5_21hct1hctlusyjtpb.R.flushNeeded();}}

    public void test_f() throws Exception {__CLR4_5_21hct1hctlusyjtpb.R.globalSliceStart(getClass().getName(),69177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aaml281hdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hct1hctlusyjtpb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hct1hctlusyjtpb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_f",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69177,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aaml281hdl() throws Exception{try{__CLR4_5_21hct1hctlusyjtpb.R.inc(69177);
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69178);JSONScanner lexer = new JSONScanner("\f:\btrue");
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69179);lexer.nextTokenWithColon();
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69180);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_5_21hct1hctlusyjtpb.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21hct1hctlusyjtpb.R.globalSliceStart(getClass().getName(),69181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1hdp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hct1hctlusyjtpb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hct1hctlusyjtpb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69181,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1hdp() throws Exception{try{__CLR4_5_21hct1hctlusyjtpb.R.inc(69181);
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69182);JSONException error = null;
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69183);try {
            __CLR4_5_21hct1hctlusyjtpb.R.inc(69184);JSONScanner lexer = new JSONScanner("true");
            __CLR4_5_21hct1hctlusyjtpb.R.inc(69185);lexer.nextTokenWithColon();
        } catch (JSONException e) {
            __CLR4_5_21hct1hctlusyjtpb.R.inc(69186);error = e;
        }
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69187);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hct1hctlusyjtpb.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21hct1hctlusyjtpb.R.globalSliceStart(getClass().getName(),69188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1hdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hct1hctlusyjtpb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hct1hctlusyjtpb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69188,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1hdw() throws Exception{try{__CLR4_5_21hct1hctlusyjtpb.R.inc(69188);
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69189);JSONScanner lexer = new JSONScanner("\b:\btrue");
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69190);lexer.nextToken();
        __CLR4_5_21hct1hctlusyjtpb.R.inc(69191);Assert.assertEquals(JSONToken.COLON, lexer.token());
    }finally{__CLR4_5_21hct1hctlusyjtpb.R.flushNeeded();}}
}
