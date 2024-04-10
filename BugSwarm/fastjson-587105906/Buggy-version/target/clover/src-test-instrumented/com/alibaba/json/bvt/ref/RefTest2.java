/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.ref;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class RefTest2 extends TestCase {static class __CLR4_1_101r6i1r6iluszwer3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,81910,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_ref() throws Exception {__CLR4_1_101r6i1r6iluszwer3.R.globalSliceStart(getClass().getName(),81882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105mo1031r6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101r6i1r6iluszwer3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101r6i1r6iluszwer3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_ref",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81882,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105mo1031r6i() throws Exception{try{__CLR4_1_101r6i1r6iluszwer3.R.inc(81882);
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81883);Object[] array = new Object[1];
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81884);array[0] = array;
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81885);Assert.assertEquals("[{\"$ref\":\"@\"}]", JSON.toJSONString(array));
    }finally{__CLR4_1_101r6i1r6iluszwer3.R.flushNeeded();}}

    public void test_ref_1() throws Exception {__CLR4_1_101r6i1r6iluszwer3.R.globalSliceStart(getClass().getName(),81886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107k2ash1r6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101r6i1r6iluszwer3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101r6i1r6iluszwer3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_ref_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81886,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107k2ash1r6m() throws Exception{try{__CLR4_1_101r6i1r6iluszwer3.R.inc(81886);
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81887);Object[] array = new Object[3];
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81888);array[0] = array;
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81889);array[1] = new Object();
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81890);array[2] = new Object();
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81891);Assert.assertEquals("[{\"$ref\":\"@\"},{},{}]", JSON.toJSONString(array));
    }finally{__CLR4_1_101r6i1r6iluszwer3.R.flushNeeded();}}

    public void test_ref_2() throws Exception {__CLR4_1_101r6i1r6iluszwer3.R.globalSliceStart(getClass().getName(),81892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104b2c001r6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101r6i1r6iluszwer3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101r6i1r6iluszwer3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_ref_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81892,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104b2c001r6s() throws Exception{try{__CLR4_1_101r6i1r6iluszwer3.R.inc(81892);
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81893);Object[] array = new Object[3];
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81894);array[0] = new Object();
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81895);array[1] = array;
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81896);array[2] = new Object();
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81897);Assert.assertEquals("[{},{\"$ref\":\"@\"},{}]", JSON.toJSONString(array));
    }finally{__CLR4_1_101r6i1r6iluszwer3.R.flushNeeded();}}

    public void test_ref_3() throws Exception {__CLR4_1_101r6i1r6iluszwer3.R.globalSliceStart(getClass().getName(),81898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10122d7j1r6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101r6i1r6iluszwer3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101r6i1r6iluszwer3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_ref_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81898,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10122d7j1r6y() throws Exception{try{__CLR4_1_101r6i1r6iluszwer3.R.inc(81898);
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81899);Object[] array = new Object[3];
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81900);array[0] = new Object();
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81901);array[1] = new Object();
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81902);array[2] = array;
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81903);Assert.assertEquals("[{},{},{\"$ref\":\"@\"}]", JSON.toJSONString(array));
    }finally{__CLR4_1_101r6i1r6iluszwer3.R.flushNeeded();}}

    public void test_parse() throws Exception {__CLR4_1_101r6i1r6iluszwer3.R.globalSliceStart(getClass().getName(),81904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g914tv1r74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101r6i1r6iluszwer3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101r6i1r6iluszwer3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_parse",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81904,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g914tv1r74() throws Exception{try{__CLR4_1_101r6i1r6iluszwer3.R.inc(81904);
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81905);Object[] array2 = JSON.parseObject("[{\"$ref\":\"$\"}]", Object[].class);
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81906);Assert.assertSame(array2, array2[0]);
    }finally{__CLR4_1_101r6i1r6iluszwer3.R.flushNeeded();}}

    public void test_parse_1() throws Exception {__CLR4_1_101r6i1r6iluszwer3.R.globalSliceStart(getClass().getName(),81907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dwafr31r77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101r6i1r6iluszwer3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101r6i1r6iluszwer3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_parse_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81907,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dwafr31r77() throws Exception{try{__CLR4_1_101r6i1r6iluszwer3.R.inc(81907);
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81908);Object[] array2 = JSON.parseObject("[{\"$ref\":\"@\"}]", Object[].class);
        __CLR4_1_101r6i1r6iluszwer3.R.inc(81909);Assert.assertSame(array2, array2[0]);
    }finally{__CLR4_1_101r6i1r6iluszwer3.R.flushNeeded();}}
}
