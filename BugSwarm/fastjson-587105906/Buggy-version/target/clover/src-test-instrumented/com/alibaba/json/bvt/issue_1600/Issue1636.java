/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1600;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

public class Issue1636 extends TestCase {static class __CLR4_1_101cyi1cyiluszwb3h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,63460,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue_1() throws Exception {__CLR4_1_101cyi1cyiluszwb3h.R.globalSliceStart(getClass().getName(),63450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhstn51cyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101cyi1cyiluszwb3h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101cyi1cyiluszwb3h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1600.Issue1636.test_for_issue_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63450,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhstn51cyi() throws Exception{try{__CLR4_1_101cyi1cyiluszwb3h.R.inc(63450);
        __CLR4_1_101cyi1cyiluszwb3h.R.inc(63451);Item1 item = JSON.parseObject("{\"modelId\":1001}", Item1.class);
        __CLR4_1_101cyi1cyiluszwb3h.R.inc(63452);assertEquals(1001, item.modelId);
    }finally{__CLR4_1_101cyi1cyiluszwb3h.R.flushNeeded();}}

    public void test_for_issue_2() throws Exception {__CLR4_1_101cyi1cyiluszwb3h.R.globalSliceStart(getClass().getName(),63453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r8suuo1cyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101cyi1cyiluszwb3h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101cyi1cyiluszwb3h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1600.Issue1636.test_for_issue_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63453,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r8suuo1cyl() throws Exception{try{__CLR4_1_101cyi1cyiluszwb3h.R.inc(63453);
        __CLR4_1_101cyi1cyiluszwb3h.R.inc(63454);Item2 item = JSON.parseObject("{\"modelId\":1001}", Item2.class);
        __CLR4_1_101cyi1cyiluszwb3h.R.inc(63455);assertEquals(1001, item.modelId);
    }finally{__CLR4_1_101cyi1cyiluszwb3h.R.flushNeeded();}}

    public static class Item1 {
        @JSONField
        private int modelId;

        @JSONCreator
        public Item1(@JSONField int modelId){try{__CLR4_1_101cyi1cyiluszwb3h.R.inc(63456);
            // \u8fd9\u91cc\u4e3a\u96f6
            __CLR4_1_101cyi1cyiluszwb3h.R.inc(63457);this.modelId=modelId;
        }finally{__CLR4_1_101cyi1cyiluszwb3h.R.flushNeeded();}}
    }

    public static class Item2 {
        private int modelId;

        @JSONCreator
        public Item2(int modelId){try{__CLR4_1_101cyi1cyiluszwb3h.R.inc(63458);
            // \u8fd9\u91cc\u4e3a\u96f6
            __CLR4_1_101cyi1cyiluszwb3h.R.inc(63459);this.modelId=modelId;
        }finally{__CLR4_1_101cyi1cyiluszwb3h.R.flushNeeded();}}
    }
}
