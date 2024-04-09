/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class ParseRestTest extends TestCase {static class __CLR4_5_21j9s1j9slusvndiv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,71655,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_parseRest_0() throws Exception {__CLR4_5_21j9s1j9slusvndiv.R.globalSliceStart(getClass().getName(),71632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kxapjm1j9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j9s1j9slusvndiv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j9s1j9slusvndiv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.ParseRestTest.test_parseRest_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71632,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kxapjm1j9s() throws Exception{try{__CLR4_5_21j9s1j9slusvndiv.R.inc(71632);
        __CLR4_5_21j9s1j9slusvndiv.R.inc(71633);String text = "{\"f3\":333,\"f2\":222}";
        __CLR4_5_21j9s1j9slusvndiv.R.inc(71634);Entity entity = JSON.parseObject(text, Entity.class);
        __CLR4_5_21j9s1j9slusvndiv.R.inc(71635);Assert.assertEquals(0, entity.getF0());
        __CLR4_5_21j9s1j9slusvndiv.R.inc(71636);Assert.assertEquals(0, entity.getF1());
        __CLR4_5_21j9s1j9slusvndiv.R.inc(71637);Assert.assertEquals(222, entity.getF2());
        __CLR4_5_21j9s1j9slusvndiv.R.inc(71638);Assert.assertEquals(333, entity.getF3());
    }finally{__CLR4_5_21j9s1j9slusvndiv.R.flushNeeded();}}

    public static class Entity {

        private int f0;
        private int f1;
        private int f2;
        private int f3;

        public int getF0() {try{__CLR4_5_21j9s1j9slusvndiv.R.inc(71639);
            __CLR4_5_21j9s1j9slusvndiv.R.inc(71640);return f0;
        }finally{__CLR4_5_21j9s1j9slusvndiv.R.flushNeeded();}}

        public void setF0(int f0) {try{__CLR4_5_21j9s1j9slusvndiv.R.inc(71641);
            __CLR4_5_21j9s1j9slusvndiv.R.inc(71642);this.f0 = f0;
        }finally{__CLR4_5_21j9s1j9slusvndiv.R.flushNeeded();}}

        public int getF1() {try{__CLR4_5_21j9s1j9slusvndiv.R.inc(71643);
            __CLR4_5_21j9s1j9slusvndiv.R.inc(71644);return f1;
        }finally{__CLR4_5_21j9s1j9slusvndiv.R.flushNeeded();}}

        public void setF1(int f1) {try{__CLR4_5_21j9s1j9slusvndiv.R.inc(71645);
            __CLR4_5_21j9s1j9slusvndiv.R.inc(71646);this.f1 = f1;
        }finally{__CLR4_5_21j9s1j9slusvndiv.R.flushNeeded();}}

        public int getF2() {try{__CLR4_5_21j9s1j9slusvndiv.R.inc(71647);
            __CLR4_5_21j9s1j9slusvndiv.R.inc(71648);return f2;
        }finally{__CLR4_5_21j9s1j9slusvndiv.R.flushNeeded();}}

        public void setF2(int f2) {try{__CLR4_5_21j9s1j9slusvndiv.R.inc(71649);
            __CLR4_5_21j9s1j9slusvndiv.R.inc(71650);this.f2 = f2;
        }finally{__CLR4_5_21j9s1j9slusvndiv.R.flushNeeded();}}

        public int getF3() {try{__CLR4_5_21j9s1j9slusvndiv.R.inc(71651);
            __CLR4_5_21j9s1j9slusvndiv.R.inc(71652);return f3;
        }finally{__CLR4_5_21j9s1j9slusvndiv.R.flushNeeded();}}

        public void setF3(int f3) {try{__CLR4_5_21j9s1j9slusvndiv.R.inc(71653);
            __CLR4_5_21j9s1j9slusvndiv.R.inc(71654);this.f3 = f3;
        }finally{__CLR4_5_21j9s1j9slusvndiv.R.flushNeeded();}}

    }
}
