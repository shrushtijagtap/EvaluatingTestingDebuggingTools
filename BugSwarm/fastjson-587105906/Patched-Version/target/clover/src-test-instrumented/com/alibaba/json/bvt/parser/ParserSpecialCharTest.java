/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class ParserSpecialCharTest extends TestCase {static class __CLR4_5_21ic71ic7lusyjtsc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,70463,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21ic7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70423,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21ic7() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70423);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70424);Assert.assertEquals("\0", JSON.parseObject("{\"value\":\"\\0\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1ic9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70425,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1ic9() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70425);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70426);Assert.assertEquals("\1", JSON.parseObject("{\"value\":\"\\1\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441icb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441icb() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70427);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70428);Assert.assertEquals("\2", JSON.parseObject("{\"value\":\"\\2\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_3() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1icd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70429,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1icd() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70429);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70430);Assert.assertEquals("\3", JSON.parseObject("{\"value\":\"\\3\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_4() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61icf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70431,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61icf() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70431);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70432);Assert.assertEquals("\4", JSON.parseObject("{\"value\":\"\\4\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_5() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1ich();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70433,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1ich() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70433);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70434);Assert.assertEquals("\5", JSON.parseObject("{\"value\":\"\\5\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_6() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81icj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70435,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81icj() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70435);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70436);Assert.assertEquals("\6", JSON.parseObject("{\"value\":\"\\6\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_7() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1icl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70437,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1icl() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70437);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70438);Assert.assertEquals("\7", JSON.parseObject("{\"value\":\"\\7\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_8() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1icn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70439,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1icn() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70439);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70440);Assert.assertEquals("\b", JSON.parseObject("{\"value\":\"\\b\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_9() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71icp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70441,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71icp() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70441);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70442);Assert.assertEquals("\t", JSON.parseObject("{\"value\":\"\\t\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_10() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1icr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70443,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1icr() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70443);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70444);Assert.assertEquals("\n", JSON.parseObject("{\"value\":\"\\n\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_11() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1ict();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70445,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1ict() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70445);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70446);Assert.assertEquals("", JSON.parseObject("{\"value\":\"\\v\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_12() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1icv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70447,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1icv() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70447);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70448);Assert.assertEquals("\f", JSON.parseObject("{\"value\":\"\\f\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_13() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22comui1icx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70449,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22comui1icx() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70449);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70450);Assert.assertEquals("\r", JSON.parseObject("{\"value\":\"\\r\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_34() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ap2wy31icz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_34",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70451,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ap2wy31icz() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70451);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70452);Assert.assertEquals("\"", JSON.parseObject("{\"value\":\"\\\"\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_39() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25jwx0a1id1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_39",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70453,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25jwx0a1id1() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70453);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70454);Assert.assertEquals("'", JSON.parseObject("{\"value\":\"\\'\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_47() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2srrvyv1id3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_47",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2srrvyv1id3() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70455);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70456);Assert.assertEquals("/", JSON.parseObject("{\"value\":\"\\/\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    
    public void test_92() throws Exception {__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceStart(getClass().getName(),70457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j1ugrx1id5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic71ic7lusyjtsc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic71ic7lusyjtsc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_92",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j1ugrx1id5() throws Exception{try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70457);
        __CLR4_5_21ic71ic7lusyjtsc.R.inc(70458);Assert.assertEquals("\\", JSON.parseObject("{\"value\":\"\\\\\"}", VO.class).getValue());
    }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}
    public static class VO {

        private String value;

        public String getValue() {try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70459);
            __CLR4_5_21ic71ic7lusyjtsc.R.inc(70460);return value;
        }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_5_21ic71ic7lusyjtsc.R.inc(70461);
            __CLR4_5_21ic71ic7lusyjtsc.R.inc(70462);this.value = value;
        }finally{__CLR4_5_21ic71ic7lusyjtsc.R.flushNeeded();}}

    }
}
