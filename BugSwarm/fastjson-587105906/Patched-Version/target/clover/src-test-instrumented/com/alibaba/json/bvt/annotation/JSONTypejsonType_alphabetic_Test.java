/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.annotation;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;

public class JSONTypejsonType_alphabetic_Test extends TestCase {static class __CLR4_5_2108e108elusyjqnl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,46996,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_alphabetic_true() throws Exception {__CLR4_5_2108e108elusyjqnl.R.globalSliceStart(getClass().getName(),46958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vl2sqi108e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2108e108elusyjqnl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2108e108elusyjqnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.annotation.JSONTypejsonType_alphabetic_Test.test_alphabetic_true",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46958,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vl2sqi108e() throws Exception{try{__CLR4_5_2108e108elusyjqnl.R.inc(46958);
        __CLR4_5_2108e108elusyjqnl.R.inc(46959);A a = new A();
        __CLR4_5_2108e108elusyjqnl.R.inc(46960);a.setF0(101);
        __CLR4_5_2108e108elusyjqnl.R.inc(46961);a.setF1(102);

        __CLR4_5_2108e108elusyjqnl.R.inc(46962);Assert.assertEquals("{\"f0\":101,\"f1\":102}", JSON.toJSONString(a));
    }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

//    public void test_alphabetic_false() throws Exception {
//        B b = new B();
//        b.setF0(101);
//        b.setF1(102);
//
//        Assert.assertFalse("{\"f2\":0,\"f1\":102,\"f0\":101}".equals(JSON.toJSONString(b)));
//    }

    public void test_alphabetic_notSet() throws Exception {__CLR4_5_2108e108elusyjqnl.R.globalSliceStart(getClass().getName(),46963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2djl8yj108j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2108e108elusyjqnl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2108e108elusyjqnl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.annotation.JSONTypejsonType_alphabetic_Test.test_alphabetic_notSet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46963,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2djl8yj108j() throws Exception{try{__CLR4_5_2108e108elusyjqnl.R.inc(46963);
        __CLR4_5_2108e108elusyjqnl.R.inc(46964);C c = new C();
        __CLR4_5_2108e108elusyjqnl.R.inc(46965);c.setF0(101);
        __CLR4_5_2108e108elusyjqnl.R.inc(46966);c.setF1(102);

        __CLR4_5_2108e108elusyjqnl.R.inc(46967);Assert.assertEquals("{\"f0\":101,\"f1\":102}", JSON.toJSONString(c));
    }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

    @JSONType(alphabetic = true)
    public static class A {

        private int f1;
        private int f0;

        public int getF1() {try{__CLR4_5_2108e108elusyjqnl.R.inc(46968);
            __CLR4_5_2108e108elusyjqnl.R.inc(46969);return f1;
        }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

        public void setF1(int f1) {try{__CLR4_5_2108e108elusyjqnl.R.inc(46970);
            __CLR4_5_2108e108elusyjqnl.R.inc(46971);this.f1 = f1;
        }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

        public int getF0() {try{__CLR4_5_2108e108elusyjqnl.R.inc(46972);
            __CLR4_5_2108e108elusyjqnl.R.inc(46973);return f0;
        }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

        public void setF0(int f0) {try{__CLR4_5_2108e108elusyjqnl.R.inc(46974);
            __CLR4_5_2108e108elusyjqnl.R.inc(46975);this.f0 = f0;
        }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

    }

    @JSONType(alphabetic = false)
    public static class B {

        private int f2;
        private int f1;
        private int f0;

        public int getF2() {try{__CLR4_5_2108e108elusyjqnl.R.inc(46976);
            __CLR4_5_2108e108elusyjqnl.R.inc(46977);return f2;
        }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

        public void setF2(int f2) {try{__CLR4_5_2108e108elusyjqnl.R.inc(46978);
            __CLR4_5_2108e108elusyjqnl.R.inc(46979);this.f2 = f2;
        }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

        public int getF1() {try{__CLR4_5_2108e108elusyjqnl.R.inc(46980);
            __CLR4_5_2108e108elusyjqnl.R.inc(46981);return f1;
        }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

        public void setF1(int f1) {try{__CLR4_5_2108e108elusyjqnl.R.inc(46982);
            __CLR4_5_2108e108elusyjqnl.R.inc(46983);this.f1 = f1;
        }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

        public int getF0() {try{__CLR4_5_2108e108elusyjqnl.R.inc(46984);
            __CLR4_5_2108e108elusyjqnl.R.inc(46985);return f0;
        }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

        public void setF0(int f0) {try{__CLR4_5_2108e108elusyjqnl.R.inc(46986);
            __CLR4_5_2108e108elusyjqnl.R.inc(46987);this.f0 = f0;
        }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

    }

    public static class C {

        private int f1;
        private int f0;

        public int getF1() {try{__CLR4_5_2108e108elusyjqnl.R.inc(46988);
            __CLR4_5_2108e108elusyjqnl.R.inc(46989);return f1;
        }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

        public void setF1(int f1) {try{__CLR4_5_2108e108elusyjqnl.R.inc(46990);
            __CLR4_5_2108e108elusyjqnl.R.inc(46991);this.f1 = f1;
        }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

        public int getF0() {try{__CLR4_5_2108e108elusyjqnl.R.inc(46992);
            __CLR4_5_2108e108elusyjqnl.R.inc(46993);return f0;
        }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

        public void setF0(int f0) {try{__CLR4_5_2108e108elusyjqnl.R.inc(46994);
            __CLR4_5_2108e108elusyjqnl.R.inc(46995);this.f0 = f0;
        }finally{__CLR4_5_2108e108elusyjqnl.R.flushNeeded();}}

    }
}
