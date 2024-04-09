/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class ParserSpecialCharTest extends TestCase {static class __CLR4_5_21jaf1jaflusvndj2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,71695,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21jaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71655,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21jaf() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71655);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71656);Assert.assertEquals("\0", JSON.parseObject("{\"value\":\"\\0\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1jah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71657,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1jah() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71657);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71658);Assert.assertEquals("\1", JSON.parseObject("{\"value\":\"\\1\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441jaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71659,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441jaj() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71659);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71660);Assert.assertEquals("\2", JSON.parseObject("{\"value\":\"\\2\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_3() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1jal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71661,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1jal() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71661);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71662);Assert.assertEquals("\3", JSON.parseObject("{\"value\":\"\\3\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_4() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61jan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71663,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61jan() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71663);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71664);Assert.assertEquals("\4", JSON.parseObject("{\"value\":\"\\4\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_5() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1jap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71665,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1jap() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71665);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71666);Assert.assertEquals("\5", JSON.parseObject("{\"value\":\"\\5\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_6() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81jar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71667,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81jar() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71667);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71668);Assert.assertEquals("\6", JSON.parseObject("{\"value\":\"\\6\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_7() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1jat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1jat() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71669);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71670);Assert.assertEquals("\7", JSON.parseObject("{\"value\":\"\\7\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_8() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1jav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71671,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1jav() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71671);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71672);Assert.assertEquals("\b", JSON.parseObject("{\"value\":\"\\b\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_9() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71jax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71673,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71jax() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71673);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71674);Assert.assertEquals("\t", JSON.parseObject("{\"value\":\"\\t\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_10() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1jaz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71675,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1jaz() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71675);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71676);Assert.assertEquals("\n", JSON.parseObject("{\"value\":\"\\n\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_11() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1jb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71677,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1jb1() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71677);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71678);Assert.assertEquals("", JSON.parseObject("{\"value\":\"\\v\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_12() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1jb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71679,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1jb3() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71679);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71680);Assert.assertEquals("\f", JSON.parseObject("{\"value\":\"\\f\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_13() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22comui1jb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71681,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22comui1jb5() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71681);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71682);Assert.assertEquals("\r", JSON.parseObject("{\"value\":\"\\r\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_34() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ap2wy31jb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_34",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71683,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ap2wy31jb7() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71683);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71684);Assert.assertEquals("\"", JSON.parseObject("{\"value\":\"\\\"\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_39() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25jwx0a1jb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_39",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71685,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25jwx0a1jb9() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71685);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71686);Assert.assertEquals("'", JSON.parseObject("{\"value\":\"\\'\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_47() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2srrvyv1jbb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_47",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71687,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2srrvyv1jbb() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71687);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71688);Assert.assertEquals("/", JSON.parseObject("{\"value\":\"\\/\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    
    public void test_92() throws Exception {__CLR4_5_21jaf1jaflusvndj2.R.globalSliceStart(getClass().getName(),71689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j1ugrx1jbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jaf1jaflusvndj2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jaf1jaflusvndj2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParserSpecialCharTest.test_92",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71689,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j1ugrx1jbd() throws Exception{try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71689);
        __CLR4_5_21jaf1jaflusvndj2.R.inc(71690);Assert.assertEquals("\\", JSON.parseObject("{\"value\":\"\\\\\"}", VO.class).getValue());
    }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}
    public static class VO {

        private String value;

        public String getValue() {try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71691);
            __CLR4_5_21jaf1jaflusvndj2.R.inc(71692);return value;
        }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_5_21jaf1jaflusvndj2.R.inc(71693);
            __CLR4_5_21jaf1jaflusvndj2.R.inc(71694);this.value = value;
        }finally{__CLR4_5_21jaf1jaflusvndj2.R.flushNeeded();}}

    }
}
