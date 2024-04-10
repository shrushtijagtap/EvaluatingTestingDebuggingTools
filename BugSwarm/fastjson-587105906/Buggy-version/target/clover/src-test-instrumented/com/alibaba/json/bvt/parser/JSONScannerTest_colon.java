/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

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
public class JSONScannerTest_colon extends TestCase {static class __CLR4_1_101ibc1ibcluszwcks{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,70435,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101ibc1ibcluszwcks.R.globalSliceStart(getClass().getName(),70392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21ibc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ibc1ibcluszwcks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ibc1ibcluszwcks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70392,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21ibc() throws Exception{try{__CLR4_1_101ibc1ibcluszwcks.R.inc(70392);
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70393);JSONScanner lexer = new JSONScanner(":true");
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70394);lexer.nextTokenWithColon();
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70395);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_1_101ibc1ibcluszwcks.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101ibc1ibcluszwcks.R.globalSliceStart(getClass().getName(),70396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1ibg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ibc1ibcluszwcks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ibc1ibcluszwcks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70396,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1ibg() throws Exception{try{__CLR4_1_101ibc1ibcluszwcks.R.inc(70396);
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70397);JSONScanner lexer = new JSONScanner(" : true");
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70398);lexer.nextTokenWithColon();
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70399);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_1_101ibc1ibcluszwcks.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101ibc1ibcluszwcks.R.globalSliceStart(getClass().getName(),70400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441ibk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ibc1ibcluszwcks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ibc1ibcluszwcks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70400,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441ibk() throws Exception{try{__CLR4_1_101ibc1ibcluszwcks.R.inc(70400);
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70401);JSONScanner lexer = new JSONScanner("\n:\ntrue");
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70402);lexer.nextTokenWithColon();
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70403);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_1_101ibc1ibcluszwcks.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101ibc1ibcluszwcks.R.globalSliceStart(getClass().getName(),70404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1ibo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ibc1ibcluszwcks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ibc1ibcluszwcks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70404,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1ibo() throws Exception{try{__CLR4_1_101ibc1ibcluszwcks.R.inc(70404);
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70405);JSONScanner lexer = new JSONScanner("\r:\rtrue");
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70406);lexer.nextTokenWithColon();
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70407);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_1_101ibc1ibcluszwcks.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101ibc1ibcluszwcks.R.globalSliceStart(getClass().getName(),70408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61ibs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ibc1ibcluszwcks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ibc1ibcluszwcks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70408,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61ibs() throws Exception{try{__CLR4_1_101ibc1ibcluszwcks.R.inc(70408);
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70409);JSONScanner lexer = new JSONScanner("\t:\ttrue");
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70410);lexer.nextTokenWithColon();
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70411);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_1_101ibc1ibcluszwcks.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101ibc1ibcluszwcks.R.globalSliceStart(getClass().getName(),70412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1ibw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ibc1ibcluszwcks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ibc1ibcluszwcks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70412,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1ibw() throws Exception{try{__CLR4_1_101ibc1ibcluszwcks.R.inc(70412);
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70413);JSONScanner lexer = new JSONScanner("\t:\ftrue");
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70414);lexer.nextTokenWithColon();
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70415);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_1_101ibc1ibcluszwcks.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101ibc1ibcluszwcks.R.globalSliceStart(getClass().getName(),70416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81ic0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ibc1ibcluszwcks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ibc1ibcluszwcks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70416,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81ic0() throws Exception{try{__CLR4_1_101ibc1ibcluszwcks.R.inc(70416);
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70417);JSONScanner lexer = new JSONScanner("\b:\btrue");
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70418);lexer.nextTokenWithColon();
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70419);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_1_101ibc1ibcluszwcks.R.flushNeeded();}}

    public void test_f() throws Exception {__CLR4_1_101ibc1ibcluszwcks.R.globalSliceStart(getClass().getName(),70420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aaml281ic4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ibc1ibcluszwcks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ibc1ibcluszwcks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_f",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70420,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aaml281ic4() throws Exception{try{__CLR4_1_101ibc1ibcluszwcks.R.inc(70420);
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70421);JSONScanner lexer = new JSONScanner("\f:\btrue");
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70422);lexer.nextTokenWithColon();
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70423);Assert.assertEquals(JSONToken.TRUE, lexer.token());
    }finally{__CLR4_1_101ibc1ibcluszwcks.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101ibc1ibcluszwcks.R.globalSliceStart(getClass().getName(),70424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1ic8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ibc1ibcluszwcks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ibc1ibcluszwcks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70424,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1ic8() throws Exception{try{__CLR4_1_101ibc1ibcluszwcks.R.inc(70424);
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70425);JSONException error = null;
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70426);try {
            __CLR4_1_101ibc1ibcluszwcks.R.inc(70427);JSONScanner lexer = new JSONScanner("true");
            __CLR4_1_101ibc1ibcluszwcks.R.inc(70428);lexer.nextTokenWithColon();
        } catch (JSONException e) {
            __CLR4_1_101ibc1ibcluszwcks.R.inc(70429);error = e;
        }
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70430);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ibc1ibcluszwcks.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101ibc1ibcluszwcks.R.globalSliceStart(getClass().getName(),70431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1icf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ibc1ibcluszwcks.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ibc1ibcluszwcks.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_colon.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70431,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1icf() throws Exception{try{__CLR4_1_101ibc1ibcluszwcks.R.inc(70431);
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70432);JSONScanner lexer = new JSONScanner("\b:\btrue");
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70433);lexer.nextToken();
        __CLR4_1_101ibc1ibcluszwcks.R.inc(70434);Assert.assertEquals(JSONToken.COLON, lexer.token());
    }finally{__CLR4_1_101ibc1ibcluszwcks.R.flushNeeded();}}
}
