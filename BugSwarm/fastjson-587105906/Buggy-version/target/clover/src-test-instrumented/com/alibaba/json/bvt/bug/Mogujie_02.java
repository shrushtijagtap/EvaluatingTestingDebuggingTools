/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

/**
 * Created by wenshao on 16/03/2017.
 */
public class Mogujie_02 extends TestCase {static class __CLR4_1_1017w117w1lusqk7co{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,56883,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_1017w117w1lusqk7co.R.globalSliceStart(getClass().getName(),56881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb17w1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017w117w1lusqk7co.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017w117w1lusqk7co.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Mogujie_02.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56881,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb17w1() throws Exception{try{__CLR4_1_1017w117w1lusqk7co.R.inc(56881);
        __CLR4_1_1017w117w1lusqk7co.R.inc(56882);JSON.parseObject("{}", Model.class);


    }finally{__CLR4_1_1017w117w1lusqk7co.R.flushNeeded();}}
    public static class Model {
        public int f0;
        public int f1;
        public int f2;
        public int f3;
        public int f4;
        public int f5;
        public int f6;
        public int f7;
        public int f8;
        public int f9;
        public int f10;
        public int f11;
        public int f12;
        public int f13;
        public int f14;
        public int f15;
        public int f16;
        public int f17;
        public int f18;
        public int f19;
        public int f20;
        public int f21;
        public int f22;
        public int f23;
        public int f24;
        public int f25;
        public int f26;
        public int f27;
        public int f28;
        public int f29;
        public int f30;
        public int f31;
        public int f32;
        public int f33;
        public int f34;
        public int f35;
        public int f36;
        public int f37;
        public int f38;
        public int f39;
        public int f40;
        public int f41;
        public int f42;
        public int f43;
        public int f44;
        public int f45;
        public int f46;
        public int f47;
        public int f48;
        public int f49;
        public int f50;
        public int f51;
        public int f52;
        public int f53;
        public int f54;
        public int f55;
        public int f56;
        public int f57;
        public int f58;
        public int f59;
        public int f60;
        public int f61;
        public int f62;
        public int f63;
    }

}
