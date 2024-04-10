/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class Bug_for_issue_426 extends TestCase {static class __CLR4_5_214fq14fqlusyjrmx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,52422,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_214fq14fqlusyjrmx.R.globalSliceStart(getClass().getName(),52406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb14fq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214fq14fqlusyjrmx.R.rethrow($CLV_t2$);}finally{__CLR4_5_214fq14fqlusyjrmx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_426.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52406,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb14fq() throws Exception{try{__CLR4_5_214fq14fqlusyjrmx.R.inc(52406);
        __CLR4_5_214fq14fqlusyjrmx.R.inc(52407);String text = "{value:\"264,010,000.00\"}";
        __CLR4_5_214fq14fqlusyjrmx.R.inc(52408);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_214fq14fqlusyjrmx.R.inc(52409);Assert.assertTrue(264010000.00D == model.value);
    }finally{__CLR4_5_214fq14fqlusyjrmx.R.flushNeeded();}}
    
    public void test_for_issue_float() throws Exception {__CLR4_5_214fq14fqlusyjrmx.R.globalSliceStart(getClass().getName(),52410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lduzeu14fu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214fq14fqlusyjrmx.R.rethrow($CLV_t2$);}finally{__CLR4_5_214fq14fqlusyjrmx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_426.test_for_issue_float",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52410,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lduzeu14fu() throws Exception{try{__CLR4_5_214fq14fqlusyjrmx.R.inc(52410);
        __CLR4_5_214fq14fqlusyjrmx.R.inc(52411);String text = "{value:\"264,010,000\"}";
        __CLR4_5_214fq14fqlusyjrmx.R.inc(52412);ModelFloat model = JSON.parseObject(text, ModelFloat.class);
        __CLR4_5_214fq14fqlusyjrmx.R.inc(52413);Assert.assertTrue(264010000F == model.value);
    }finally{__CLR4_5_214fq14fqlusyjrmx.R.flushNeeded();}}
    
    public void test_for_issue_int() throws Exception {__CLR4_5_214fq14fqlusyjrmx.R.globalSliceStart(getClass().getName(),52414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ai1uel14fy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214fq14fqlusyjrmx.R.rethrow($CLV_t2$);}finally{__CLR4_5_214fq14fqlusyjrmx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_426.test_for_issue_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52414,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ai1uel14fy() throws Exception{try{__CLR4_5_214fq14fqlusyjrmx.R.inc(52414);
        __CLR4_5_214fq14fqlusyjrmx.R.inc(52415);String text = "{value:\"264,010,000\"}";
        __CLR4_5_214fq14fqlusyjrmx.R.inc(52416);ModelInt model = JSON.parseObject(text, ModelInt.class);
        __CLR4_5_214fq14fqlusyjrmx.R.inc(52417);Assert.assertTrue(264010000D == model.value);
    }finally{__CLR4_5_214fq14fqlusyjrmx.R.flushNeeded();}}
    
    
    public void test_for_issue_long() throws Exception {__CLR4_5_214fq14fqlusyjrmx.R.globalSliceStart(getClass().getName(),52418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jjh6q414g2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214fq14fqlusyjrmx.R.rethrow($CLV_t2$);}finally{__CLR4_5_214fq14fqlusyjrmx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_426.test_for_issue_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52418,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jjh6q414g2() throws Exception{try{__CLR4_5_214fq14fqlusyjrmx.R.inc(52418);
        __CLR4_5_214fq14fqlusyjrmx.R.inc(52419);String text = "{value:\"264,010,000\"}";
        __CLR4_5_214fq14fqlusyjrmx.R.inc(52420);ModelLong model = JSON.parseObject(text, ModelLong.class);
        __CLR4_5_214fq14fqlusyjrmx.R.inc(52421);Assert.assertTrue(264010000D == model.value);
    }finally{__CLR4_5_214fq14fqlusyjrmx.R.flushNeeded();}}

    public static class Model {
        public double value;
    }
    
    public static class ModelFloat {
        public float value;
    }
    
    public static class ModelInt {
        public int value;
    }
    
    public static class ModelLong {
        public long value;
    }
}
